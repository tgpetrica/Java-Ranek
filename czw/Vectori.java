package czw;

public class Vectori {
    // structuri de date: date tabelare, vectori
    // vector = structura care salveaza mai multe valori de acelasi tip

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        System.out.println(arr[0]);
        for (int element : arr) {
            System.out.print(element + " ");
        }

        int [] cifre = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("\nNumar cifre: " + cifre.length);

        // indexarea incepe de la 0

        int[] vector;
        vector = new int[5];
        // valoarea implicita care este salvata in vector de primitive este valoarea implicita a tipului de date

        String[] nume = new String[3];
        System.out.println(nume[0]);
        // valoarea implicita care este salvata in vectorul de obiecte este valoarea implicita a tipului, respectiv null
        nume[0] = "Ana";
        System.out.println(nume[0]);
        nume[0] = "Sofia";
        System.out.println(nume[0]);
        System.out.println(nume[0].toUpperCase());
        System.out.println("Lungimea: " + nume.length);

        // System.out.println(nume[3]); // java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

        for (int i = 0; i < cifre.length; i++) {
            System.out.print(cifre[i] + ".");
        }

        System.out.println();
        int i = 0;
        for (; i < cifre.length;) {
            System.out.print(cifre[i] + ".");
            i++;
        }

        System.out.println();
        for (int element : cifre) {
            System.out.print(element + ".");
        }

        // for-each este util atunci cand nu avem nevoie de o referinta asupra indexului

        System.out.println();
        String[] prenume = {"Ana", "Bogdan", "Camelia", "Diana"};
        System.out.println(prenume.length); // lungimea vectorului
        System.out.println(prenume[2].length()); // lungimea unui element din vector
    }
}
