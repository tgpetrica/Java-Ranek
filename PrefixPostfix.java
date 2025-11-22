public class PrefixPostfix {
    public static void main(String[] args) {
        /*
            Prefixare: ++x
            = creasca valoare si apoi sa o foloseasca

            Postfixare: x++
            = foloseste valoarea curenta si apoi o creste
         */

        int x = 5;
        int y = 5;

        int a = ++x; // creste x, apoi noua valoare a lui x este salvata in a
        System.out.println("a: " + a);
        System.out.println("x: " + x);

        System.out.println("");

        int b = y++; // se foloseste y cu valoarea sa actuala (5) si se atribuie la b, apoi creste y 
        System.out.println("b: " + b);
        System.out.println("y: " + y);

        x = 5;
        y = 3;

        int z = x++ + --y + ++x - y-- + x;
        System.out.println("z: " + z);
        /*
            x++ se foloseste 5, x devine 6
            --y y devine 2, se foloseste 2
            ++x x devine 7, se foloseste 7
            y-- se foloseste 2, y devine 1

            int z = x++ + --y + ++x - y-- + x;
                    5     2      7    2     7
            z este 19


            De studiat individual: 
            int w = x++ + (--y + ++x) - y-- + x;
        */
    }

}
