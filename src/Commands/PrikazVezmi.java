package Commands;

import Else.Nacitani;
import Else.Prostor;
import Else.Vec;

public class PrikazVezmi implements IPrikaz {
    private Nacitani n;
    private String cil;

    public PrikazVezmi(Nacitani n) {
        this.n = n;
    }
    @Override
    public void setPrikaz(String prikaz) {
        this.cil = prikaz;
    }


    @Override
    public String proved() {
        if (cil.isEmpty()) return "Co mám vzít?";
        Prostor aktualni = n.getAktualniProstor();

        if (aktualni.obsahujeVec(cil)) {
            Vec v = aktualni.getVec(cil);
            if (!v.isPrenositelna()) return "To je příliš těžké (nepřenosné).";

            if (n.getBatoh().vlozVec(v)) {
                aktualni.odeberVec(cil);
                return "Vzal jsi " + cil + ".";
            }
            return "Batoh je plný! Více než 4 předměty neuneseš.";
        }
        return "To tu není.";
    }

    @Override
    public String getNazev() { return "vezmi"; }


}
