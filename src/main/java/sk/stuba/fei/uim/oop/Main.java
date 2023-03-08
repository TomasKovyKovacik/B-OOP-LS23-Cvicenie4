package sk.stuba.fei.uim.oop;

public class Main {

    public static void main(String[] args) {
        var tomas = new Kontakt("Tomas", "Kovacik");
        var stanislav = new Kontakt("Stanislav", "Marochok");
        var eugen = new Kontakt("Eugen Antal");

        var kontakty = new Kontakt[] {new Kontakt(stanislav), new Kontakt(eugen)};
        tomas.setKontakty(kontakty);

        tomas.vypisKontakty();
        stanislav.setMeno("Stanko");
        tomas.vypisKontakty();
    }
}
