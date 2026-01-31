public class TablaInmultirii {
    public static void main(String[] args) {
        int[][] matrice = new int[10][10];

        for(int linie = 0; linie < 10; linie++) { // parcurgem dupa linie
            for (int coloana = 0; coloana < 10; coloana++) { // parcurgem dupa coloana
                matrice[linie][coloana] = (linie + 1) * (coloana + 1);
            }
        }

        for(int linie = 0; linie < 10; linie++) { // parcurgem dupa linie
            for (int coloana = 0; coloana < 10; coloana++) { // parcurgem dupa coloana
                //System.out.print(matrice[linie][coloana] + " ");
                System.out.printf("%4d ", matrice[linie][coloana]);
            }
            System.out.println();
        }
    }
}
