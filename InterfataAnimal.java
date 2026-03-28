interface Animal {  //  abstract class Animal {
    void sunet();   //      abstract void sunet();
}                   //  }

interface Miscabil {
    void misca();
}

class Vaca implements Animal, Miscabil {
    public void sunet() {
        System.out.println("mou mou");
    }

    public void misca() {
        System.out.println("Vaca se misca.");
    }
}

class Soarece implements Animal {
    public void sunet() {
        System.out.println("chit chit");
    }
}

public class InterfataAnimal {
    public static void main(String[] args) {
        Animal vaca = new Vaca();
        Animal soarece = new Soarece();

        vaca.sunet();
        soarece.sunet();

        Miscabil v = new Vaca();
        v.misca();

       ((Miscabil)vaca).misca();

       Vaca cow = new Vaca();
       cow.sunet();
       cow.misca();

    }
}
