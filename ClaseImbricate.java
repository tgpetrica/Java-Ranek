public class ClaseImbricate {
    public static void main(String[] args) {
        // clasa inner statica
        Calculator.Operatie op = new Calculator.Operatie();
        System.out.println(op.aduna(20, 1));

        // clasa inner non-statica
        Telefon tel = new Telefon("iPhone 16");
        Telefon.Baterie baterie = tel.new Baterie();
        baterie.afisare();

        // this
        Joc joc = new Joc();
        Joc.Jucator jucator = joc.new Jucator();
        jucator.afisare();

        // clasa locala
        Produs prod = new Produs();
        prod.afisarePret();

        // clasa anonima
        Animal caine = new Animal() {
            @Override
            public void sunet() {
                System.out.println("ham ham");
            }
        };
        caine.sunet();
        // clasele anonime sunt declarate dupa new, intre acolade
        // si sunt subclase ale clasei sau implementari ale interfetei instantiate.
    }
}
/*
// in mod normal am fi scris clasa Caine care implementeaza interfata Animal
class Caine implements Animal {
    @Override
    public void sunet() {
        System.out.println("ham ham");
    }
}
*/

// clasa inner statica
class Calculator {
    static class Operatie {
        int aduna (int a, int b) {
            return a + b;
        }
    }
}
// clasa inner non-statica
class Telefon {
    private String model;
    public Telefon(String model) {
        this.model = model;
    }
    class Baterie {
        void afisare () {
            System.out.println("model: " + model);
        }
    }
}

// this
class Joc {
    private String nume = "GeometryDash";
    class Jucator {
        private String nume = "Alex";
        void afisare() {
            System.out.println("nume: " + nume);
            System.out.println("nume: " + this.nume);
            System.out.println("joc: " + Joc.this.nume);
            System.out.println("nume: " + Jucator.this.nume);
        }
    }
}

// clase locale
class Produs {
    void afisarePret() {
        int pret = 24;
        // pret = 25; // Local variable pret is required to be final or effectively final based on its usage

        class Eticheta {
            void afiseaza() {
                System.out.println("Pret: " + pret + " lei");
            }
        }
        Eticheta eticheta = new Eticheta();
        eticheta.afiseaza();
    }
}

// clase anonime
interface Animal {
    void sunet();
}