package Else;

import java.util.HashMap;
import java.util.Map;


public class Prostor {
    private String nazev;
    private String popis;
    private Map<String, Prostor> vychody;
    private Map<String, Vec> predmety;
    private Map<String, Postava> postavy;

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

    }

    public Prostor vratSousedniProstor(String nazev){
        return new Prostor();
    }

    public String dlouhyPopis() {
        return "";
    }

    // Práce s předměty
    public void vlozVec(Vec vec) {

    }

    public Vec odeberVec(String nazev) {
        return new Vec();
    }

    public boolean obsahujeVec(String nazev) {
        return predmety.containsKey(nazev);
    }

    public Vec getVec(String nazev) {
        return predmety.get(nazev);
    }

    // Práce s postavami
    public void vlozPostavu(Postava p) {

    }

    public Postava getPostava(String jmeno) {
        return new Postava("neco", "neco");
    }

    public String getNazev() {
        return nazev;
    }
    public String getPopis() {
        return popis;
    }
}
