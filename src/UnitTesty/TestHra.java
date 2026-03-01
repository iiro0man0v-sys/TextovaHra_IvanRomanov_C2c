package UnitTesty;
import Else.Hra;
import Else.Inventar;
import Else.Vec;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestHra {

    private Hra hra;


    @BeforeEach
    void init() {
        hra = new Hra();
    }

    @Test
    void prazdnyPrikaz() {
        String vysledek = hra.zpracujPrikaz("");
        assertEquals("Zadej příkaz.", vysledek);
    }

    @Test
    void neznamyPrikaz() {
        String vysledek = hra.zpracujPrikaz("abc");
        assertTrue(vysledek.contains("Neznámý"));
    }

    @Test
    void inventarNaZacatku() {
        String vysledek = hra.zpracujPrikaz("inventar");
        assertTrue(vysledek.contains("Batoh"));
    }

    @Test
    void vlozeniVeci() {
        Inventar i = new Inventar();
        Vec v = new Vec("klic","test",true);

        assertTrue(i.vlozVec(v));
    }

    @Test
    void kapacitaInventare() {
        Inventar i = new Inventar();

        i.vlozVec(new Vec("a","",true));
        i.vlozVec(new Vec("b","",true));
        i.vlozVec(new Vec("c","",true));
        i.vlozVec(new Vec("d","",true));

        assertFalse(i.vlozVec(new Vec("e","",true)));
    }

    @Test
    void odebraniVeci() {
        Inventar i = new Inventar();
        Vec v = new Vec("klic","",true);
        i.vlozVec(v);
        assertNotNull(i.odeberVec("klic"));
    }

    @Test
    void jdiBezParametru() {
        String vysledek = hra.zpracujPrikaz("jdi");
        assertTrue(!vysledek.isEmpty());
    }

    @Test
    void vezmiNeexistujiciVec() {
        String vysledek = hra.zpracujPrikaz("vezmi nic");
        assertTrue(vysledek.contains("není"));
    }
}