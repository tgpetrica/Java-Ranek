package Accel;
public class Loop {
    public static void main(String[] args) {
        outer:
            for (int i = 0; i < 5; i++) {
                System.out.println("i = " + i);
                for (int j = 0; j < 5; j++) {
                    System.out.println("\tj = " + j);
                    if (j == 3) break outer;
                }
            }
        System.out.println("EXIT");

        System.out.println();

        int[] nr = {1,2,3,4,5,10,20,50};

        for (int numar : nr) { // for (int numar = 0; numar < nr.length; numar ++)
            System.out.print(numar + " ");
        }
    }
}