package czw;
import java.util.ArrayList;
public class Liste {
    public static void main(String[] args) {
        ArrayList<String> flori = new ArrayList<>();
        flori.add("zambila");
        flori.add("crin");
        flori.add("floarea soarelui");
        flori.add("lotus");

        System.out.println(flori);
        System.out.println(flori.get(3));
        flori.set(2, "clopotei");
        System.out.println(flori);
        flori.remove(3);
        System.out.println(flori);
        flori.add("crin");
        System.out.println(flori);
        flori.remove("crin"); // sterge aparitia primei referinte egale cu param Object
        System.out.println(flori);

        ArrayList<Integer> numere = new ArrayList<>();
        numere.add(10);
        numere.add(20);
        numere.add(30);
        numere.add(1);
        System.out.println(numere);
        numere.remove(1);
        System.out.println(numere);
        numere.remove(Integer.valueOf(1));
        System.out.println(numere);

        System.out.println("dim: " + numere.size());

        System.out.println(numere.contains(10));
        System.out.println(numere.contains(1));

        numere.add(10);
        numere.add(20);
        numere.add(30);
        numere.add(1);
        System.out.println(numere);

        for(Integer nr : numere) {
            System.out.print(nr + " ");
        }
        System.out.println();
        System.out.println(numere.isEmpty());
        numere.clear();
        System.out.println(numere);
        System.out.println(numere.isEmpty());
        // read more: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
    }
    
}
