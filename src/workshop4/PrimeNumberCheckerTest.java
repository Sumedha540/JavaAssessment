package workshop4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PrimeNumberCheckerTest {

    @Test
    public void testPrimeNumber() {
        // 7 is a prime number
        assertEquals(true, PrimeNumberChecker.isPrime(7));
    }

    @Test
    public void testNonPrimeNumber() {
        // 4 is not a prime number
        assertEquals(false, PrimeNumberChecker.isPrime(4));
    }

    @Test
    public void testPrimeNumberOne() {
        // 1 is not considered a prime number
        assertEquals(false, PrimeNumberChecker.isPrime(1));
    }

    @Test
    public void testPrimeNumberTwo() {
        // 2 is a prime number (the smallest prime)
        assertEquals(true, PrimeNumberChecker.isPrime(2));
    }

    @Test
    public void testPrimeNumberNegative() {
        // Negative numbers are not prime numbers
        assertEquals(false, PrimeNumberChecker.isPrime(-5));
    }
}
