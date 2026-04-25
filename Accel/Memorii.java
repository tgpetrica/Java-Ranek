package Accel;
class Person{
    String name;

    Person (String name) {
        this.name = name;
    }

    public static void changeName (String name) {
        name = "Ionescu";
    }
}

public class Memorii {
    public static void changeValue(int x) {
        x = 100;
    }

    public static void changeName (Person p) {
        p.name = "Ionescu";
    }

    public static void main(String[] args) {
        // stack
        int x = 25;
        Person p; // valoarea lui p este null
        
        // heap
        p = new Person ("Ana");
        System.out.println(p);

        // String pool
        String s1 = "Hello";
        String s2 = "Hello";

        // Heap
        String s3 = new String("hello");
        String s4 = new String("hello");
        // 4 referinte

        // == verifica adresa
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s2 == s3); // false
        System.out.println(s3 == s4); // false

        // .equals() verifica continutul
        System.out.println();
        System.out.println(s1.equals(s3)); // true

        System.out.println("x: " + x);
        changeValue(x); // stack -> copie_x trimisa ca param in metoda
        System.out.println("x': " + x);

        System.out.println("name: " + p.name);
        changeName(p); // heap -> referinta catre obiect trimisa ca param in metoda
        System.out.println("name': " + p.name);

        /*
        Tipuri
            Stack: variabile, referinte, apeluri de metode
            Heap: obiecte
        Management 
            Stack: LIFO
            Heap: Garbage Collector
        Acces
            Stack: direct
            Heap: referinta
        Viata
            Stack: cat timp ruleaza metoda 
            Heap: cat timp obiectele sunt referite
        */
        Person p1 = null;
        p1.changeName("Popa");  
        // int y;
        // System.out.println(y);   
        int a = 5;
        double b = a;
        int c = (int)b;
        int i = 0;
        while (i < 100) {
            System.out.print("___0");
            i++;
        }
        System.out.println();

        System.out.println(s4.intern());
    }
}