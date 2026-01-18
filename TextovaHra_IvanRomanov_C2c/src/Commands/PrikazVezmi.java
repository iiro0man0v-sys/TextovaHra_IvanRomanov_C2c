package Commands;

import Else.Nacitani;

public class PrikazVezmi implements IPrikaz {
    private Nacitani n;

    public PrikazVezmi(Nacitani n) {
        this.n = n;
    }

    @Override
    public String proved(String[] parametry) {
        return "";
    }

    @Override
    public String getNazev() { return "vezmi"; }
}
