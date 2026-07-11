class Sandwich {
    private String bread;
    private boolean hasCheese;
    private boolean hasButter;
    private boolean hasSauce;
    private boolean hasTomato;
    private boolean hasPepper;

    public Sandwich (SandwichBuilder builder) {
        this.bread      = builder.bread;
        this.hasCheese  = builder.hasCheese;
        this.hasButter  = builder.hasButter;
        this.hasSauce   = builder.hasSauce;
        this.hasTomato  = builder.hasTomato;
        this.hasPepper  = builder.hasPepper;
    }
}

class SandwichBuilder {
    String bread;
    boolean hasCheese;
    boolean hasButter;
    boolean hasSauce;
    boolean hasTomato;
    boolean hasPepper;

    public SandwichBuilder setBread(String bread) {
        this.bread = bread;
        return this;
    }

    public SandwichBuilder addCheese() {
        this.hasCheese = true;
        return this;
    }

    public SandwichBuilder addButter() {
        this.hasButter = true;
        return this;
    }

    public SandwichBuilder addSauce() {
        this.hasSauce = true;
        return this;
    }

    public SandwichBuilder addTomato() {
        this.hasTomato = true;
        return this;
    }

    public SandwichBuilder addPepper() {
        this.hasPepper = true;
        return this;
    }

    public Sandwich build() {
        return new Sandwich(this);
    }
}

public class BuilderSandwich {
    public static void main(String[] args) {
        Sandwich sandwich = new SandwichBuilder()
                .setBread("integrala")
                .addButter()
                .addCheese()
                .addTomato()
                .build();
        
        Sandwich sandwich2 = new SandwichBuilder()
                .setBread("cu seminte")
                .addTomato()
                .addCheese()
                .build();
        
    }
}
