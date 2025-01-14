package workshop4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void testArea() {
        // Create a rectangle with length 5 and width 3
        Rectangle rectangle = new Rectangle(5, 3);
        // The area should be length * width = 5 * 3 = 15
        assertEquals(15, rectangle.area());
    }

    @Test
    public void testPerimeter() {
        // Create a rectangle with length 5 and width 3
        Rectangle rectangle = new Rectangle(5, 3);
        // The perimeter should be 2 * (length + width) = 2 * (5 + 3) = 16
        assertEquals(16, rectangle.perimeter());
    }

    @Test
    public void testAreaWithDifferentValues() {
        // Create a rectangle with length 7 and width 4
        Rectangle rectangle = new Rectangle(7, 4);
        // The area should be length * width = 7 * 4 = 28
        assertEquals(28, rectangle.area());
    }

    @Test
    public void testPerimeterWithDifferentValues() {
        // Create a rectangle with length 7 and width 4
        Rectangle rectangle = new Rectangle(7, 4);
        // The perimeter should be 2 * (length + width) = 2 * (7 + 4) = 22
        assertEquals(22, rectangle.perimeter());
    }

    @Test
    public void testZeroAreaAndPerimeter() {
        // Create a rectangle with length 0 and width 0
        Rectangle rectangle = new Rectangle(0, 0);
        // The area should be 0
        assertEquals(0, rectangle.area());
        // The perimeter should also be 0
        assertEquals(0, rectangle.perimeter());
    }
}
