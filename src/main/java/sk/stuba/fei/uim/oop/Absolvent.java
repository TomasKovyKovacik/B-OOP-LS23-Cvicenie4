package sk.stuba.fei.uim.oop;

public class Absolvent extends Kontakt {
    private String titul;

    public Absolvent(String meno, String priezvisko, String titul) {
        super(meno, priezvisko);
        this.titul = titul;
    }

    @Override
    public String toString() {
        return  this.titul + " " + super.toString();
    }
}
