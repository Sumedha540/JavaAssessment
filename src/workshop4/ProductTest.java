package workshop4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    public void testProductAssertions() {
        Product product = new Product("Laptop", 500.0, 2);

        assertAll("Product Tests",
            () -> assertNotNull(product.getName(), "Name should not be null"),
            () -> assertTrue(product.getPrice() > 0, "Price should be positive"),
            () -> assertTrue(product.isAffordable(1000.0), "Should be affordable within budget 1000.0"),
            () -> assertFalse(product.isAffordable(900.0), "Should not be affordable within budget 900.0")
        );
    }
}
