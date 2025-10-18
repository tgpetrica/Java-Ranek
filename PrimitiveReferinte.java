class A{}
class B{}
public class PrimitiveReferinte {
    /*
     * In metoda principala se vor declara si initializa:
     * - un int
     * - un double
     * - doua variabile boolean
     * - un caracter
     * 
     * ======================
     * Sa se scrie doua clase, la alegere si sa se creeze doua referinte.
     */

    public static void main(String[] args) {
        int doi = 0b1011;
        int hex = 0xA4;
        System.out.println(doi);
        System.out.println(hex);

        int nr = 100_000;
        System.out.println(nr);

        A refA = new A();
        B refB = new B();

        System.out.println(refA);
        System.out.println(refB);

        A refX = refA;
        System.out.println(refX);

    }
}
