package workshop4;
import java.util.HashMap;
import java.util.Map;

public class InventoryManagement {

    // Inventory stored as a Map where product name is the key and stock quantity is the value
    private Map<String, Integer> inventory = new HashMap<>();

    // Constructor to initialize the inventory with some products
    public InventoryManagement() {
        inventory.put("ProductA", 100);
        inventory.put("ProductB", 50);
        inventory.put("ProductC", 0);
    }

    // Method to check if the product is available in the required quantity
    public boolean isProductAvailable(String productName, int quantity) {
        // Check if the product exists and if the available stock is enough
        return inventory.containsKey(productName) && inventory.get(productName) >= quantity;
    }

    public static void main(String[] args) {
        // Create an instance of InventoryManagement
        InventoryManagement inventoryManagement = new InventoryManagement();

        // Test the method
        System.out.println(inventoryManagement.isProductAvailable("ProductA", 50)); // true
        System.out.println(inventoryManagement.isProductAvailable("ProductB", 60)); // false
        System.out.println(inventoryManagement.isProductAvailable("ProductC", 1));  // false
        System.out.println(inventoryManagement.isProductAvailable("ProductD", 10)); // false
    }
}

