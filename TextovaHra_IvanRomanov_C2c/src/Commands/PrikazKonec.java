package Commands;

import Else.Hra;

public class PrikazKonec implements IPrikaz {
    private Hra hra;

    public PrikazKonec(Hra hra) {
        this.hra = hra;
    }

    @Override
    public String proved(String[] parametry) {
        hra.setKonecHry(true);
        return "Ukončuji hru...";
    }

    @Override
    public String getNazev() { return "konec"; }
}
