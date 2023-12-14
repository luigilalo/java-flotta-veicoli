package flotta.veicoli.org;

public class Main {
    public static void main(String[] args) {
        GestoreFlotta gestore = new GestoreFlotta();
        Automobili auto1 = new Automobili("123ABC", 2002, 5);
        gestore.addVeicolo(auto1);
        Motociclette moto1 = new Motociclette("456FGH", 1990, true);
        gestore.addVeicolo(moto1);
        System.out.println(gestore.contaVeicoli(Automobili.class));
        System.out.println(gestore.contaVeicoli(Motociclette.class));

        System.out.println(gestore.trovaTarga("8HJKFR6"));
    }
}