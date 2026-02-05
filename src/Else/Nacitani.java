package Else;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class Nacitani {
    private Prostor aktualniProstor;
    private Inventar batoh;
    private Map<String, Prostor> vsechnyProstory;
    private String uvodniText;

    public void nacitani() {
        batoh = new Inventar();
        this.vsechnyProstory = new HashMap<>();


    }

    /**
     * Metoda načte data z JSON souboru a sestaví herní svět.
     * @param cesta cesta k souboru
     */
    public void nactiZeSouboru(String cesta) throws IOException {
        Gson gson = new Gson();
        try (InputStream is = Nacitani.class.getResourceAsStream(cesta)) {
            if (is == null) {
                throw new RuntimeException("Soubor nebyl nalezen: " + cesta);
            }


            GameData data = gson.fromJson(
                    new InputStreamReader(is, StandardCharsets.UTF_8),
                    GameData.class
            );
            this.uvodniText = data.uvodniText;

            for (ProstorData pData : data.locations) {
                Prostor novy = new Prostor(pData.nazev, pData.popis);

                if (pData.predmety != null) {
                    for (Vec v : pData.predmety) novy.vlozVec(v);
                }

                if (pData.postavy != null) {
                    for (Postava pos : pData.postavy) novy.vlozPostavu(pos);
                }

                vsechnyProstory.put(pData.id, novy);
            }

            for (ProstorData pData : data.locations) {
                Prostor zdroj = vsechnyProstory.get(pData.id);
                for (String cilId : pData.vychody) {
                    Prostor cil = vsechnyProstory.get(cilId);
                    if (cil != null) {
                        zdroj.setVychod(cil);
                    }
                }
            }
        }
    }

    public Prostor getAktualniProstor() {
        return aktualniProstor;
    }
    public Prostor getProstor(String id) {
        return vsechnyProstory.get(id);
    }

    public void setAktualniProstor(Prostor prostor) {
        this.aktualniProstor = prostor;
    }

    public Inventar getBatoh() {
        return batoh;
    }

    public String getUvodniText() {
        return uvodniText;
    }
}
