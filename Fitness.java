import java.util.Scanner;

public class Fitness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] pasi = new int[7];
        int suma = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        

        for (int i = 0; i < 7; i++) {
            System.out.print("Ziua " + (i + 1) + ": ");
            pasi[i] = scanner.nextInt();

            suma += pasi[i];

            if (pasi[i] > max) {
                max = pasi[i];
            }

            if (pasi[i] < min) {
                min = pasi[i];
            }
        }

        scanner.close();

        double media = (double) suma / 7;
        System.out.println("Media: " + media);
        System.out.println("Max: " + max);
        System.out.println("Amplitudinea: " + (max - min));
    }
}