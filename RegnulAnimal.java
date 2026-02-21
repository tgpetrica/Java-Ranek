public class RegnulAnimal {
    static class Animal {
        public String makeSound() {
            return "sound\n";
        }
    }

    static class Dog extends Animal {
        public String makeSound() {
            return "woof-woof\n";
        }
    }

    static class Cat extends Animal {
        public String makeSound() {
            return "meow\n";
        }
    }

    static class Cow extends Animal {
        public String makeSound() {
            return "moooo\n";
        }
    }

    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Dog();
        Animal a3 = new Cat();
        Animal a4 = new Cow();

        System.out.println("Animal: " + a1.makeSound());
        System.out.println("Dog: " + a2.makeSound());
        System.out.println("Cat: " + a3.makeSound());
        System.out.println("Cow: " + a4.makeSound());
    }
}
