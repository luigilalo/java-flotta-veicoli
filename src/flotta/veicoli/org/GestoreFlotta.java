package flotta.veicoli.org;
import java.util.ArrayList;
public class GestoreFlotta {

    ArrayList<Veicoli> veicoli = new ArrayList<>();

    // METODO PER AGGIUNGERE UN VEICOLO ALL'ARRAYLIST
    public void addVeicolo(Veicoli veicolo) {
        veicoli.add(veicolo);
    }


    // CONTEGGIO DEI VEICOLI
    public int contaVeicoli(Class<? extends Veicoli> tipoDiVeicolo) {
        int contatore = 0;
        for (Veicoli veicolo : veicoli) {
            if (tipoDiVeicolo.isInstance(veicolo)) {
                contatore++;
            }
        }
        return contatore;
    }

    // TOSTRING

    @Override
    public String toString() {
        return "GestoreFlotta{" +
                "veicoli=" + veicoli +
                '}';
    }

    // METODO PER TROVARE IL VEICOLO
    public Veicoli trovaTarga(String targa){
        Veicoli found = null;
        for (Veicoli auto: veicoli) {
            if (auto.getNumeroDiTarga().equals(targa)){
                found = auto;
            }
        }
        return found;
    }


}