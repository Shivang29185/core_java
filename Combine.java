package corejava;

import java.util.Scanner;

/**
* Practical 11: Write a practical to use this/super variable.
* @author Shivang
* @version 1.01 2022-01-24
*/
class Parent {

	public Parent(int value1, int value2) {
		System.out.println("Inside the Parent");

		int multiplication = value1 * value2;
		System.out.println("Multiplication of two number is: " + multiplication); // Multiplication of two number
	}

} // End of parent class

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

} //End of Combine class