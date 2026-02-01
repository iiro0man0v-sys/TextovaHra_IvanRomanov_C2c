package Commands;

import Else.Nacitani;

public class PrikazPoloz implements IPrikaz {
    private Nacitani n;
    private String cil;

    public PrikazPoloz(Nacitani n) {
        this.n = n;
    }

    @Override
    public void setPrikaz(String prikaz) {
        this.cil = prikaz;
    }

    @Override
    public String proved() {
        return "";
    }

    @Override
    public String getNazev() { return "poloz"; }


}
