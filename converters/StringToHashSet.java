package converters;

import java.util.HashSet;
import java.util.Scanner;

public class StringToHashSet {
    // se introduce un String si se afiseaza caracterele distincte
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un cuvant: ");
        String word = scanner.nextLine().toUpperCase();

        HashSet<Character> character = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            character.add(word.charAt(i));
        }
        System.out.println(character);
        scanner.close();
    }
    
}
