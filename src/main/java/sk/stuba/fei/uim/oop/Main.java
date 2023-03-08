package sk.stuba.fei.uim.oop;

public class Main {

    public static void main(String[] args) {
        var tomas = new Kontakt("Tomas", "Kovacik");
        var stanislav = new Absolvent("Stanislav", "Marochok", "Ing");
        var eugen = new Absolvent("Eugen" , "Antal", "PhD.");

        var kontakty = new Kontakt[] {stanislav, eugen};
        tomas.setKontakty(kontakty);

        tomas.vypisKontakty();
    }
}
