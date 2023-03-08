package sk.stuba.fei.uim.oop.zvierata;

public class Macka extends Zviera {
    public Macka(String meno) {
        super(meno);
    }

    @Override
    public void zvukZvierata() {
        System.out.println("mnau mnau");
    }

    @Override
    public void behaj() {
        System.out.println("cupity cup");
    }
}
