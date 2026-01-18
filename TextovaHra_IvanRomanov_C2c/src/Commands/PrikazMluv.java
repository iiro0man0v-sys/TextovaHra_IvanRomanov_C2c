package Commands;

import Else.Nacitani;

public class PrikazMluv implements IPrikaz {
    private Nacitani n;

    public PrikazMluv(Nacitani plan) {
        this.n = n;
    }

    @Override
    public String proved(String[] parametry) {
        return "";
    }

    @Override
    public String getNazev() { return "mluv"; }
}
