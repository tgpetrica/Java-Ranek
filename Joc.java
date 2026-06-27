public class Joc {
    public static class Reguli {
        public void afiseazaReguliStart() {
            System.out.println("Start");
            System.out.println("- minim 2 jucatori");
            System.out.println("- la inceput, fiecare jucator are 0 puncte");
        }

        public void afiseazaReguliFinal() {
            System.out.println("Final");
            System.out.println("- castiga jucatorul care ajunge primul la 30 de puncte");
        }
    }

    public static void main(String[] args) {
        Joc.Reguli reguli = new Joc.Reguli();
        reguli.afiseazaReguliStart();
        reguli.afiseazaReguliFinal();
    }
}
