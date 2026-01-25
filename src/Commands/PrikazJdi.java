package Commands;

import Else.Nacitani;
import Else.Prostor;

import java.util.ArrayList;


public class PrikazJdi implements IPrikaz {
    private Nacitani n;

    public PrikazJdi(Nacitani n) {
        this.n = n;
    }
    /**
     * Provede přesun do sousední místnosti.
     * @param parametry název cílové místnosti.
     * @return zpráva pro hráče o výsledku pohybu.
     */
    @Override
    public String proved(ArrayList<String> parametry) {

        if (parametry.isEmpty()) {
            return "Kam mám jít? Musíš zadat název místnosti (např. jdi knihovna).";
        }else {
            for (int i = 0; i < parametry.size(); i++) {
                Prostor aktualni = n.getAktualniProstor();
                Prostor sousedni = aktualni.vratSousedniProstor(parametry.get(i));

                if (sousedni == null) {
                    return "Tam se odsud jít nedá! Zkus jiný směr.";
                } else {
                    n.setAktualniProstor(sousedni);
                    return sousedni.dlouhyPopis();
                }
            }
            return null;
        }





    }

    @Override
    public String getNazev() { return "jdi"; }
}