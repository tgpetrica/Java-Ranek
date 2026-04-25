package Accel;
public class AE {
    public static void main(String[] args) {
        System.out.println(18 < 0 && (10 / 0 > 1)); // false
        
        System.out.println(18 > 0 && (10 / 0 > 1)); // AE

        System.out.println(18 > 0 || (10 / 0 > 1)); // true

        System.out.println(18 < 0 || (10 / 0 > 1)); // AE
    }
}