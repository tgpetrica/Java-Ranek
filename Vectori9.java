public class Vectori9 {
    public static void main(String[] args) {
        int[] v = {-79, -50, 185, 232, 379};
        boolean OK = true; // presupunem faptul ca v este ordonat strict crescator.

        for (int i = 1; i < v.length; i++) {
            if (v[i - 1] >= v[i]) {
                OK = false; // avem certitudinea ca v nu este ordonat.
                break;
            }
        }

        if (OK) {
            System.out.println("strict crescator");
        } else {
            System.out.println("Vectorul nu este ordonat.");
        }

    }
}
