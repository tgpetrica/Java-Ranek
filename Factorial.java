public class Factorial {
    static long factorialIterativ(int n) {
        long rezultat = 1;
        for (int i = n; i >= 1; i--) {
            rezultat *= i;
        }
        return rezultat;
    }

    static long factorialRecursiv(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialRecursiv(n - 1);
    }

    public static void main(String[] args) {
        long bit = System.nanoTime();
        System.out.println(factorialIterativ(20));
        long eit = System.nanoTime();
        System.out.println("t: " + (eit - bit) + " \n");

        long bre = System.nanoTime();
        System.out.println(factorialRecursiv(20));
        long ere = System.nanoTime();
        System.out.println("t: " + (ere - bre) + " \n");
    }
}
