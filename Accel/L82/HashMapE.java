package Accel.L82;
import java.util.HashMap;
import java.util.Map;

public class HashMapE {
    public static void main(String[] args) {
        Map<Integer, String> clasament = new HashMap<>();
        clasament.put(1, "SUA");
        clasament.put(2, "China");
        clasament.put(3, "Germania");
        clasament.put(4, "Japonia");
        clasament.put(5, "UK");

        System.out.println(clasament);
        clasament.put(3, "Japonia");
        System.out.println(clasament);
        clasament.put(4, "Germania");
        System.out.println(clasament);

        clasament.replace(5, "India");
        System.out.println(clasament);

        clasament.remove(1);
        System.out.println(clasament);

        System.out.println(clasament.get(3));

        clasament.put(1, "SUA");

        clasament.put(1, "Franta");
        System.out.println(clasament);

        System.out.println(clasament.containsKey(2));
        System.out.println(clasament.containsValue("SUA"));
        System.out.println(clasament.size());
        System.out.println(clasament.isEmpty());
        //clasament.clear();
        System.out.println(clasament);
        System.out.println(clasament.isEmpty());

        for (Integer loc : clasament.keySet()) {
            System.out.println(loc);
        }

        clasament.put(6, "Franta");

        for (String tara : clasament.values()) {
            System.out.println(tara);
        }

        for (Map.Entry<Integer, String> entry 
            : clasament.entrySet()) {
                System.out.println(
                    entry.getKey() + " - " +
                    entry.getValue()
                );
        }
    }
}
