import java.util.Scanner;

public class ConvertorValutar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double EUR = 5.09; // RON
        double USD = 4.46; // RON
        double PLN = 1.19; // RON
        double DKK = 0.68; // RON

        System.out.print("Introdu suma: ");
        String suma = sc.nextLine();

        double s = Double.parseDouble(suma);

        System.out.print("Alege valuta sursa: RON, EUR, USD, PLN, DKK: ");
        String sursa = sc.nextLine();

        System.out.print("Alege valuta destinatie: ");
        String destinatie = sc.nextLine();

        double sumaRON = 0.0;

        if(sursa.equals("RON")) sumaRON = s;
        if(sursa.equals("EUR")) sumaRON = s * EUR;
        if(sursa.equals("USD")) sumaRON = s * USD;
        if(sursa.equals("PLN")) sumaRON = s * PLN;
        if(sursa.equals("DKK")) sumaRON = s * DKK;

        double rezulat = 0.0;
        if(destinatie.equals("RON")) rezulat = sumaRON;
        if(destinatie.equals("EUR")) rezulat = sumaRON / EUR;
        if(destinatie.equals("USD")) rezulat = sumaRON / USD;
        if(destinatie.equals("PLN")) rezulat = sumaRON / PLN;
        if(destinatie.equals("DKK")) rezulat = sumaRON / DKK;

        System.out.printf("Rezulat: %.2f %s", rezulat, destinatie);
        sc.close();
    }
}
