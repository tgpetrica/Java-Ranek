package Accel;
import java.util.Scanner;

public class Buget {
    public static void main(String[] args) {
        Bun b1; 
        Bun b2;
        Consumator c;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introdu numele bunului 1: ");
        String nume1 = sc.nextLine();
        System.out.print("Introdu pretul bunului 1: ");
        int pret1 = sc.nextInt();

        sc.nextLine();
        System.out.print("Introdu numele bunului 2: ");
        String nume2 = sc.nextLine();
        System.out.print("Introdu pretul bunului 2: ");
        int pret2 = sc.nextInt();

        sc.nextLine();
        System.out.print("Introdu venitul consumatorului: ");
        int venit = sc.nextInt();
        
        b1 = new Bun(nume1, pret1); 
        b2 = new Bun(nume2, pret2); 
        c = new Consumator(venit); 

        Optimizator optimizator = new Optimizator();

        PachetConsum pc = optimizator.gasesteOptim(c, b1, b2);

        pc.afisare(c.getVenit());
    }
}

class Bun {
    private String nume;
    private int pret;
    
    public Bun(String nume, int pret){
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public int getPret() {
        return pret;
    }
}


class Consumator {
    private int venit;
    
    public Consumator(int venit){
        this.venit = venit;
    }

    public int getVenit() {
        return venit;
    }
    
    // U(x1, x2) = x1 + 2 * x2
    int calculeazaUtilitatea(int x1, int x2) {
        return x1 + x2;
    }
}

class PachetConsum {
    private int cantitateX1;
    private int cantitateX2;
    private int costTotal;
    private int utilitate;

    public PachetConsum(int cantitateX1, int cantitateX2, int costTotal, int utilitate) {
        this.cantitateX1 = cantitateX1;
        this.cantitateX2 = cantitateX2;
        this.costTotal = costTotal;
        this.utilitate = utilitate;
    }

    public void afisare (int venit) {
        System.out.println("Pachet optim de consum: ");
        System.out.println("cantitate x1: " + cantitateX1);
        System.out.println("cantitate x2: " + cantitateX2);
        System.out.println("cost total: " + costTotal + "u.m.");
        System.out.println("utilitate: " + utilitate);
        System.out.println("suma ramasa: " + (venit - costTotal) + "u.m.");
    }
}

class Optimizator {
    public PachetConsum gasesteOptim(Consumator c, Bun b1, Bun b2) {
        PachetConsum pachetOptim = null;
        int utilitateMaxima = -1;

        int max1 = c.getVenit() / b1.getPret();
        int max2 = c.getVenit() / b2.getPret();

        for (int x1 = 0; x1 <= max1; x1++) {
            for (int x2 = 0; x2 <= max2; x2++) {
                int costTotal = b1.getPret() * x1 + b2.getPret() * x2;

                if (costTotal <= c.getVenit()) {
                    int utilitate = c.calculeazaUtilitatea(x1, x2);

                    if (utilitate > utilitateMaxima) {
                        utilitateMaxima = utilitate;
                        pachetOptim = new PachetConsum(x1, x2, costTotal, utilitate);
                    }
                }
            }
        }
        return pachetOptim;
    }
}