package converters;

import java.util.Scanner;

public class IntegerToHexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dec = sc.nextInt();
        String digits = "0123456789ABCDEF";
        String hex = "";

        while(dec > 0){
            int rest = dec % 16;
            hex = digits.charAt(rest) + hex;
            dec /= 16;
        }

        System.out.println("HEX: " + hex);
        
        sc.close();
        
    }
}
