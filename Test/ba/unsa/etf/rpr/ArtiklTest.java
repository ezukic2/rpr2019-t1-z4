package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void getNaziv() {
        Artikl l = new Artikl("igračka", 5, "1");
        assertEquals("igračka", l.getNaziv());
    }

    @Test
    void getKod() {
        Artikl m = new Artikl("igračka", 5, "1");
        assertEquals("1", m.getKod());
    }

    @Test
    void getCijena() {
        Artikl n = new Artikl("igračka", 5, "1");
        assertEquals(5, n.getCijena());
    }
}