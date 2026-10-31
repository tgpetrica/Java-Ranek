package Accel.L82;
import java.util.HashSet;
import java.util.Set;

public class HashSetE {
    public static void main(String[] args) {
        Set<String> studenti = new HashSet<>();
        studenti.add("Alecsian");
        studenti.add("Bogdan");
        studenti.add("Cornel");

        System.out.println(studenti);

        studenti.add("Dumitru");

        System.out.println(studenti);

        boolean ok = studenti.add("Dumitru"); // 
        System.out.println(ok);

        studenti.remove("Alecsian");
        System.out.println(studenti);

        boolean este = studenti.contains("Bogdan");
        System.out.println(este);

        for (String student : studenti) {
            System.out.println(student);
        }

        System.out.println(studenti.isEmpty());

        studenti.clear();
        System.out.println(studenti);
        System.out.println(studenti.isEmpty());

    }
}
