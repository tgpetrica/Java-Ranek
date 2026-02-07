public class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int substract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0)
            return 0;
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(add(2,5)); // 7
        System.out.println(divide(12, 0)); // 0
        System.out.println(divide(12, 5)); // 2
        System.out.println(multiply(10, 12)); // 120
        System.out.println(substract(2, 5)); // -3
    }   
}