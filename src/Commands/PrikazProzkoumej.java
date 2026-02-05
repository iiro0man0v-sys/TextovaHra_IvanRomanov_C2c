package Commands;

import Else.Nacitani;

public class PrikazProzkoumej implements IPrikaz {
    private Nacitani n;

    public static boolean prozkoumano = false;

    public PrikazProzkoumej(Nacitani n) {
        this.n = n;
    }


    @Override
    public String proved() {
        prozkoumano = true;
        return n.getAktualniProstor().dlouhyPopis();
    }

    @Override
    public String getNazev() { return "prozkoumej"; }

    @Override
    public void setPrikaz(String prikaz) {

    }
}