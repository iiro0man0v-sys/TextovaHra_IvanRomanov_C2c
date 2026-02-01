package Commands;

import Else.SeznamPrikazu;

import java.util.ArrayList;

public class PrikazPomoc implements IPrikaz {
    private SeznamPrikazu seznam;

    public PrikazPomoc(SeznamPrikazu seznam) {
        this.seznam = seznam;
    }


    @Override
    public String proved() {
        return "";
    }

    @Override
    public String getNazev() { return "pomoc"; }

    @Override
    public void setPrikaz(String prikaz) {

    }
}
