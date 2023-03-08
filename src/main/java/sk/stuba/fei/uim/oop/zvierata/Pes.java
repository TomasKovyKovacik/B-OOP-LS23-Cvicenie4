package sk.stuba.fei.uim.oop.zvierata;

public class Pes extends Zviera implements Plavanie{

    public Pes(String meno) {
        super(meno);
    }

    @Override
    public void zvukZvierata() {
        System.out.println("hau hau");
    }

    @Override
    public void behaj() {
        System.out.println("cupity cup");
    }

    @Override
    public void plavaj() {
        System.out.println("clup clup");
    }
}
