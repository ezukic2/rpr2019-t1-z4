package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void getArtikli() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("sveska", 2, "1");
        k.dodajArtikl(a);
        Artikl[] b = k.getArtikli();
        assertEquals(2, b[0].getCijena());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("igračka", 5, "1");
        Artikl b = new Artikl("sveska", 2, "2");
        Artikl c = new Artikl("olovka", 1, "3");
        k.dodajArtikl(a);
        k.dodajArtikl(b);
        k.dodajArtikl(c);
        Artikl d = k.izbaciArtiklSaKodom("2");
        assertEquals(d.getCijena(), b.getCijena());
    }

    @Test
    void dodajArtikl() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("igračka", 5, "1");
        assertTrue(k.dodajArtikl(a));
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa k = new Korpa();
        Artikl a1 = new Artikl("igračka", 5, "1");
        Artikl a2 = new Artikl("sveska", 2, "2");
        k.dodajArtikl(a1);
        k.dodajArtikl(a2);
        assertEquals(7, k.dajUkupnuCijenuArtikala());
    }
}