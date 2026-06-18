package czw;
import java.util.HashMap;
import java.util.Scanner;

class Produs {
    private String codBare;
    private String denumire;
    private double pret;
    private int cantitate;

    public Produs (String codBare, String denumire, double pret, int cantitate) {
        this.codBare = codBare;
        this.denumire = denumire;
        this.pret = pret;
        this.cantitate = cantitate;
    }

    public String getCodBare() {
        return codBare;
    }

    public String getDenumire() {
        return denumire;
    }

    public double getPret() {
        return pret;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setPret(double pretNou) {
        pret = pretNou;
    }

    public void setCantitate(int cantitateNoua) {
        cantitate = cantitateNoua;
    }

    // incapsularea: concept POO in care variabilele sunt private (ascunse publicului) pentru a nu putea fi accesate si modificate in mod direct
    // se permite accesul catre aceste campuri cu ajutorul metodelor accesoare/getteri (read) si mutatoare/setteri (write)
    
    // https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#toString--
    @Override
    public String toString() {
        return "cod: " + codBare + ", " + 
            "denumire: " + denumire + ", " + 
            "pret: " + pret + ", " + 
            "cantitate: " + cantitate;
    }
}

public class Magazin {
    private static Scanner sc = new Scanner(System.in);
    private static HashMap<String, Produs> stoc = new HashMap<>();

    public static void afisareMeniu() {
        System.out.println("//Meniu");
        System.out.println("1 > adauga produs");
        System.out.println("2 > actualizeaza cantitate");
        System.out.println("3 > cauta produs dupa cod bare");
        System.out.println("4 > sterge produs");
        System.out.println("5 > afiseaza toate produsele");
        System.out.println("6 > inregistreaza vanzare");
        System.out.println("0 > IESIRE");
    }

    public static void adaugaProdus() {
        System.out.print("Introdu codul de bare: ");
        String codBare = sc.nextLine();

        if (stoc.containsKey(codBare)) {
            System.out.println("Exista deja un produs cu acest code de bare.");
            return;
        }

        System.out.print("Introdu denumirea produsului: ");
        String denumire = sc.nextLine();

        double pret = citesteDouble("Introdu pretul produsului: ");
        int cantitate = citesteInt("Introdu cantitatea initiala: ");

        if (pret < 0  || cantitate < 0) {
            System.out.println("Pretul si cantitatea nu pot negative.");
            return;
        }

        Produs produsNou = new Produs(codBare, denumire, pret, cantitate);

        stoc.put(codBare, produsNou);

        System.out.println("Produsul a fost adaugat in stoc.");
    }

    public static void actualizeazaCantitate() {
        System.out.print("Introdu codul de bare al produsului: ");
        String codBare = sc.nextLine();

        Produs prod = stoc.get(codBare);

        if (prod == null) {
            System.out.println("Produsul nu exista in stoc.");
            return;
        }

        int cant = citesteInt("Introdu noua cantitate: ");
        if (cant < 0) {
            System.out.println("Cantitatea nu poate fi negativa.");
            return;
        }

        prod.setCantitate(cant);
        System.out.println("Cantitatea a fost actualizata.");
    }

    public static void cautaProdus() {
        System.out.print("Introdu codul de bare: ");

        String codBare = sc.nextLine();

        Produs prod = stoc.get(codBare);

        if (prod == null) {
            System.out.println("Produsul nu a putut fi gasit.");
        } else {
            System.out.println("Produs gasit.");
            System.out.println(prod);
        }
    }

    public static void stergeProdus() {
        System.out.print("Introdu codul de bare: ");

        String codBare = sc.nextLine();

        Produs prod = stoc.get(codBare);

        if (prod == null) {
            System.out.println("Produsul nu exista.");
        } else {
            stoc.remove(codBare);
            System.out.println("Produsul " + prod.getDenumire() + " a fost sters.");
        }
    }

    public static void afisareProduse() {
        if (stoc.isEmpty()) {
            System.out.println("Stocul este gol.");
            return;
        }

        System.out.println("///Produse disponibile in stoc: ");
        for (String codBare : stoc.keySet()) {
            Produs p = stoc.get(codBare);
            System.out.println(p);
        }
    }

    public static void inregistreazaVanzare() {
        System.out.print("Introdu codul de bare al produsului: ");
        String codBare = sc.nextLine();

        Produs p = stoc.get(codBare);

        if (p == null) {
            System.out.println("Produsul nu este in stoc.");
            return;
        }

        int q = citesteInt("Introdu cantitatea ceruta: ");
        if (q <= 0) {
            System.out.println("Cantitatea ceruta trebuie sa fie cel putin 1.");
            return;
        }

        if (p.getCantitate() < q) {
            System.out.println("Stoc insuficient. Cantitate disponibila: " + p.getCantitate());
            return;
        }

        p.setCantitate(p.getCantitate() - q);

        double total = q * p.getPret();

        System.out.println("Vanzare inregsitrata.");
        System.out.println("Produs: " + p.getDenumire());
        System.out.printf("Total de plata: %.2f RON", total);
        System.out.println("Cantitatea ramasa: " + p.getCantitate());
    }

    public static double citesteDouble(String mesaj) {
        while (true) {
            try {
                System.out.print(mesaj);
                String input = sc.nextLine().replace(",", ".");
                double valoare = Double.parseDouble(input);
                return valoare;
            } catch (NumberFormatException nfe) {
                System.out.println("Introdu un pret valid.");
            }
        }
    }

    public static int citesteInt(String mesaj) {
        while (true) {
            try {
                System.out.print(mesaj);
                int valoare = Integer.parseInt(sc.nextLine());
                return valoare;
            } catch (NumberFormatException nfe) {
                System.out.println("Introdu o cantitate valida.");
            }
        }
    }

    public static void main(String[] args) {
        int optiune;

        do {
            afisareMeniu();
            optiune = citesteInt("Alege o optiune: ");

            switch (optiune) {
                case 1:
                    adaugaProdus();
                    break;
                case 2:
                    actualizeazaCantitate();
                    break;
                case 3:
                    cautaProdus();
                    break;
                case 4:
                    stergeProdus();
                    break;
                case 5:
                    afisareProduse();
                    break;
                case 6:
                    inregistreazaVanzare();
                    break;
                case 0:
                    System.out.println("Aplicatia s-a inchis");
                    break;
            
                default:
                    System.out.println("optiunea este invalida.");
            }
        } while (optiune != 0);
        sc.close();
    }
}
