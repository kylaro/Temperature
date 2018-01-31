package junitIntroduction;
/**
 * 
 * This class provides useful functions for converting temperature
 * @author The Temp Conver Wizard
 *
 */

public class TemperatureConverter {
	
	/**
	 * This function converts celsius to Fahrenheit
	 * @param celsius the degrees in celsius to convert to fahrenheit
	 * @return the degrees in fahrenheit
	 * @author The Temp Convert Wizard
	 * @version v9.8.7-1.0.2b
	 */
	public static double celsisusToFahrenheit(double celsius) {
		
		double fahrenheit = (9.0/5.0)*celsius + 32;
		return fahrenheit;
	}
	
	/**
	 * This function converts fahrenheit to Celsius
	 * @param fahrenheit The degrees in Fahrenheit to convert to celsius
	 * @return The degrees in celsius.
	 * @author The Temp Convert Wizard
	 * @version v1.2.7-c
	 */
	public static double fahrenheitToCelsius(double fahrenheit){
		
		double celsius = (5.0/9.0)*(fahrenheit - 32);
		return celsius;
		
	}

}
