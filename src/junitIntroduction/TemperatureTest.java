package junitIntroduction;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TemperatureTest {
	
	@SuppressWarnings("deprecated")
	@Test(timeout = 1000)
	public void testCelsisusToFahrenheit() {
		double testLow = 0;
		double testHigh = 100;
		double expectedLow = 32;
		double expectedHigh = 212;
		double actualLow = TemperatureConverter.celsisusToFahrenheit(testLow);
		double actualHigh = TemperatureConverter.celsisusToFahrenheit(testHigh);
		assertEquals(expectedLow, actualLow, 0.1);
		assertEquals(expectedHigh, actualHigh, 0.1);
	}
	
	@Test(timeout = 1000)
	public void testFahrenheitToCelsius() {
		double testLow = 32;
		double testHigh = 212;
		double expectedLow = 0;
		double expectedHigh = 100;
		double actualLow = TemperatureConverter.fahrenheitToCelsius(testLow);
		double actualHigh = TemperatureConverter.fahrenheitToCelsius(testHigh);
		assertEquals(expectedLow, actualLow, 0.1);
		assertEquals(expectedHigh, actualHigh, 0.1);
	}

}
