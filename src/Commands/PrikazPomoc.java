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
       return  "Tvým úkolem je najít Jádro rovnováhy a aktivovat ho v centrální Síni rituálů.\n" +
                "Můžeš používat tyto příkazy: " + seznam.vratNazvyPrikazu();
    }

    @Override
    public String getNazev() { return "pomoc"; }

    @Override
    public void setPrikaz(String prikaz) {

    }
}
