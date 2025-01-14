package tutorial4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    static Calculator calculator;
	
	@BeforeAll
	static void setup(){
		calculator = new Calculator();
		System.out.println("Initializing the calculator.");
	}
	
	@AfterAll
	static void atTheEnd() {
		System.out.println("Runs at the very end.");
	}
	
	@BeforeEach
	void runsBeforeEachTestMethod() {
		System.out.println("Runs before each test method.");
	}
	
	@AfterEach
	void runsAfterEachTestMethod() {
		System.out.println("Runs after each test method.");
	}
	@Test
	void sumTest() {
		int result = calculator.sum(2, 3);
		System.out.println("Sum of two numbers is: " + result);
		assertEquals(5, result);
	}
	
	@Test
	void differenceTest() {
		int result = calculator.difference(6, 3);
		System.out.println("Difference of two numbers is: " + result);
		assertEquals(3, result);
	}
	
	@Test
	void multiplyTest() {
		int result = calculator.multiply(6, 3);
		System.out.println("Multiplication of two numbers is: " + result);
		assertEquals(18, result);
	}

}
