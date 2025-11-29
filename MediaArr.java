public class MediaArr {
    public static void main(String[] argv) {
        int[] v = {1, 2, 3, 5};
        //int[] v = {};
        float medie = 0;
        float suma = 0;

        for (int e : v) {
            suma += e;
        }

        if (v.length != 0) {
            medie = suma / v.length;
            System.out.println("Media: " + medie);
        } else {
            System.out.println("Nu se poate imparti la 0.");
        }

        
    }
}
