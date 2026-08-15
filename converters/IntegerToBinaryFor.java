package converters;

import java.util.Scanner;
public class IntegerToBinaryFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nr = sc.nextInt();

        String bin = "";

        for (; nr > 0; nr /= 2) {
            int rest = nr % 2;
            bin = rest + bin;
        }

        System.out.println("BIN: " + bin);
    }
}
/*
        for (initializare; conditie; actualizare) {
            // bloc de instructiuni
        }

        Modalitate de executare:
        1. se executa <<initializare>>
        2. se verifica <<conditie>>
        3. daca <<conditie>> este adevarat, atunci se executa <<bloc instructiuni>>, altfel break
        4. se executa <<actualizare>>
        5. se repeta pasul 2 si in jos
     */
