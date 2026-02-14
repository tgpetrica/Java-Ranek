public class ContBancar {
    private String titular;
    private double sold;

    public ContBancar(String titular, double sold) {
        this.titular = titular;
        if (sold >= 0) {
            this.sold = sold;
        } else {
            this.sold = 0;
        }
    }

    // getter 
    String getTitular() {
        return titular;
    }

    double getSold() {
        return sold;
    }

    // setter
    void setSold(double suma) {
        sold = suma;
    }
}

class ContBancarMain {
    public static void main(String[] args) {
        ContBancar cont = new ContBancar("Popescu", 5.0);
        System.out.println(cont.getTitular());
        System.out.println(cont.getSold());
        cont.setSold(99.99);
        System.out.println(cont.getSold());
    }
}


