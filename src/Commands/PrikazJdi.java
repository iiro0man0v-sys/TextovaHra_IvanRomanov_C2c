package Commands;

import Else.Nacitani;
import Else.Prostor;

public class PrikazJdi implements IPrikaz {
    private Nacitani n;
    private String cil;

    public PrikazJdi(Nacitani n) {
        this.n = n;
    }
    @Override
    public void setPrikaz(String prikaz) {
        this.cil = prikaz;
    }
    /**
     * Provede přesun do sousední místnosti.
     * @return zpráva pro hráče o výsledku pohybu.
     */
    @Override
    public String proved() {

        if (cil.isEmpty()) return "Kam mám jít? Zadej název místnosti.";

        Prostor aktualni = n.getAktualniProstor();
        Prostor sousedni = aktualni.vratSousedniProstor(cil);

        if (sousedni == null) {
            return "Tam se odsud jít nedá! Zkus jiný směr.";
        }
        n.setAktualniProstor(sousedni);
        return sousedni.dlouhyPopis();
    }

    @Override
    public String getNazev() { return "jdi"; }


}