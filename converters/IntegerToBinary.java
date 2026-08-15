package converters;

import java.util.Scanner;

public class IntegerToBinary {
    // se primeste un integer value si se cere convertirea acestuia la reprezentarea sa in baza 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numar = sc.nextInt();

        String bin = Integer.toBinaryString(numar);
        
        System.out.println("BIN: " + bin);
        sc.close();
    }
    
    
}
