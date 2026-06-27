package czw;

public class Sp {
    public static void main(String[] args) {
        String a = "cat";
        String c = "c";
        String b = c + "at";
        System.out.println(a == b);

        //new Caine("Rex"); // The constructor Caine(String) is undefined
        new Caine();
        new Caine("Azorel");
        new Animal("Maxi");
    }
}

class Animal {
    Animal (String nume) {
        System.out.println(nume);
    }
}

class Caine extends Animal {
    Caine() {
        super("Rex");
    }

    Caine(String nume) {
        super(nume);
    }
}