public class Angajat {
    String nume;
    private int salariu;

    public Angajat(String nume, int salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    public int getSalariu() { // metoda accesoare sau getter
        return salariu;
    }

    public void setSalariu(int salariuNou) { // metoda mutatoare sau setter
        salariu = salariuNou;
    }
}

class Main {
    public static void main(String[] args) {
        Angajat a1 = new Angajat("Popa", 1000);

        //System.out.println("Salariul: " + a1.salariu);
        System.out.println("Salariul: " + a1.getSalariu());

        //a1.salariu = 2000;
        a1.setSalariu(2000);

        //System.out.println("Salariul: " + a1.salariu);
        System.out.println("Salariul: " + a1.getSalariu());
    }
}
