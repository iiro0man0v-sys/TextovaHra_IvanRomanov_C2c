package Commands;

import Else.Nacitani;

public class PrikazJdi implements IPrikaz {
    private Nacitani n;

    public PrikazJdi(Nacitani n) {
        this.n = n;
    }

    @Override
    public String proved(String[] parametry) {
        return "";
    }

    @Override
    public String getNazev() { return "jdi"; }
}