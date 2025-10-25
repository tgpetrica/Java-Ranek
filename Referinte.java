class Casa {}

class Hotel {}

class Bloc {}

public class Referinte {
    public static void main(String[] args) {
        Casa casa = new Casa();
        System.out.println(casa);

        Casa vila = new Casa();
        System.out.println(vila);

        Hotel h = new Hotel();
        System.out.println(h);

        Hotel y = h;
        System.out.println(y);
    }
}
