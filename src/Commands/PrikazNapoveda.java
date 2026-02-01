package Commands;

import Else.Nacitani;

public class PrikazNapoveda implements IPrikaz {
    private Nacitani n;

    public PrikazNapoveda(Nacitani n) {
        this.n = n;
    }


    @Override
    public String proved() {
        return "Prozkoumej okolí a sbírej předměty.";
    }

    @Override
    public String getNazev() { return "napoveda"; }

    @Override
    public void setPrikaz(String prikaz) {

    }
}
