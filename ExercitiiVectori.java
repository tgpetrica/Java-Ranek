import java.util.Arrays;

public class ExercitiiVectori {
    public static void main(String[] args) {
        int[] v = {50, 0, 21, 19, 15};

        System.out.println(v[0] + " " + v[v.length - 1]);

        v[2] = 100;

        System.out.println("Lungime: " + v.length);

        int[] c = Arrays.copyOf(v, v.length); // salveaza in c, "v.length" elemente din vectorul v

        //System.out.println(v[2]+ " " + c[2]);

        Arrays.sort(c); // ordoneaza crescator valorile din vectorul c
    }
}
