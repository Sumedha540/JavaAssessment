package workshop4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryManagementTest {

    private InventoryManagement inventoryManagement;

    @BeforeEach
    void setUp() {
        // Initialize the InventoryManagement object before each test
        inventoryManagement = new InventoryManagement();
    }

    @Test
    void testProductAvailable() {
        // Test if ProductA with quantity 50 is available
        assertTrue(inventoryManagement.isProductAvailable("ProductA", 50), "ProductA should have enough stock");
    }

    @Test
    void testProductNotAvailableDueToInsufficientStock() {
        // Test if ProductB with quantity 60 is not available (only 50 in stock)
        assertFalse(inventoryManagement.isProductAvailable("ProductB", 60), "ProductB should not have enough stock");
    }

    @Test
    void testProductOutOfStock() {
        // Test if ProductC with quantity 1 is not available (stock is 0)
        assertFalse(inventoryManagement.isProductAvailable("ProductC", 1), "ProductC should not be available as it is out of stock");
    }

    @Test
    void testProductNotFound() {
        // Test if a product that doesn't exist in the inventory is not available
        assertFalse(inventoryManagement.isProductAvailable("ProductD", 10), "ProductD should not be found in inventory");
    }
}

