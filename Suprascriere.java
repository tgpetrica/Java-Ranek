class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getDescription() {
        return "Product: " + name + ", price: " + price + " RON";
    }
}

class Biscuit extends Product {
    private String flavor;
    public Biscuit (String name, double price, String flavor) {
        super(name, price);
        this.flavor = flavor;
    }

    @Override
    public String getDescription() {
        return "Product: " + name + ", flavor: " + flavor + ", price: " + price + " RON";
    }
}

public class Suprascriere {
    public static void main(String[] args) {
        Product p1 = new Product("generic", 10);
        Product p2 = new Biscuit("Oreo", 5.5, "Chocolate");

        System.out.println(p1.getDescription());
        System.out.println(p2.getDescription());
    }
}
