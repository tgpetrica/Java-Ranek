package converters;

import java.util.HashMap;
import java.util.Scanner;

public class StringToHashMap_v1 {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        for (char k : text.toCharArray()) {
            if (!map.containsKey(k)) {
                map.put(k, 1);
            } else {
                map.put(k, map.get(k) + 1);
            }
        }
        System.out.println(map);
    }
}