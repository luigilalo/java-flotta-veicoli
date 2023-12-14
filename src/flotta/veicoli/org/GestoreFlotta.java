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
}