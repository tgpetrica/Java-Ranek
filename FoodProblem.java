class Food {
    public String getName() {
        return "Food";
    }
}

class Meat extends Food {
    public String getName() {
        return "Meat";
    }
}

class Steak extends Meat {
    public String getName() {
        return "Steak";
    }
}

class Chicken extends Meat {
    public String getName() {
        return "Chicken";
    }
}

class Plant extends Food {
    public String getName() {
        return "Plant";
    }
}

class Grass extends Plant {
    public String getName() {
        return "Grass";
    }
}

class Leaves extends Plant {
    public String getName() {
        return "Leaves";
    }
}

class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(Food f) {
        System.out.println(name + " eats " + f.getName());
    }
}

class Carnivore extends Animal {
    public Carnivore(String name) {
        super(name);
    }

    @Override
    public void eat (Food f) {
        if (f instanceof Meat) {
            System.out.println(name + " eats " + f.getName());
        } else {
            System.out.println(name + " cannot eat " + f.getName());
        }
    }
}

class Herbivore extends Animal {
    public Herbivore(String name) {
        super(name);
    }

    @Override
    public void eat (Food f) {
        if (f instanceof Plant) {
            System.out.println(name + " eats " + f.getName());
        } else {
            System.out.println(name + " cannot eat " + f.getName());
        }
    }
}

class Omnivore extends Animal {
    public Omnivore(String name) {
        super(name);
    }

    @Override
    public void eat (Food f) {
        if (f instanceof Plant || f instanceof Meat) {
            System.out.println(name + " eats " + f.getName());
        } else {
            System.out.println(name + " cannot eat " + f.getName());
        }
    }
}

public class FoodProblem {
    public static void main(String[] args) {
        Food steak = new Steak();
        Food chicken = new Chicken();
        Food grass = new Grass();
        Food leaves = new Leaves();

        Animal lion = new Carnivore("Lion");
        Animal sheep = new Herbivore("Sheep");
        Animal monkey = new Omnivore("Monkey");

        lion.eat(leaves);
        lion.eat(grass);
        lion.eat(steak);

        sheep.eat(leaves);
        sheep.eat(chicken);
        
        monkey.eat(leaves);
        monkey.eat(steak);
    }
}