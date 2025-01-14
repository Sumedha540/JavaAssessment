package workshop4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void sumtest() {
		Calculator calculator =  new Calculator();
		int result = calculator.sum(2, 3);
		System.out.println("Sum of two numbers is: " + result);
		assertEquals(5, result);
	}
}
