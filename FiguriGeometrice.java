interface Shape {
    public double Area();
    public double Volume();
}

class Cube implements Shape {
    private double side;

    public Cube(double side) {
        if (side < 0) {
            throw new IllegalArgumentException("Nu poate fi negativ");
        }
        this.side = side;
    }

    public double Area() {
        return 6*side*side;
    }

    public double Volume() {
        return side*side*side;
    }

    public double getSide() {
        return side;
    }
}

class Circle implements Shape {
    private double radius;
    public Circle(double radius){
        if(radius < 0) {
            throw new IllegalArgumentException("Raza nu exista");
        }
        this.radius=radius;
    }

    public double Volume(){
        return 0;
    }
    public double Area(){
        return radius*radius*Math.PI;
    }
}

public class FiguriGeometrice {
    public static void main(String[] args) {
        Shape cube = new Cube(4);

        // System.out.println(cube.getSide()); // The method getSide() is undefined for the type Shape
        // Trebuie sa privim care este tipul obiectului cube.. daca e de tip Cube sau de tip Shape
        // In cazul in care avem si metode care nu se regasesc in Shape, la apel metodele vor aparea ca fiind nedefinite
    
        System.out.println("Aria: " + cube.Area());
        System.out.println("Volum: " + cube.Volume());
        
        Shape C = new Circle(6); 
        System.out.println("Area is: " + C.Area()); 

        Cube cube2 = new Cube(20);
        Circle circle2 = new Circle(2);
    }
}
