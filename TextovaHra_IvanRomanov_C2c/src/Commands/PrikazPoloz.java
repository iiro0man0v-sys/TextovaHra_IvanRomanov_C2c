package Commands;

import Else.Nacitani;

public class PrikazPoloz implements IPrikaz {
    private Nacitani n;

    public PrikazPoloz(Nacitani n) {
        this.n = n;
    }

    @Override
    public String proved(String[] parametry) {
        return "";
    }

    @Override
    public String getNazev() { return "poloz"; }
}
