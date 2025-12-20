import java.util.Scanner;
import java.util.Random;

public class Lectia11 {
    public static void main(String[] args) {
        /*System.out.println("Ceva");





        String c = scan.next();
        System.out.println(c);

        String d = scan.next();
        System.out.println(d);

        String e = scan.next();
        char f = e.charAt(0);
        System.out.println(f);*/

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        Random rand = new Random();

        int g = rand.nextInt();
        long h = rand.nextLong();
        float v = rand.nextFloat();
        System.out.println(v);

        int x = rand.nextInt(a, b);
        System.out.println(x);

        v = rand.nextFloat(20, 40);
        System.out.println(v);

        //char p = rand.nextChar();
    }
}