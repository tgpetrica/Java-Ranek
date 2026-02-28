public class Supraincarcare {
    public static int aduna(int a, int b) {
        return a + b;
    }

    public static int aduna(int a, int b, int c) {
        return a + b + c;
    }

    public static double aduna(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        //Supraincarcare s = new Supraincarcare();
        System.out.println(aduna(3,5.3));
        System.out.println(aduna(1,2,3));
        System.out.println(aduna(3.15, 2));
    }
}

