package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket s = new Supermarket();
        Artikl a = new Artikl("igračka", 5, "1");
        assertTrue(s.dodajArtikl(a));
    }

    @Test
    void getArtikli() {
        Supermarket s = new Supermarket();
        Artikl a = new Artikl("igračka", 5, "1");
        s.dodajArtikl(a);
        Artikl [] n = s.getArtikli();
        assertEquals("1", n[0].getKod());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket s = new Supermarket();
        Artikl a = new Artikl("igračka", 5, "1");
        Artikl b = new Artikl("sveska", 2, "2");
        s.dodajArtikl(a);
        s.dodajArtikl(b);
        Artikl c = s.izbaciArtiklSaKodom("1");
        assertEquals(c.getCijena(), a.getCijena());
    }
}