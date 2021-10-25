package ba.unsa.etf.rpr;

public class Korpa {

    private Artikl[] artikli = new Artikl[50];
    int brojArtikalaUKorpi = 0;
    public Artikl[] getArtikli() {
    return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for (int i = 0; i < brojArtikalaUKorpi; i++) {
            if(kod.equals(artikli[i].getKod())){
                Artikl x = new Artikl(artikli[i].getNaziv(), artikli[i].getCijena(), artikli[i].getKod());
                artikli[i]= null;

                while (i<brojArtikalaUKorpi){
                    artikli[i] = artikli [i+1];
                    i++;
                }
                artikli[brojArtikalaUKorpi] = null;
                brojArtikalaUKorpi = brojArtikalaUKorpi - 1;
                return x;
            }
        }
        return null;
    }

    public boolean dodajArtikl(Artikl a) {
        if(brojArtikalaUKorpi < 50) {
            artikli [brojArtikalaUKorpi] = new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
            brojArtikalaUKorpi = brojArtikalaUKorpi + 1;
            return true;
        }
        return false;
    }

    public int dajUkupnuCijenuArtikala() {
        int racun = 0;
        for (int i=0; i<brojArtikalaUKorpi; i++){
            racun = racun + artikli[i].getCijena();
        }

        return racun;
    }
}
