package corejava;

import java.util.Scanner;

/**
* Practical 11: Write a practical to use this/super variable.
* @author Shivang
* @version 1.01 2022-01-24
*/
class Parent {

	int number1, number2, mul;

	public Parent(int value1, int value2) {
		this.number1 = value1;
		this.number2 = value2;
		System.out.println("Inside the Parent");

		mul = number1 * number2;
		System.out.println("Multiplication of two number is: " + mul); // Multiplication of two number
	}
}

public class Combine extends Parent {

	public Combine(int value1, int value2) {
		super(value1, value2);
		System.out.println("Inside the Child");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the First number: "); // First value
		int value1 = scanner.nextInt();

		System.out.print("Enter the Second number: "); // Second value
		int value2 = scanner.nextInt();

		scanner.close();

		new Combine(value1, value2);
	} // End of main

} //End of class