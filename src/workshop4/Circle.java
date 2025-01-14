package workshop4;

public class Circle extends Shape {

    private double radius;

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius; // Area of circle = π * r^2
    }
}