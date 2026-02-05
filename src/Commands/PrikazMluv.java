package Commands;

import Else.Nacitani;
import Else.Postava;
import Else.Prostor;

public class PrikazMluv implements IPrikaz {
    private Nacitani n;
    private String cil;

    public PrikazMluv(Nacitani n) {
        this.n = n;
    }
    @Override
    public void setPrikaz(String prikaz) {
        this.cil = prikaz;
    }


    @Override
    public String proved() {
        if (cil == null || cil.trim().isEmpty()) {
            return "S kým mám mluvit? Musíš zadat jméno postavy.";
        }

        Prostor aktualni = n.getAktualniProstor();

        Postava postava = aktualni.getPostava(cil);

        if (postava != null) {
            return postava.mluv();
        } else {
            return "Postava '" + cil + "' tu není.";
        }
    }

    @Override
    public String getNazev() { return "mluv"; }


}
