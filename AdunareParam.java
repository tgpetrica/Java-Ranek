public class AdunareParam {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Nu ai doi parametri.");
            return;
        }

        try {
            int nr_1 = Integer.parseInt(args[0]);
            int nr_2 = Integer.parseInt(args[1]);

            int suma = nr_1 + nr_2;

            System.out.println("Suma: " + suma);
        } catch (NumberFormatException e) {
            System.out.println("Ambele argumente trebuie sa fie numere intregi.");
            // System.out.println(e.getClass().getName());
        }
    }
}
