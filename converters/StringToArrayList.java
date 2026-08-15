package converters;
import java.util.ArrayList;

public class StringToArrayList {
    public static void main(String[] args) {
        String words = "Java, Python, JavaScript";

        ArrayList<String> list = new ArrayList<>();

        String[] wordsSplit = words.split(", ");

        for (int i = 0; i < wordsSplit.length; i++){
            list.add(wordsSplit[i]);
        }

        System.out.println("String: " + words);
        System.out.println("ArrayList: " + list);
    }
}
