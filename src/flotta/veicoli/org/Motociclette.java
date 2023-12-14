package flotta.veicoli.org;

public class Motociclette extends Veicoli {
    // ATTRIBUTI
private boolean cavalletto;
    // COSTRUTTORE
    public Motociclette(String numeroDiTarga, int annoDiImmatricolazione, boolean cavalletto) {
        super(numeroDiTarga, annoDiImmatricolazione);
    }
    // GETTER AND SETTER
    public boolean isCavalletto() {
        return cavalletto;
    }
    public void setCavalletto(boolean cavalletto) {
        this.cavalletto = cavalletto;
    }
    // METODI
}
