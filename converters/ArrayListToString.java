package converters;

import java.util.ArrayList;

public class ArrayListToString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("JavaScript");

        String result = String.join(", ", list);

        System.out.println("Array: " + list);
        System.out.println("String: " + result);
    }
}
