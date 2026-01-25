package Commands;

import Else.Nacitani;

public class PrikazNapoveda implements IPrikaz {
    private Nacitani n;

    public PrikazNapoveda(Nacitani n) {
        this.n = n;
    }

    @Override
    public String proved(String[] parametry) {
        return "Prozkoumej okolí a sbírej předměty.";
    }

    @Override
    public String getNazev() { return "napoveda"; }
}
