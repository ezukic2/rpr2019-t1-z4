package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv, kod;
    private int cijena;

    public Artikl(String proizvod, int cijena, String kod) {
        this.naziv = proizvod;
        this.cijena = cijena;
        this.kod = kod;
    }

    public String getNaziv () {
        return naziv;
    }
    public String getKod () {
        return kod;
    }

    public int getCijena() {
        return cijena;
    }
}
