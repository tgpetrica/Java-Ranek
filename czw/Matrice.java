package czw;

public class Matrice {
    // tabele bidimensionale
    // latime,inaltime
    /*
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5

        3 linii
        5 coloane
        15 elemente in total
    */

    public static void main(String[] args) {
        int[][] matrice;
        double[][] preturi;
        String[][] nume;

        matrice = new int[3][4]; // 3L, 4C
        System.out.println(matrice[2][3]); // matrice este neinitializat si preia valoarea implicita a tipului de date
        int[][] numere = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {-1, -1, -1}
        };
        System.out.println(numere[2][0]); // indexarea pe linii si pe coloane este de la 0
        System.out.println(numere[1]); // afiseaza o referinta interna asupra liniei cu indexul 1 din matrice
        numere[2][0] = 10;
        System.out.println(numere[2][0]);
        System.out.println("L: " + numere.length);
        System.out.println("C: " + numere[0].length);

        System.out.println("total: " + matrice.length * matrice[0].length);

        for (int L = 0; L < numere.length; L++) {
            for (int C = 0; C < numere[0].length; C++) {
                System.out.print(numere[L][C] + " ");
            }
        }

        System.out.println();
        for (int C = 0; C < numere[0].length; C++) {
            for (int L = 0; L < numere.length; L++) {
                System.out.print(numere[L][C] + " ");
            }
        }

        System.out.println();
        // jagged arrays
        int [][] jagged = {
            {1, 2, 3},
            {4, 5},
            {6}
        };

        for (int L = 0; L < jagged.length; L++) {
            int suma = 0;
            for (int C = 0; C < jagged[L].length; C++) {
                //System.out.print(jagged[L][C] + " ");
                suma += jagged[L][C];
            }
            System.out.println("suma " + L + " = " + suma);
        }
        /*
        Lucru individual:
        1. Se declara o matrice si se initializeaza cu valori alese. 
        Sa se afiseze suma elementelor, parcurgand matricea pe coloane.

        */


    }
}
