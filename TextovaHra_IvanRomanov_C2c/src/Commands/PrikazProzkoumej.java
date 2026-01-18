package Commands;

import Else.Nacitani;

public class PrikazProzkoumej implements IPrikaz {
    private Nacitani n;

    public PrikazProzkoumej(Nacitani n) {
        this.n = n;
    }

    @Override
    public String proved(String[] parametry) {
        return "";
    }

    @Override
    public String getNazev() { return "prozkoumej"; }
}