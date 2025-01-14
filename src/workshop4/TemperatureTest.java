package workshop4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTest {

	@Test
	void testCelsiusToFahrenheit() {
		Temperature temperature = new Temperature();
		assertEquals(86.6, temperature.convertCelsiusToFahrenheit(32), 0.001);
		System.out.println("This method checks method of conversion for celcius to fahrenheit");
	}
	
	@Test
	void testFahrenheitToCelsius() {
		Temperature temperature = new Temperature();
		assertEquals(86.6, temperature.convertFahrenheitToCelsius(32), 0.001);
		assertEquals(80.6, temperature.convertFahrenheitToCelsius(32), 0.001);
		assertEquals(81.6, temperature.convertFahrenheitToCelsius(36), 0.001);
		System.out.println("This method checks method of conversion for Fahrenheit to Celsius");
	}
}
