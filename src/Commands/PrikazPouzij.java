package Commands;

import Else.Hra;

public class PrikazPouzij implements IPrikaz {
    private Hra hra;

    public PrikazPouzij(Hra hra) {
        this.hra = hra;
    }


    @Override
    public String proved() {
        return "";
    }

    @Override
    public String getNazev() { return "pouzij"; }

    @Override
    public void setPrikaz(String prikaz) {

    }
}