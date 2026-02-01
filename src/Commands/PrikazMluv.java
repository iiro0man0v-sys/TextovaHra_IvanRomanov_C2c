package Commands;

import Else.Nacitani;
import Else.Postava;

public class PrikazMluv implements IPrikaz {
    private Nacitani n;
    private String cil;

    public PrikazMluv(Nacitani plan) {
        this.n = n;
    }
    @Override
    public void setPrikaz(String prikaz) {
        this.cil = prikaz;
    }


    @Override
    public String proved() {
        if (cil.isEmpty()) return "Na koho chceš mluvit?";
        Postava p = n.getAktualniProstor().getPostava(cil);
        return (p != null) ? p.getJmeno() + ": " + p.mluv() : "Někdo takový tu není.";
    }

    @Override
    public String getNazev() { return "mluv"; }


}
