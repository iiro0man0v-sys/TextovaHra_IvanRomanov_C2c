package Commands;

import Else.Hra;
import Else.Prostor;

public class PrikazPouzij implements IPrikaz {
    private Hra hra;
    private String cil;

    public PrikazPouzij(Hra hra) {
        this.hra = hra;
    }

    @Override
    public void setPrikaz(String prikaz) {
        this.cil = prikaz;
    }

    @Override
    public String proved() {
        if (cil.isEmpty()) {
            return "Co chceš použít? (Např. pouzij lektvar)";
        }


        if (!hra.getN().getBatoh().obsahujeVec(cil)) {
            return "Předmět '" + cil + "' nemáš v batohu.";
        }

        Prostor aktualni = hra.getN().getAktualniProstor();


        switch (cil.toLowerCase()) {
            case "jadro":

                if (aktualni.getNazev().equals("Síň rituálů")) {
                    hra.setKonecHry(true);
                    return "Aktivoval jsi Jádro rovnováhy! Magie v Akademii Arkanum je stabilizována. Vyhrál jsi!";
                }
                return "Jádro silně září, ale tady ho použít nemůžeš. Musíš do Síně rituálů.";

            case "lektvar":

                if (aktualni.getNazev().equals("Zahrada")) {
                    hra.getN().getBatoh().odeberVec("lektvar");
                    return "Podal jsi lektvar Strážci zahrady. Strážce se uklidnil a nechal tě projít ke sklepu.";
                }
                return "Vypil jsi lektvar, ale nic se nestalo. Možná by se hodil někomu jinému.";

            case "klic":

                if (aktualni.getNazev().equals("Zahrada")) {
                    return "Použil jsi klíč. Těžké dveře do sklepa se s vrzáním otevřely.";
                }
                return "Tady není co odemknout.";

            case "svitek":

                return "Rozvinul jsi magický svitek: 'Jádro rovnováhy odpočíva v temnotách sklepa, chráněno rituální silou.";

            default:
                return "Předmět " + cil + " jsi použil, ale bez viditelného efektu.";
        }
    }

    @Override
    public String getNazev() { return "pouzij"; }


}