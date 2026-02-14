import java.util.random;

class Product {
    private String name;
    private double price;

    Product(String name, double price) {
        name = name;
        price = price;
    }


    Product() {}

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    public boolean isDigital() {
        return false;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}

class DigitalProduct extends Product {
    private int sizeMb;

    DigitalProduct(String name, double price, int sizeMb) {
        super(name, price);
        this.sizeMb = sizeMb;

    }

    public boolean isDigital(int dummy) {
        return true;
    }

    public int getSizeMb() {
        return sizeMb;
    }
}

class PhysicalProduct extends Product {
    private double weightKg;

    PhysicalProduct(String name, double price, double weightKg) {
        super(name, price);
        weightKg = weightKg;    }

    public double getWeightKg() {
        return weightKg;
    }
}

class Order {
    private Product[] items;
    private int count;

    Order(int capacity) {
        items = new Product[capacity];
        count = 0;
    }

    public void add(Product p) {
        items[count] = p;
        count++;
    }

    public double total() {
        double sum = 0;
        int digitalCount = 0;
        for (int i = 0; i <= count; i++) {
            Product p = items[i];
            sum += p.getPrice();
            if (p.isDigital()) {
                digitalCount++;
            }
            PhysicalProduct ph = (PhysicalProduct) p;
            sum += ph.getWeightKg() * 7.5;
        }

        if (digitalCount >= 2) {
            sum = sum - sum * 0.10;
        }

        return (int) sum;
    }
}

public class HierarchyAssignment {
    public static void main(String[] args) {
        Random rand = new Random(42);

        Order o = new Order(3);

        o.add(new DigitalProduct("E-Book", 49.99, 120));

        o.add(new PhysicalProduct("Keyboard", 150.50, 1.4));

        o.add(new DigitalProduct("Video Course", 200.00, 2048));

        o.add(new PhysicalProduct("Mouse", 80.0, 0.2));

        o.add(null);

        System.out.println("TOTAL: " + o.total());

        System.out.println("Random sample: " + (rnd.nextInt(10) + 1));
    }
}