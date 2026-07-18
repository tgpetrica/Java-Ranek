package birds;

public class Main {
    public static void checkFly(Flyable obj) {
        obj.fly();
    }
    public static void main(String[] args) {
        Eagle e = new Eagle();
        e.eat();
        e.fly();

        Penguin p = new Penguin();
        p.eat();
        p.swim();

        System.out.println("==========");

        checkFly(e);
        //checkFly(p); 
        // The method checkFly(Flyable) in the type Main is not applicable for the arguments (Penguin)
        // error: incompatible types: Penguin cannot be converted to Flyable
    }
}

// javac -d out birds/*.java
// java -cp out birds.Main
