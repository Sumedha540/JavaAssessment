package workshop4;

import org.junit.*;
import static org.junit.Assert.*;

public class MathUtilsTest {

    @BeforeClass
    public static void setupBeforeClass() {
        System.out.println("Starting MathUtils Tests...");
    }

    @AfterClass
    public static void teardownAfterClass() {
        System.out.println("MathUtils Tests Completed.");
    }

    @Test
    public void testIsPrime() {
        // Positive test cases
        assertTrue(MathUtils.isPrime(2));  // Smallest prime number
        assertTrue(MathUtils.isPrime(3));  // A prime number
        assertTrue(MathUtils.isPrime(5));  // Another prime number
        assertTrue(MathUtils.isPrime(7));  // Another prime number

        // Negative test cases
        assertFalse(MathUtils.isPrime(0));  // 0 is not a prime number
        assertFalse(MathUtils.isPrime(1));  // 1 is not a prime number
        assertFalse(MathUtils.isPrime(4));  // Not a prime number
        assertFalse(MathUtils.isPrime(-3)); // Negative numbers are not prime
        assertFalse(MathUtils.isPrime(100)); // Large non-prime number
    }
}
