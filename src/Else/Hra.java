package Else;

import Commands.*;
import java.util.Scanner;

public class Hra {
    private Nacitani n;
    private boolean konecHry;
    private SeznamPrikazu platnePrikazy;

    public Hra() {
        this.n = new Nacitani();
        this.konecHry = false;
        this.platnePrikazy = new SeznamPrikazu();

        n.nacitani();

        try {
            n.nactiZeSouboru("/Mistnosti.json");
            Prostor startovniMistnost = n.getProstor("vstupni_hala");
            n.setAktualniProstor(startovniMistnost);
        } catch (Exception e) {
            System.out.println("Chyba: Nepodařilo se načíst herní data.");
        }

        inicializujPrikazy();
    }

    private void inicializujPrikazy() {
        platnePrikazy.vlozPrikaz(new PrikazJdi(n));
        platnePrikazy.vlozPrikaz(new PrikazKonec(this));
        platnePrikazy.vlozPrikaz(new PrikazPomoc(platnePrikazy));
        platnePrikazy.vlozPrikaz(new PrikazNapoveda(n));
        platnePrikazy.vlozPrikaz(new PrikazVezmi(n));
        platnePrikazy.vlozPrikaz(new PrikazPoloz(n));
        platnePrikazy.vlozPrikaz(new PrikazPouzij(this));
        platnePrikazy.vlozPrikaz(new PrikazMluv(n));
        platnePrikazy.vlozPrikaz(new PrikazProzkoumej(n));
        platnePrikazy.vlozPrikaz(new PrikazInventar(n));
    }

    public void hraj() {
        System.out.println("Vítej ve hře Stíny Akademie!");
        System.out.println(n.getUvodniText());
        if (n.getAktualniProstor() != null) {
            System.out.println(n.getAktualniProstor().dlouhyPopis());
        }

        Scanner scanner = new Scanner(System.in);
        while (!konecHry) {
            System.out.print("> ");
            String radek = scanner.nextLine();
            System.out.println(zpracujPrikaz(radek));
        }
        System.out.println("Děkujeme za hraní.");
    }

    /**
     * @param radek vstup od hrače
     * @return Odpověď hračovi
     */
    public String zpracujPrikaz(String radek) {
        String vstup = radek.trim();
        if (vstup.isEmpty()) return "Zadej příkaz.";

        int mezera = vstup.indexOf(" ");
        String jmenoPrikazu;
        String parametr = "";

        if (mezera == -1) {
            jmenoPrikazu = vstup.toLowerCase();
        } else {
            jmenoPrikazu = vstup.substring(0, mezera).toLowerCase();
            parametr = vstup.substring(mezera + 1).trim();
        }

        if (platnePrikazy.jePlatnyPrikaz(jmenoPrikazu)) {
            IPrikaz prikaz = platnePrikazy.vratPrikaz(jmenoPrikazu);
            prikaz.setPrikaz(parametr);
            return prikaz.proved();
        }
        return "Neznámý příkaz. Zkus 'pomoc'.";
    }

    public void setKonecHry(boolean stav) { this.konecHry = stav; }
    public Nacitani getN() { return n; }

}