package Accel;

public class Varargs {
    public static int suma (int... numere) {
        int suma = 0;
        for (int n : numere) {
            suma +=n;
        }
        return suma;
    }
    public static void main(String[] args) {
        int s1 = suma();
        int s2 = suma(1);
        int s3 = suma(1, 5);
        int s4 = suma(2, 3, 45, 6, 100, 78);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }

    public static int diferenta(String mesaj, int... numere) {
        int dif = 0;
        for (int n : numere) {
            dif -= n;
        }
        return dif;
    }

    // public static void afisare(int... numere, String mesaj) {}
    // The variable argument type int of the method afisare must be the last parameter
    // error: varargs parameter must be the last parameter


}