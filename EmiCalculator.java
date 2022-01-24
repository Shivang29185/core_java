package corejava;

import java.util.Scanner;

/**
* Practical 8: Apply EMI Calculator in Java - Java program to calculate EMI using Class, Object, Variables, Operators, 
 	and Datatypes.
* @author Shivang
* @version 1.01 2022-01-21
*/

public class EmiCalculator {
	
	public void calculate(float p, float r, float t) { // Method to calculate EMI
		float principle = p;
		float rate = r;
		float time = t;
		float emi;

		rate = rate / (12 * 100); 
		time = time * 12; 
		emi= (( principle * rate * (float) Math.pow (1 + rate, time )) / ((float) Math.pow ( 1 + rate, time ) - 1 ));
 
		System.out.print("EMI is= "+emi+"\n");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the principle amount: "); // Loan amount
		float principle = scanner.nextFloat();

		System.out.print("Enter the interest rate:"); // Interest rate
		float interest = scanner.nextFloat();

		System.out.print("Enter the loan time period:"); // Loan time
		float time = scanner.nextFloat();

		scanner.close();

		EmiCalculator emiCalculator = new EmiCalculator();
		emiCalculator.calculate (principle, interest, time);
	} // End of main
	
}// End of class