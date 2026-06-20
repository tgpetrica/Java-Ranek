package Accel;
import java.util.ArrayList;
import java.util.Scanner;

public class CinemaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdu numele cinematografului: ");
        String numeCinema = sc.nextLine();
        Cinema cinema = new Cinema(numeCinema);

        System.out.print("Introdu numarul de sali: ");
        int numarSali = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i < numarSali; i++) {
            System.out.print("Introdu numele salii: ");
            String numeSala = sc.nextLine();

            System.out.print("Introdu capacitatea salii: ");
            int capax = sc.nextInt();
            sc.nextLine();

            Cinema.Sala sala = cinema.new Sala(numeSala, capax, 0);
            cinema.adaugaSala(sala);
        }

        System.out.println();

        for (Cinema.Sala sala : cinema.getSali()) {
            System.out.print("Cate locuri vrei in " + sala.getNumeSala() + "?: ");
            int numarLocuri = sc.nextInt();
            sc.nextLine();
            sala.cumparaBilet(numarLocuri);
        }

        System.out.print("Introdu numarul de bilete: ");
        int numarBilete = sc.nextInt();
        sc.nextLine();

        ArrayList<Cinema.Bilet> bilete = new ArrayList<>();
        ArrayList<Integer> cantitati = new ArrayList<>();

        for (int i = 1; i <= numarBilete; i++) {
            System.out.print("Introdu numele filmului: ");
            String film = sc.nextLine();
            System.out.print("Introdu pretul biletului: ");
            double pret = sc.nextDouble();
            sc.nextLine();

            System.out.print("Introdu tipul biletului: ");
            String tipBilet = sc.nextLine().toUpperCase();

            Cinema.TipBilet tip = Cinema.TipBilet.valueOf(tipBilet);

            System.out.print("Introdu numarul de bilete cumparate: ");
            int nrBilete = sc.nextInt();
            sc.nextLine();

            Cinema.Bilet bilet = new Cinema.Bilet(film, pret, tip);

            bilete.add(bilet);
            cantitati.add(nrBilete);
        }

        System.out.println("\n\n");

        System.out.println("Cinema: " + cinema.getNume());
        for (Cinema.Sala sala: cinema.getSali()) {
            sala.afiseazaInformatii();
        }

        double costTotal = 0;

        for (int i = 0; i < bilete.size(); i++) {
            Cinema.Bilet bilet = bilete.get(i);
            int q = cantitati.get(i);

            double cost = bilet.calculeazaPret(q);
            costTotal += cost;
        }

        System.out.println("Costul total al rezervarilor: " + costTotal + " lei.");
        sc.close();
    }
}

class Cinema {
    private ArrayList<Sala> sali;
    private String nume;
    public Cinema(String nume){
        this.nume = nume;
        this.sali = new ArrayList<>();
    }
    public String getNume(){
        return nume;
    }
    public ArrayList<Sala> getSali(){
        return sali;
    }
    public void adaugaSala(Sala sala) {
        sali.add(sala);
    }


    class Sala {
        private String numeSala;
        private int maxCapacitate;
        private int locuriReservate;
        
        public Sala(String numeSala, int maxCapacitate, int locuriReservate){
            this.numeSala = numeSala;
            this.maxCapacitate = maxCapacitate;
            this.locuriReservate = locuriReservate;
        }
        public String getNumeSala(){
            return numeSala;
        }
        public boolean verificaDisponibilitate(int numarBilete){
            return locuriReservate + numarBilete <= maxCapacitate;
        }
        public int getLocuriDisponibile(){
            return maxCapacitate - locuriReservate;
        }

        public void afiseazaInformatii() {
            System.out.println("Sala " + numeSala);
            System.out.println("Capcitate: " + maxCapacitate);
            System.out.println("Rezervari: " + locuriReservate);
            System.out.println("Disponibile: " + getLocuriDisponibile());
            System.out.println();
        }

        public void cumparaBilet(int numarLocuri) {
            if (numarLocuri < 1) {
                System.out.println("Numarul de locuri trebuie sa fie pozitiv");
                return;
            }
            if (verificaDisponibilitate(numarLocuri)) {
                locuriReservate += numarLocuri;
                System.out.println("Rezervarea a fost achizitionata cu succes pentru" + numarLocuri);
            } else {
                System.out.println("Rezervarea nu a putut fi achizitionata. Numar indisponibil de locuri.");
            }
        }
    }

    enum TipBilet {
        STANDARD,
        ELEV,
        VIP
    }

    static class Bilet {
        private String film;
        private double pret;
        private TipBilet tip;

        public Bilet (String film, double pret, TipBilet tip) {
            this.film = film;
            this.pret = pret;
            this.tip = tip;
        }

        public String getFilm() {
            return film;
        }

        public double getPret() {
            return pret;
        }

        public TipBilet getTip() {
            return tip;
        }

        public double calculeazaPret(int numarBilete) {
            return pret * numarBilete;
        }

    }
}
