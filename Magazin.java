import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
public class Magazin {
    public static void main(String[] args) {
        // produse (nume, pret)
        HashMap<String, Double> produse = new HashMap<>();

        produse.put("mere", 4.5);
        produse.put("lapte", 7.0);
        produse.put("paine", 3.75);
        produse.put("ciocolata", 9.25);

        ArrayList<String> cos = new ArrayList<>();

        cos.add("mere");
        cos.add("paine");
        cos.add("ciocolata");
        cos.add("mere");

        HashSet<String> raioane = new HashSet<>();

        raioane.add("fructe");
        raioane.add("panificatie");
        raioane.add("dulciuri");
        raioane.add("lactate");

        System.out.println("LISTA PRETURI");
        System.out.println(produse);

        System.out.println("\nCOS CUMPARATURI");
        System.out.println(cos);

        System.out.println("\nRAIOANE");
        System.out.println(raioane);

        double total = 0.0;

        for (String produs : cos) {
            total += produse.get(produs); // returneaza VALOAREA care se regaseste in dreptul CHEII 'produs' din HashMap-ul 'produse'
        }

        System.out.println("TOTAL: " + total);
    }
}
