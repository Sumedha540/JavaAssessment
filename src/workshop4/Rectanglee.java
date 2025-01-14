package workshop4;

public class Rectanglee extends Shape {

    // Attributes: length and width
    private double length;
    private double width;

    // Constructor to initialize the length and width
    public Rectanglee(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override area() method to calculate the area of a rectangle
    @Override
    public double area() {
        return length * width; // Area of rectangle = length * width
    }
}