package week4;

class Shape {
    public double getPerimeter() {
        return 0;
    }

    public double getArea() {
        return 0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Ques2 {
    public static void main(String[] args) {
        Circle circle = new Circle(9);
        System.out.println("Perimeter of the circle is: " + circle.getPerimeter());
        System.out.println("Area of the circle is: " + circle.getArea());
    }
}


