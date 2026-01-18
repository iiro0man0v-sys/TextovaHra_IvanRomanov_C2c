package Else;

public class Hra {
    private Nacitani n;
    private boolean konecHry;
    private SeznamPrikazu platnePrikazy;

    public Hra() {
        this.n = new Nacitani();
        this.konecHry = false;
        this.platnePrikazy = new SeznamPrikazu();
        inicializujPrikazy();
    }


    private void inicializujPrikazy() {

    }


    public String zpracujPrikaz(String radek) {
        return "";
    }

    public boolean konecHry() {
        return konecHry;
    }

    public void setKonecHry(boolean konecHry) {
        this.konecHry = konecHry;
    }

    public Nacitani getN() {
        return n;
    }
}
