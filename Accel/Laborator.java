package Accel;

class Celula {

    protected String name;
    protected float dimensiuni;
    protected float energie;

    public String getName() {
        return name;
    }

    public float getDimensiuni() {
        return dimensiuni;
    }

    public float getEnergie() {
        return energie;
    }

    Celula(String nume, float dimensiuni, float energie) {

        this.name = nume;
        this.dimensiuni = dimensiuni;
        this.energie = energie;
    }

    public void afiseazaInformatii() {

        System.out.println("----------------------");
        System.out.println("Nume celula: " + getName());
        System.out.println("Dimensiuni: " + getDimensiuni());
        System.out.println("Energie: " + getEnergie());
        System.out.println("----------------------");
    }

}

class CelulaVegetala extends Celula {

    public int numCloroplaste;

    private final float ENERGY_INCREMENT = 1.0f;

    public float getEnergyIncrement() {
        return ENERGY_INCREMENT;
    }

    CelulaVegetala(String nume, float dimensiuni, float energie, int numCloroplaste) {

        super(nume, dimensiuni, energie);
        this.numCloroplaste = numCloroplaste;
    }

    public void fotosinteza() {
        this.energie += ENERGY_INCREMENT;
    }

    @Override
    public void afiseazaInformatii() {
        super.afiseazaInformatii();
        System.out.println("Numar cloroplaste: " + numCloroplaste);
    }

}
class Bacteria extends Celula{
    String tipNutritie;
    Bacteria(String nume, float energie, float dimensiuni,String tipNutritie){
        super(nume,dimensiuni,energie);
        this.tipNutritie=tipNutritie;
    }
    public void inmultire(){
        System.out.println("Bacteria se inmulteste...");
    }
    @Override
    public void afiseazaInformatii(){
        super.afiseazaInformatii();
        System.out.println("tipul de nutritie este:"+tipNutritie);
    }

    
}

public class Laborator {

    public static void main(String[] args) {

        CelulaVegetala celulaVegetala = new CelulaVegetala("celula_frunzei", 10.f, 5.f, 10);

        celulaVegetala.afiseazaInformatii();
        celulaVegetala.fotosinteza();
        celulaVegetala.afiseazaInformatii();

        Bacteria bacterie = new Bacteria("E.coli",5.f,2.f,"heterotrofa");
        bacterie.afiseazaInformatii();
        bacterie.inmultire();
        bacterie.afiseazaInformatii();

    }

}
