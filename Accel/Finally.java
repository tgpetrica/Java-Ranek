package Accel;
public class Finally {
    static void method() {
        try {
            System.out.println("A");
            System.exit(0); // JVM exits
        }
        finally {
            System.out.println("finally");
        }
    }
    public static void main(String[] args) {
        method();
    }
}