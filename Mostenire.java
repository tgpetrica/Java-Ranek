class A{}
class B extends A{}
class C extends A{}
//class D extends B,C {} // error: '{' expected

//class E extends Ghost{} // cannot find symbol

final class F{}
//class G extends F{} // cannot inherit from final F

//class A extends A{} // duplicate class: A

//class H extends H{} // cyclic inheritance involving H

class P {
    int varsta = 39;
    public P() {
        System.out.println("P()");
    }
}

class K extends P {
    int varsta = 11;
    public K () {
        System.out.println("K()");
    }
    void afisare() {
        System.out.println(this.varsta + " " + super.varsta);
    }
}

class Animal {
    String specie;
    Animal(String specie) {
        this.specie = specie;
        System.out.println("Animal: " + specie);
    }
}

class Pasare extends Animal {
    int anvergura;
    Pasare(String specie, int anvergura) {
        super(specie);
        this.anvergura = anvergura;
        System.out.println("Pasare: " + anvergura);
    }
}
class Randunica extends Pasare {
    int viteza;
    Randunica(String specie, int anvergura, int viteza) {
        super(specie, anvergura);
        this.viteza = viteza;
        System.out.println("Randunica: " + viteza);
    }
    Randunica() {
        this("Randunica", 30, 55);
    }
}
public class Mostenire {
    public static void main(String[] args) {
        K kid = new K();
        kid.afisare();

        System.out.println();

        new Randunica();
    }
}