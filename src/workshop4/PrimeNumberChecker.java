package workshop4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PrimeNumberChecker {

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        // Check for negative numbers, 0, and 1
        if (n <= 1) {
            return false;
        }
        
        // Check divisibility from 2 to the square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // If divisible by any number, not prime
            }
        }
        return true; // Return true if prime
    }
}

