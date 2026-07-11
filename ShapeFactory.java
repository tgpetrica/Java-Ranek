interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("C(O,r)");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("P(0,0,5)");
    }
}



public class ShapeFactory {
    public Shape getShape(String shapeName) {
        if (shapeName == null) {
            return null;
        }

        if (shapeName.equalsIgnoreCase("circle")) {
            return new Circle();
        }

        if (shapeName.equalsIgnoreCase("square")) {
            return new Square();
        }

        // https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#equalsIgnoreCase-java.lang.String-

        return null;
    }

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape s1 = factory.getShape("circle");
        s1.draw();
        Shape s2 = factory.getShape("square");
        s2.draw();
        Shape s3 = factory.getShape("CIRcle");
        s3.draw();

    }
}