import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.HashMap;

public class Elevi {
    public static void main(String[] args) {
        ArrayList<String> elevi = new ArrayList<>();

        elevi.add("Andrei");
        elevi.add("Maria");
        elevi.add("George");
        elevi.add("Ioana");
        elevi.add("Irina");

        Iterator<String> iterator = elevi.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();
        ListIterator<String> listIterator = elevi.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.nextIndex() + " - " +listIterator.next());
        }

        System.out.println();
        while(listIterator.hasPrevious()) {
            System.out.println(listIterator.previousIndex() + " - " + listIterator.previous());
        }

        HashMap<String, Integer> note = new HashMap<>();

        note.put("Maria", 10);
        note.put("Daniela", 9);
        note.put("Alexandra", 9);
        note.put("Sebi", 7);
        note.put("Teodor", 8);
        note.put("Lorena", 9);

        ArrayList<String> chei = new ArrayList<>(note.keySet());
        ListIterator<String> it = chei.listIterator();

        while (it.hasNext()) {
            String K = it.next();
            Integer V = note.get(K);
            System.out.println(K + ": " + V);
        }

    }
}