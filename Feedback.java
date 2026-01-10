import java.util.Scanner;

public class Feedback {
    String numeClient;
    int[] scoruri;

    public Feedback(String numeClient, int nrScoruri) {
        this.numeClient = numeClient;
        this.scoruri = new int [nrScoruri];
        citireScoruri();
    }

    public Feedback() {
        this.numeClient = "Fara nume";
        this.scoruri = new int[0];
    }

    void citireScoruri() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < scoruri.length; i++) {
            System.out.print("Scor " + (i + 1) + ": ");
            scoruri[i] = scanner.nextInt();
        }
    }

    double scorMediu() {
        int suma = 0;
        for (int scor : scoruri) {
            suma += scor;
        }
        return scoruri.length == 0 ? 0 : (double) suma / scoruri.length;
    }

    double deviatiaMaxima() {
        double medie = scorMediu();
        double maxDev = 0;

        for (int scor : scoruri) {
            double dev = Math.abs(scor - medie);
            if (dev > maxDev) {
                maxDev = dev;
            }
        }
        return maxDev;
    }

    @Override
    public String toString() {
        return "Client: " + numeClient + 
        "\nScor mediu: " + scorMediu() + 
        "\nmaxDev: " + deviatiaMaxima();
    }

    public static void main(String[] args) {
        Feedback f1 = new Feedback(); // constructorul default

        Feedback f2 = new Feedback("Popescu Ion", 5);

        System.out.println(f1);
        System.out.println();
        System.out.println(f2);
    }

}
