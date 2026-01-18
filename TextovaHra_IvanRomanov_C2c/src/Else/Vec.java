package Else;

public class Vec {
    private String nazev;
    private String popis;
    private boolean prenositelna;

    public Vec(String nazev, String popis, boolean prenositelna) {
        this.nazev = nazev;
        this.popis = popis;
        this.prenositelna = prenositelna;
    }

    public Vec() {
    }

    public String getNazev() {
        return nazev;
    }
    public String getPopis() {
        return popis;
    }
    public boolean isPrenositelna() {
        return prenositelna;
    }
}