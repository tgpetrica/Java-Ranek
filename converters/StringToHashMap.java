package converters;

import java.util.HashMap;
import java.util.Scanner;

public class StringToHashMap {
    /*
    StringToHashMap (`String -> HashMap<Character, Integer>`, 
    unde cheia este caracterul 
    si valoarea este numarul aparitiilor acelui caracter in String)
    */
   
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        
        String text = scanner.nextLine();

        for (int i = 0; i < text.length() ; i++) {
            int k=0;
            for(int j = 0; j < text.length(); j++){
                if(text.charAt(i) == text.charAt(j)){
                    k++;
                }
            }
            map.put(text.charAt(i), k);
        }

        //for (char c : text.toCharArray()) {
        //    int count = 0;
        //
        //    for (char d : text.toCharArray()) {
        //        if (c == d) {
        //            count++;
        //        }
        //    }
        //    map.put(c, count);
        //}

        System.out.println(map);
        }
}
