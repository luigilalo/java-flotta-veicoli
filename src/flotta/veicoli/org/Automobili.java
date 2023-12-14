package flotta.veicoli.org;

public class Automobili extends Veicoli {
                                    // ATTRIBUTO
private int numeroDiPorte;

                                    // COSTRUTTORE
    public Automobili(String numeroDiTarga, int annoDiImmatricolazione, int numeroDiPorte) {
        super(numeroDiTarga, annoDiImmatricolazione);
        this.numeroDiPorte = numeroDiPorte;
    }
    // GETTER AND SETTER

    public int getNumeroDiPorte() {
        return numeroDiPorte;
    }
    public void setNumeroDiPorte(int numeroDiPorte) {
        this.numeroDiPorte = numeroDiPorte;
    }

    // METODI

}
