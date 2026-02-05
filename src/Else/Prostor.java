package Else;

import Commands.PrikazProzkoumej;

import java.util.HashMap;
import java.util.Map;


public class Prostor {

    private String nazev;
    private String popis;
    private Map<String, Prostor> vychody;
    private Map<String, Vec> predmety;
    private Map<String, Postava> postavy;
    private final String mapa =
            "Mapa: \n"+
            "Vstupní hala \n" +
            " ├─ Knihovna ─ Studovna ─ Laboratoř \n" +
            " └─ Kolej učňů ─ Zahrada ─ Sklep \n" +
            "                              └─ Síň rituálů \n";

    public Prostor() {
    }

    public Prostor(String nazev, String popis) {
        this.nazev = nazev;
        this.popis = popis;
        this.vychody = new HashMap<>();
        this.predmety = new HashMap<>();
        this.postavy = new HashMap<>();
    }

    public void setVychod(Prostor vedlejsi) {
        vychody.put(vedlejsi.getNazev().toLowerCase(), vedlejsi);
    }

    public Prostor vratSousedniProstor(String nazev){
        return vychody.get(nazev.toLowerCase());
    }

    public String dlouhyPopis() {
        String info;
        info = "Místnost: " + nazev + "\n" + popis + "\n";
        info += "Východy: " + String.join(", ", vychody.keySet()) + "\n";
        info += mapa;
        info += "Jestli chceš vědět, jaké postavy a předměty se tady nachazejí pouzij prikaz 'prozkoumej'";
        if (PrikazProzkoumej.prozkoumano){
            info = "Místnost: " + nazev + "\n" + popis + "\n";
            info += "Východy: " + String.join(", ", vychody.keySet()) + "\n";
            info += "Předměty: " + (predmety.isEmpty() ? "žádné" : String.join(", ", predmety.keySet())) + "\n";
            info += "Postavy: " + (postavy.isEmpty() ? "nikdo tu není" : String.join(", ", postavy.keySet()));
            info += mapa;
            return info;
        }
        return info;
    }

    // Práce s předměty
    public void vlozVec(Vec vec) {
        predmety.put(vec.getNazev().toLowerCase(), vec);
    }

    public Vec odeberVec(String nazev) {
        return predmety.remove(nazev.toLowerCase());
    }

    public boolean obsahujeVec(String nazev) {
        return predmety.containsKey(nazev.toLowerCase());
    }

    public Vec getVec(String nazev) {
        return predmety.get(nazev);
    }

    // Práce s postavami
    public void vlozPostavu(Postava p) {
        postavy.put(p.getJmeno().toLowerCase(), p);
    }

    public Postava getPostava(String jmeno) {
        return postavy.get(jmeno.toLowerCase());    }

    public String getNazev() {
        return nazev;
    }
    public String getPopis() {
        return popis;
    }
}
