package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import pc.peter.calculatorscanner.CalculatorScanner;

public class CalculatorTest {
	
	@Test
	public void testAdd() {
		
		System.out.println("Starting testing...");
		
		double expected = 5D;
		double actual = CalculatorScanner.add(3D, 2D);
		assertEquals(expected, actual, "Calculation Error.");
		
		System.out.println("Test finished.");
		
	}
	
	
	
}
