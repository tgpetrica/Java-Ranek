package University;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Popescu", "Strada Albastra nr 1");
        Person i = new Person("Ionescu", "Strada Galbena nr 2");

        System.out.println(p);
        System.out.println(i);

        Student d = new Student("Dumitrescu", "Strada Mihai Eminescu nr 20", "Informatica Economica", 1, 5000);
        System.out.println(d);

        Staff v = new Staff("Vornicescu", "Strada Icoanei nr 35", "ASE", 9500);
        System.out.println(v);
    }
}
