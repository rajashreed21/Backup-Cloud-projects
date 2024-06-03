class Shape {
    public double area() {
    return 0.0;
    }
}

// Circle class extending Shape
class Circle extends Shape {
    private double radius; // Radius of the circle

    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of area method for circle
    @Override
    public double area() {
        return Math.PI * radius * radius; // Area of a circle = πr²
    }
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    private double width;  // Width of the rectangle
    private double height; // Height of the rectangle

    // Constructor for Rectangle
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Implementation of area method for rectangle
    @Override
    public double area() {
        return width * height; // Area of a rectangle = width * height
    }
}
public class main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 5);

        System.out.printf("Area of the circle: %.2f\n", circle.area());
        System.out.printf("Area of the rectangle: %.2f\n", rectangle.area());
    }
}
