import java.time.LocalDate;

abstract class Locuinta {
    int suprafata;
    String adresa;

    Locuinta() {
        suprafata = 0;
        adresa = "ceva";
    }

    Locuinta(String adresa, int suprafata) {
        this.adresa = adresa;
        this.suprafata = suprafata;
    }

    @Override
    public String toString() {
        return "Adresa: " + adresa + ",\tS = " + suprafata + "mp";
    }

    public abstract void calculeazaPret();    
}

class Apartament extends Locuinta {
    int etaj;

    public Apartament(String adresa, int suprafata, int etaj) {
        super(adresa, suprafata);
        this.etaj = etaj;
    }

    @Override
    public String toString() {
        return super.toString() + ",\tEtaj: " + etaj;
    }

    @Override
    public void calculeazaPret() {
        int pret = 200 * suprafata + (30 * 200 * suprafata) / 100;
        System.out.println("Pret Apartament: " + pret + "u.m.");
    }
}

class Vila extends Locuinta {
    int suprafataCurte;

    public Vila(String adresa, int suprafata, int suprafataCurte) {
        super(adresa, suprafata);
        this.suprafataCurte = suprafataCurte;
    }

    @Override
    public String toString() {
        return super.toString() + ",\tCurte: " + suprafataCurte + "mp";
    }

    @Override
    public void calculeazaPret() {
        int pret = suprafata * 250 + suprafataCurte * 100;
        System.out.println("Pret Vila: " + pret + "u.m.");
    }
}

public class CaseAbstracte {
    public static void main(String[] args) {
        //Locuinta locuinta = new Locuinta("str Dacia nr3", 52); //  error: Locuinta is abstract; cannot be instantiated
        Locuinta a = new Apartament("Bd Dorobantilor nr 36", 52, 3);
        System.out.println(a.toString());
        a.calculeazaPret();

        Locuinta v = new Vila("Str Mihai Eminescu nr 139", 390, 300);
        System.out.println(v.toString());
        v.calculeazaPret();
    }
}
