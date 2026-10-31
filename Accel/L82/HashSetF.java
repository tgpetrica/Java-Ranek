package Accel.L82;
import java.util.HashSet;
import java.util.Set;

public class HashSetF {
    public static void main(String[] args) {
        Set<Integer> punctaje = new HashSet<>();

        punctaje.add(97);
        punctaje.add(100);
        punctaje.add(91);
        punctaje.add(78);
        punctaje.add(43);

        System.out.println(punctaje);

        punctaje.remove(10);
        System.out.println(punctaje);

        punctaje.remove(91);
        System.out.println(punctaje);

        boolean ok = punctaje.add(23);
        System.out.println(ok);
        System.out.println(punctaje);

        double punctajMediu = 0.0;

        for (Integer punctaj : punctaje) {
            punctajMediu += punctaj;
        }

        punctajMediu /= punctaje.size();
        System.out.println(punctajMediu);


    }
}
