package Accel.L82;
import java.util.ArrayList;

public class ArrayListE {
    public static void main(String[] args) {
        //int arr[] = new int [3];
        ArrayList<String> lista = new ArrayList<>();
        System.out.println(lista.size());
        System.out.println(lista.isEmpty());
        lista.add("Ana");
        lista.add("Bianca");
        lista.add("Camelia");
        System.out.println(lista.size());
        System.out.println(lista.isEmpty());

        System.out.println();

        lista.add(1, "Daniela");

        for(String n : lista) {
            System.out.println(n);
        }
        System.out.println();

        lista.set(3, "Carmen");

        for(String n : lista) {
            System.out.println(n);
        }

        System.out.println();

        lista.remove("Daniel");
        for(String n : lista) {
            System.out.println(n);
        }

        System.out.println();

        lista.remove(0);
        for(String n : lista) {
            System.out.println(n);
        }
        System.out.println();

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println();

        System.out.println("Daniela: " + lista.contains("Daniela"));       
    }
}
