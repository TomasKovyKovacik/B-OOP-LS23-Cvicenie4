package sk.stuba.fei.uim.oop;

public class Kontakt {
    private String meno;
    private String priezvisko;
    private Kontakt[] kontakty;

    public Kontakt(String meno, String priezvisko) {
        this.meno = meno;
        this.priezvisko = priezvisko;
    }

    public Kontakt(String celeMeno) {
        String[] casti = celeMeno.split(" ");
        this.meno = casti[0];
        this.priezvisko = casti[1];
    }

    public Kontakt(Kontakt staryKontakt) {
        this.meno = staryKontakt.getMeno();
        this.priezvisko = staryKontakt.getPriezvisko();
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public Kontakt[] getKontakty() {
        return kontakty;
    }

    public void setKontakty(Kontakt[] kontakty) {
        this.kontakty = kontakty;
    }

    public void vypisKontakty() {
        for (int i = 0; i < this.kontakty.length; i++) {
            System.out.println(this.kontakty[i].meno + "  " + this.kontakty[i].priezvisko);
        }
    }
}
