package Else;
import Commands.IPrikaz;
import java.util.HashMap;
import java.util.Map;

public class SeznamPrikazu {
    private Map<String, IPrikaz> mapaPrikazu;

    public SeznamPrikazu() {
        mapaPrikazu = new HashMap<>();
    }

    public void vlozPrikaz(IPrikaz prikaz) {
        mapaPrikazu.put(prikaz.getNazev(), prikaz);
    }

    public IPrikaz vratPrikaz(String radek) {
        return mapaPrikazu.get(radek);
    }

    public boolean jePlatnyPrikaz(String radek) {
        return mapaPrikazu.containsKey(radek);
    }

    public String vratNazvyPrikazu() {
        return String.join(", ", mapaPrikazu.keySet());
    }
}