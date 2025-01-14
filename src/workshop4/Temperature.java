package workshop4;

public class Temperature {
//assertion bhaneko method like assertNULL assertEach 
	//annotations bhaneko beforeeach aftereach
	
	//convert wala method ho 
	
	double convertCelsiusToFahrenheit(double temperature) {
		return (temperature * 9/5 + 32);
	}
	
	double convertFahrenheitToCelsius(double temperature) {
		return ((temperature - 32) * 5)/9;
	}
}
