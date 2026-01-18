package Else;

import java.util.HashMap;
import java.util.Map;

public class Inventar {
    private static final int KAPACITA = 4;
    private Map<String, Vec> obsah;

    public Inventar() {
        obsah = new HashMap<>();
    }

    public boolean vlozVec(Vec vec) {
        return false;
    }

    public Vec odeberVec(String nazev) {
        return obsah.remove(nazev);
    }

    public Vec getVec(String nazev) {
        return obsah.get(nazev);
    }

    public boolean obsahujeVec(String nazev) {
        return obsah.containsKey(nazev);
    }

    public String getSeznamVeci() {
        if (obsah.isEmpty()) return "Batoh je prázdný.";
        return String.join(", ", obsah.keySet());
    }
}
