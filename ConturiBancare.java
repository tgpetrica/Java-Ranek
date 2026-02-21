class Cont {
    String client;
    double sold;
    String moneda;

    public Cont (String client, double sold) {
        this.client = client;
        this.sold = sold;
        this.moneda = "RON";
        System.out.println("Cont2");
    }

    public Cont (String client, double sold, String moneda) {
        this.client = client;
        this.sold = sold;
        this.moneda = moneda;
        System.out.println("Cont3");
    }
}

class ContEconomii extends Cont {
    double dobanda;

    public ContEconomii(String client, double sold, double dobanda) {
        super(client, sold);
        this.dobanda = dobanda;
        System.out.println("Economii3");
    }

    public ContEconomii(String client, double sold, String moneda, double dobanda) {
        super(client, sold, moneda);
        this.dobanda = dobanda;
        System.out.println("Economii4");
    }

    void afisare() {
        System.out.println("Client: " + client);
        System.out.println("Sold: " + sold + " " + moneda);
        System.out.println("Dobanda: " + dobanda + "%");
    }
}


public class ConturiBancare {
    public static void main(String[] args) {
        ContEconomii c1 = new ContEconomii("Ana Popescu", 1500, 2.5);
        c1.afisare();
        
        System.out.println();

        ContEconomii c2 = new ContEconomii("Mihai Ionescu", 1300, "EUR", 1.9);
        c2.afisare();
    }
}
