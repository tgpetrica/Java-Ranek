

class Car {
    String colour;
    String owner;

    public Car(String colour, String owner){
        this.colour = colour;
        this.owner = owner;
    }
}

class Driver {
    public static void main(String[] args){
        Car car = new Car("red", "gigel");
        System.out.println(car.colour);
        System.out.println(car.owner);
    }
}