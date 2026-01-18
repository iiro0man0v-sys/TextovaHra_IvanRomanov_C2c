package Commands;

import Else.SeznamPrikazu;

public class PrikazPomoc implements IPrikaz {
    private SeznamPrikazu seznam;

    public PrikazPomoc(SeznamPrikazu seznam) {
        this.seznam = seznam;
    }

    @Override
    public String proved(String[] parametry) {
        return "Dostupné příkazy: " + seznam.vratNazvyPrikazu();
    }

    @Override
    public String getNazev() { return "pomoc"; }
}
