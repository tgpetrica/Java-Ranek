package Accel;
public class ABC {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("nr argumente prea mic");
        }
        String nume = args[0];

        String oras = args[1];
        System.out.println("Salutare, numele meu este " + nume);
        System.out.println("Locuiesc in " + oras);
    }
}