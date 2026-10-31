package Accel.L82;
import java.util.ArrayList;

public class ArrayListF {
    public static void main(String[] args) {
        ArrayList<Integer> note = new ArrayList<>();
        note.add(7);
        note.add(10);
        note.add(8);
        note.add(9);
        note.add(5);

        for(Integer i : note){
            System.out.print(i + " ");
        }

        System.out.println();

        note.set(4, 8);
        

        for(Integer i : note){
            System.out.print(i + " ");
        }

        System.out.println();

        note.remove(note.size() - 1);

        for(Integer i : note){
            System.out.print(i + " ");
        }

        System.out.println();
        note.add(1);

        for(Integer i : note){
            System.out.print(i + " ");
        }

        System.out.println();
        note.add(0, 2);

        for(Integer i : note){
            System.out.print(i + " ");
        }

        int suma = 0;

        for (int i = 0; i < note.size(); i++) {
            suma += note.get(i);
        }
        System.out.println(suma);

        double media = (double) suma / note.size();

        System.out.println(media);
    }
}
