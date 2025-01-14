package workshop4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ShapeTest {
	 private Shape shape;
	    @Test
	    public void testShapeArea() {
	        // Create a Shape object (base class), its area should return 0
	        Shape shape = new Shape();
	        assertEquals(0, shape.area());
	    }

	    @Test
	    public void testCircleArea() {
	        // Create a Circle with radius 5
	        shape = new Circle(5);
	        // Area of Circle = π * radius^2 = 3.14159 * 5^2 = 78.53975
	        assertEquals(78.53975, shape.area(), 0.0001); // using delta for floating-point comparison
	    }

	    @Test
	    public void testRectangleArea() {
	        // Create a Rectangle with length 4 and width 6
	        Rectanglee rectangle = new Rectanglee(4, 6);
	        // Area of Rectangle = length * width = 4 * 6 = 24
	        assertEquals(24, rectangle.area());
	    }
	}