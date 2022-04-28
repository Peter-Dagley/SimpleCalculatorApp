package pc.peter.calculatorscanner;

import java.util.Scanner;

public class Menu {

	Scanner input = new Scanner(System.in);

	// Menu Method
	public void menu() {

		boolean menuFlag = true;
		String choice = "";
		double num1;
		double num2;

		while (menuFlag) {
			System.out.println("-".repeat(60));
			System.out.println("This is a calculator. Please choose a method:");
			System.out.println("\t 1. Addition");
			System.out.println("\t 2. Subtraction");
			System.out.println("\t 3. Multiplication");
			System.out.println("\t 4. Division");
			System.out.println("\t 5. Square Root \r\n");			
			System.out.println("\t 0. Exit application");
			System.out.println("-".repeat(60));
			System.out.print("What is your choice? ");

			choice = this.input.nextLine();

			switch (choice) {
			case "1":
//				Addition
				System.out.println("-".repeat(60));
				System.out.print("Enter your first number: ");
				num1 = this.input.nextDouble();
				System.out.print("Enter your second number: ");
				num2 = this.input.nextDouble();
				input.nextLine();
				System.out.print("(Addition) This equals = ");
				System.out.println(CalculatorScanner.add(num1, num2));
				System.out.println("-".repeat(60) + "\r\n");
				break;

			case "2":
//				Subtraction
				System.out.println("-".repeat(60));
				System.out.print("Enter your first number: ");
				num1 = this.input.nextDouble();
				System.out.print("Enter your second number: ");
				num2 = this.input.nextDouble();
				input.nextLine();
				System.out.print("(Subtraction) This equals = ");
				System.out.println(CalculatorScanner.subtract(num1, num2));
				System.out.println("-".repeat(60) + "\r\n");
				break;

			case "3":
//				Multiplication
				System.out.println("-".repeat(60));
				System.out.print("Enter your first number: ");
				num1 = this.input.nextDouble();
				System.out.print("Enter your second number: ");
				num2 = this.input.nextDouble();
				input.nextLine();
				System.out.print("(Multiplication) This equals = ");
				System.out.println(CalculatorScanner.multi(num1, num2));
				System.out.println("-".repeat(60) + "\r\n");
				break;

			case "4":
//				Division
				System.out.println("-".repeat(60));
				System.out.print("Enter your first number: ");
				num1 = this.input.nextDouble();
				System.out.print("Enter your second number: ");
				num2 = this.input.nextDouble();
				input.nextLine();
				System.out.print("(Division) This equals = ");
				System.out.println(CalculatorScanner.div(num1, num2));
				System.out.println("-".repeat(60) + "\r\n");
				break;
			
			case "5":
//				Square Root
				System.out.println("-".repeat(60));
				System.out.print("Enter your number: ");
				num1 = this.input.nextDouble();
				input.nextLine();
				System.out.print("(SQRT) This equals = ");
				System.out.println(CalculatorScanner.sqrt(num1));
				System.out.println("-".repeat(60) + "\r\n");
				break;

			case "0":
//				Exit application
				System.out.println("\r\nShutting down...");
				menuFlag = false;
				break;

			default:
				System.out.println("\r\nError, try again below. \r\n");
				break;

			}

//		Abort WIP:
//			menuFlag = false;

		}

	}

}
