package Accel;

abstract class Vehicle{
    int ID;
    String model;
    
    public Vehicle(int ID, String model){
        this.ID = ID;
        this.model = model;
    }

    public void afisareInformatii(){
        System.out.println(ID);
        System.out.println(model);

    }

    public abstract double calculeazaCost(double distance);
}

interface Electric{
    void BatteryCharge();
}

interface Combustibil{
    void AlimentareBenzina();
}

class MasinaElectrica extends Vehicle implements Electric{
    MasinaElectrica(int id, String nume){
        super(id, nume);
    }

    @Override
    public void BatteryCharge() {
        System.out.println("Battery was charged");
    }

    @Override
    public double calculeazaCost(double distance){
        return distance * 2.5;
    }
    
}

class MasinaBenzina extends Vehicle implements Combustibil{
    MasinaBenzina(int id, String name){
        super(id, name);
    }

    @Override 
    public void AlimentareBenzina() {
        System.out.println("Tank is full");
    }

    

    @Override 
    public double calculeazaCost(double distance){
        return distance * 3.5 + 10;
    }
}

class TrotinetaElectrica extends Vehicle implements Electric{
    TrotinetaElectrica(int id, String name){
        super(id, name);
    }

    @Override 
    public void BatteryCharge() {
        System.out.println("Battery has been charged.");
    }

    @Override 
    public double calculeazaCost(double distance){
        return distance * 0.85;
    }
}



public class RideSharing{
    public static void main(String[] args) {
        Vehicle[] vehicule = {
            new MasinaElectrica(1, "Tesla model 3"),
            new MasinaBenzina(2, "Dacia Logan"),
            new TrotinetaElectrica(3, "xiaomi scooter")
        };

        double distanta = 10;

        for (Vehicle v : vehicule) {
            v.afisareInformatii();

            double cost = v.calculeazaCost(distanta);

            System.out.println("Cost cursa: " + cost + " lei");

            if (v instanceof Electric) {
                Electric e = (Electric) v;
                e.BatteryCharge();
            }

            if (v instanceof Combustibil) {
                Combustibil c = (Combustibil) v;
                c.AlimentareBenzina();
            }
        }
    }
}