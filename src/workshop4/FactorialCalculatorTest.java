package workshop4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FactorialCalculatorTest {

    @Test
    public void testFactorialOfZero() {
        // Factorial of 0 is 1
        assertEquals(1, FactorialCalculator.factorial(0));
    }

    @Test
    public void testFactorialOfOne() {
        // Factorial of 1 is 1
        assertEquals(1, FactorialCalculator.factorial(1));
    }

    @Test
    public void testFactorialOfFive() {
        // Factorial of 5 is 120
        assertEquals(120, FactorialCalculator.factorial(5));
    }

    @Test
    public void testFactorialOfSeven() {
        // Factorial of 7 is 5040
        assertEquals(5040, FactorialCalculator.factorial(7));
    }

    @Test
    public void testFactorialOfTen() {
        // Factorial of 10 is 3628800
        assertEquals(3628800, FactorialCalculator.factorial(10));
    }
}

