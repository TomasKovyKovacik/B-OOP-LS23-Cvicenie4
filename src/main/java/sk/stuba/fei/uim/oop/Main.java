package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.kontakty.Absolvent;
import sk.stuba.fei.uim.oop.kontakty.Kontakt;
import sk.stuba.fei.uim.oop.zvierata.Macka;
import sk.stuba.fei.uim.oop.zvierata.Pes;
import sk.stuba.fei.uim.oop.zvierata.Zviera;

public class Main {

    public static void main(String[] args) {
        var dunco = new Pes("dunčo");

        var murko = new Macka("murko");

        dunco.pohladkat();

    }
}
