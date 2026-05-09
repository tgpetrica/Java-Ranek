package Accel;
public class MetodeSupra{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.suma(2,5));
        System.out.println(calculator.suma(2,5, 9));
        System.out.println(calculator.suma(0.7,0.3));

        System.out.println();

        Animal a1 = new Caine();
        Animal a2 = new Cioara();
        a1.sunet();
        a2.sunet();

        System.out.println();

        U.hello();
    }
}

class Calculator {
    int suma (int a, int b) {
        return a + b;
    }

    int suma (int a, int b, int c) {
        return a + b + c;
    }

    double suma (double a, double b) {
        return a + b;
    } 
}

class Animal {
    void sunet() {
        System.out.println("sunet");
    }
}

class Caine extends Animal {
    void sunet () {
        System.out.println("ham ham");
    }
}

class Cioara extends Animal {
    void sunet () {
        System.out.println("cra cra");
    }
}

class U {
    static void hello() {
        System.out.println("hello");
    }
}
