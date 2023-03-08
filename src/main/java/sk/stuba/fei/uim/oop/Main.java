package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.kontakty.Absolvent;
import sk.stuba.fei.uim.oop.kontakty.Kontakt;
import sk.stuba.fei.uim.oop.zvierata.Macka;
import sk.stuba.fei.uim.oop.zvierata.Pes;
import sk.stuba.fei.uim.oop.zvierata.Zviera;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        var dunco = new Pes("dunčo");
        Pes luna = new Pes("luna");
        ArrayList<Pes> psi = new ArrayList<>();
        psi.add(dunco);
        psi.add(luna);

        var murko = new Macka("murko");
        Macka garfield = new Macka("Garfield");
        ArrayList<Macka> macky = new ArrayList<>();
        macky.add(murko);
        macky.add(garfield);

        ArrayList<Zviera> zveri = new ArrayList<>();
        zveri.addAll(psi);
        zveri.addAll(macky);

        System.out.println(zveri.size());

        Collections.shuffle(zveri);
        for (Zviera zver : zveri) {
            zver.pohladkat();
        }

        System.out.println("--------");
        var it = zveri.iterator();
        while (it.hasNext()) {
            var zver = it.next();
            if (zver instanceof Pes) {
                zver.zvukZvierata();
            }
        }
        System.out.println("--------");
        Zviera[] pole = new Zviera[zveri.size()];
        zveri.toArray(pole);
        for (var prvok : pole) {
            prvok.pohladkat();
        }
        System.out.println("--------");
        var cisla = Arrays.asList(new String[] {"one", "two", "three"});
//        cisla.add("four"); spadne
        var cislaMutable = new ArrayList<>(cisla);
        cislaMutable.add("four");
    }
}
