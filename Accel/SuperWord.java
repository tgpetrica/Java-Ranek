package Accel;

class A {
    void method() {
        System.out.println("A");
    }
}

class B extends A {
    void method() {
        System.out.println("B");
    }

    void superMethod() {
        super.method();
    }
}

public class SuperWord {
    public static void main(String[] args) {
        B b = new B();
        b.method();
        b.superMethod();
        
    }
}
