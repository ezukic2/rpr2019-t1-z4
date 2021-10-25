package ba.unsa.etf.rpr;

public class Supermarket {

    private Artikl[] n = new Artikl[1000];
    int brojArtikalaUSupermarketu = 0;

    public boolean dodajArtikl (Artikl b) {
        if (brojArtikalaUSupermarketu < 1000) {
            n[brojArtikalaUSupermarketu] = new Artikl(b.getNaziv(), b.getCijena(), b.getKod());
            brojArtikalaUSupermarketu = brojArtikalaUSupermarketu + 1;
            return true;
        }
        return false;
    }

    public Artikl[] getArtikli() {
        return n;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for (int i=0; i<brojArtikalaUSupermarketu; i++) {
            if (kod.equals(n[i].getKod())){
                Artikl y = new Artikl(n[i].getNaziv(), n[i].getCijena(), n[i].getKod());
                n[i]=null;
                while(i<brojArtikalaUSupermarketu) {
                    n[i] = n[i+1];
                    i++;
                }
                n[brojArtikalaUSupermarketu] = null;
                brojArtikalaUSupermarketu = brojArtikalaUSupermarketu - 1;
                return y;
            }
        }
            return null;
    }
}
