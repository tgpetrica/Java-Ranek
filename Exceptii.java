public class Exceptii {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 3, 5, 7, 9};
            System.out.println(arr[5]);
            int rezultat = 10 / 0;
        }
        catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("index nepermis");
        } catch (ArithmeticException ae) {
            System.out.println("ae");
        } catch (Exception e) {
            System.out.println("a aparut o exceptie");
        } 

        System.out.println("in afara try; se executa fara probleme/pauze/intreruperi");
        try {
            int[] arr = {1, 3, 5, 7, 9};
            System.out.println(arr[0]);
            int rezultat = 10 / 0;
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("exceptie: array sau impartire la 0");
        }
        System.out.println();
        try {
            System.out.println("inceput EXTERIOR");
            try {
                int x = 10 / 0;
            } catch (Exception e) {
                System.out.println("exceptie INTERNA: " + e);
            }
            System.out.println("executia continua EXTERN");
            int[] a = {1};
            System.out.println(a[1]);
        } catch (Exception e) {
            System.out.println("exceptie EXTERNA: " + e);
        }

        System.out.println();
        System.out.println(18 < 0 && (10 / 0) > 1); // false

        System.out.println(18 > 0 && (10 / 0) > 1); // AE

        System.out.println(18 > 0 || (10 / 0) > 1); // true

        System.out.println(18 < 0 || (10 / 0) > 1); // AE
    }
}
