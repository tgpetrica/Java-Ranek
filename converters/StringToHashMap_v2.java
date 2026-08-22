package converters;

import java.util.HashMap;
import java.util.Scanner;

public class StringToHashMap_v2 {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        for (char c : text.toCharArray()) {
            map.merge(c, 1, Integer::sum);
        }
        System.out.println(map);
    }
}
