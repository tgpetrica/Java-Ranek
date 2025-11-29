public class AfisarePattern {
    public static void main(String[] args) {
        int h = 5;
        int linie = 1;

        while (linie <= h) {
            int coloana = 1;
            while (coloana <= linie) {
                System.out.print("*");
                coloana++;
            }
            System.out.println();
            linie++;
        }
    }
    /*

    *
    **
    ***
    ****
    *****
    
    */


}
