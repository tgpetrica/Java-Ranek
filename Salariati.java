public class Salariati {
    public static void main(String[] args) {
        Angajat<Integer> a1 = new Angajat<>(5000);
        a1.afisareSalariu();

        Angajat<String> a2 = new Angajat<>("3 pizza");
        a2.afisareSalariu();

        Angajat<String> a3 = new Angajat<>("2 cafele si un covrig");
        a3.afisareSalariu();
    }
}

class Angajat<T> {
    T salariu;

    Angajat (T salariu) {
        this.salariu = salariu;
    }

    void afisareSalariu () {
        System.out.println("Salariu: " + salariu);
    }
}
