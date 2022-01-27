package oopsconcept;

import java.util.Scanner;

/**
* Practical 18:Write a program to handle exceptions using try, catch, finally, throw, and throws keywords.
* @author Shivang
* @version 1.01 2022-01-26
*/
public class ExceptionHandling {

	void tryCatch() throws ArithmeticException { // Try catch with throws
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the value:");
		int value = scanner.nextInt();

		scanner.close();

		try {
			value = (value / 0); // Divide by zero
		} catch (ArithmeticException arithmeticException) {
			System.out.println("Exception:" + arithmeticException);
		}
	}

	public static void main(String[] args) {
		int[] array = new int[2];

		try {
			ExceptionHandling exceptionHandling = new ExceptionHandling();
			exceptionHandling.tryCatch();

			array[5] = 10; // Assigning value
			throw new ArrayIndexOutOfBoundsException("Error Occur");
		} finally {
			 System.out.println (" Finally Block");
		}
	} // End of main

} // End of class