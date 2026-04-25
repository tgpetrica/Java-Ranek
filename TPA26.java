import java.util.Scanner;

class Elev {
    String nume; 
}

public class TPA26 {
    /* Cerinta 1
    public static void main(String[] args) {
        String component = null;
        System.out.println(component.length());
    }
    */

    /* Cerinta 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numele: ");
        String nume = sc.nextLine();

        if (nume == null || nume.isEmpty()) {
            System.out.println("Nu ai introdus nimica");
        } else {
            System.out.println("Salut, " + nume);
        }

        sc.close();
    }
    */
   
    /* Cerinta 3
    public static void main(String[] args) {
        Elev e = null;
          
        System.out.println(e.nume);
    }
    */

    /* Cerinta 4
    public static void main(String[] args) {
        System.out.println("Radicalul lui 9 =" + Math.sqrt(9));
        System.out.println("Radicalul lui 16 =" + Math.sqrt(16));
        System.out.println("Radicalul lui -23 =" + Math.sqrt(-23));
        System.out.println("Radicalul lui -6 =" + Math.sqrt(-6));
        System.out.println("Radicalul lui 93 =" + Math.sqrt(93));
    }
    */

    /* Cerinta 5 var 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti nota elevului.");
        
        int nota = sc.nextInt();

        
        if(nota < 0 || nota > 10 ){
            System.out.println("Nota invalida.");
        }
    }
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] note = new int[11];
        System.out.println("Introdu nota eleveului: ");
        int nota = sc.nextInt();

        try {
            note[nota] = 100;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Nota invalida.");
        }
        sc.close();
    }
}
