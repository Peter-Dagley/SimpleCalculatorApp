package pc.peter.calculatorscanner;

//import java.text.DecimalFormat;

public class CalculatorScanner {

	// Addition
	public static double add(double num1, double num2) {

//		DecimalFormat df = new DecimalFormat("0.###");
		double result = num1 + num2;
//		return df.format(result);
		return result;

	}

	// Subtraction
	public static double subtract(double num1, double num2) {

		double result = num1 - num2;
		return result;

	}

	// Multiplication
	public static double multi(double num1, double num2) {

		double result = num1 * num2;
		return result;

	}

	// Division
	public static double div(double num1, double num2) {

		double result = num1 / num2;
		return result;

	}

}
