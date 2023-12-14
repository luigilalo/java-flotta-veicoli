package flotta.veicoli.org;

public class Veicoli {
    // ATTRIBUTI
    private String numeroDiTarga;
    private int annoDiImmatricolazione;

    // COSTRUTTORE
    public Veicoli(String numeroDiTarga, int annoDiImmatricolazione) {
        this.numeroDiTarga = numeroDiTarga;
        this.annoDiImmatricolazione = annoDiImmatricolazione;
    }
    // GETTERS AND SETTERS
    public String getNumeroDiTarga() {
        return numeroDiTarga;
    }
    public void setNumeroDiTarga(String numeroDiTarga) {
        this.numeroDiTarga = numeroDiTarga;
    }

    public int getAnnoDiImmatricolazione() {
        return annoDiImmatricolazione;
    }
    public void setAnnoDiImmatricolazione(int annoDiImmatricolazione) {
        this.annoDiImmatricolazione = annoDiImmatricolazione;
    }

    // METODI

}
