public class Evaluare {
    public void calculeazaRezultat() {
        String nume = "Teodor";
        double nota = 8.5;

        class RaportEvaluare {
            public void afiseazaRezultat() {
                System.out.println("Elev: " + nume);
                System.out.println("Nota: " + nota);

                String rezultat = (nota >= 5) ? "Promovat" : "Nepromovat";
                System.out.println("Status: " + rezultat);
            }
        }

        RaportEvaluare raport = new RaportEvaluare();
        raport.afiseazaRezultat();
    }
    public static void main(String[] args) {
        Evaluare e = new Evaluare();
        e.calculeazaRezultat();
    }
}
