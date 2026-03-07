class Persoana {
    String nume;
    int varsta;

    public Persoana (String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public String toString() {
        return "Persoana: nume - " + nume + ", varsta - " + varsta;
    }
}

class Profesor extends Persoana {
    String materie;
    double salariu;

    public Profesor(String numa, int varsta, String materie, double salariu) {
        super(numa, varsta);
        this.materie = materie;
        this.salariu = salariu;
    }

    public String toString() {
        return "Profesor: nume - " + nume 
                    + ", varsta - " + varsta 
                    + ", materie - " + materie 
                    + ", salariu - " + salariu;
    }

    void preda() {
        System.out.println("Prof preda un curs.");
    }

    void preda(String materie) {
        System.out.println("Prof preda " + materie);
    }

    void preda (String materie, int durata) {
        System.out.println("Prof preda " + materie + " in " + durata + " minute.");
    }
}
public class TestEducatie {
    public static void main(String[] args) {
        Persoana p1 = new Persoana("Ana", 25);
        Profesor prof1 = new Profesor("Ionescu", 30, "Algebra", 4000);

        System.out.println(p1.toString());
        System.out.println(prof1.toString());

        prof1.preda();
        prof1.preda("Bazele Programarii Calculatoarelor");
        prof1.preda("Pachete Software", 100);
        //prof1.preda(100, "PSW");
    }
}