package converters;

import java.util.HashMap;
import java.util.Scanner;

public class StringToHashMap_v3 {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        for (char c : text.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
    }
}
