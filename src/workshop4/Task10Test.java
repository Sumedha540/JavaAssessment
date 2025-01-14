package workshop4;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Calculator1Test {

    private Calculator1 calculator;  // Correct the variable name to use Calculator1

    // This method runs once before all test cases (before any test class runs)
    @BeforeAll
    static void setUpBeforeClass() {
        // This is used for global configuration if needed
        System.out.println("Setting up before all tests...");
    }

    // This method runs once after all test cases (after all tests are completed)
    @AfterAll
    static void tearDownAfterClass() {
        // Perform any clean-up after all tests if needed
        System.out.println("Cleaning up after all tests...");
    }

    // This method runs before each test (initialize Calculator)
    @BeforeEach
    void setUp() {
        calculator = new Calculator1();  // Initialize the Calculator1 object before each test
        System.out.println("Initializing Calculator1 object...");
    }

    // This method runs after each test (reset or clean up any states)
    @AfterEach
    void tearDown() {
        // Clean-up logic after each test if necessary
        System.out.println("Cleaning up after the test...");
    }

    @Test
    void testAddition() {
        // Test for addition
        assertEquals(5, calculator.add(2, 3), "Addition test failed");
    }

    @Test
    void testSubtraction() {
        // Test for subtraction
        assertEquals(1, calculator.subtract(3, 2), "Subtraction test failed");
    }

    @Test
    void testMultiplication() {
        // Test for multiplication
        assertEquals(6, calculator.multiply(2, 3), "Multiplication test failed");
    }

    @Test
    void testDivision() {
        // Test for division
        assertEquals(2.0, calculator.divide(6, 3), "Division test failed");
    }

    @Test
    void testDivisionByZero() {
        // Test for division by zero
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(1, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}

