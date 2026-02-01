package Commands;

import Else.Nacitani;
import Else.Vec;

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
        if (cil.isEmpty()) return "Co chceš položit?";
        if (n.getBatoh().obsahujeVec(cil)) {
            Vec v = n.getBatoh().odeberVec(cil);
            n.getAktualniProstor().vlozVec(v);
            return "Položil jsi " + cil + ".";
        }
        return "To v batohu nemáš.";
    }

    @Override
    public String getNazev() { return "poloz"; }


}
