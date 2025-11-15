import java.util.Arrays;

public class Vectori {
    public static void main(String[] args) {
        int[] distante = new int[120];
        System.out.println(distante);  // afiseaza locatia din memorie unde e salvat 
        
        System.out.println(distante[0]);
        System.out.println(distante[1]);

        distante[0] = 20;
        System.out.println(distante[0]);
        System.out.println(distante.length);

        int[] arr = new int [3]; // 0, 0, 0
        int[] brr = new int [3]; // 0, 0, 0
        System.out.println(Arrays.equals(arr, brr));
        brr[2] = 12; // 0, 0, 12
        System.out.println(Arrays.equals(arr, brr));
    }
}
