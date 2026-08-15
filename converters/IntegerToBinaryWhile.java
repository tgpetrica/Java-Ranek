package converters;

import java.util.Scanner;
public class IntegerToBinaryWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nr = sc.nextInt();

        String bin = "";

        while(nr > 0) {
            int rest = nr % 2;
            bin = rest + bin;
            nr /= 2;
        }

        System.out.println("BIN: " + bin);
    }
}
