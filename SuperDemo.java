package corejava;

import java.util.Scanner;

/**
* Practical 11: Write a practical to use super variable.
* @author Shivang
* @version 1.01 2022-01-20
*/

class SuperClass {

	int number1,number2,sum;
	public SuperClass(int value1, int value2) {
		System.out.println("Inside the parent");
		sum = value1 + value2;
		System.out.println("Sum of two numbers:" +sum);
	}
} // End of class

class SuperDemo extends SuperClass {
	public SuperDemo(int value1, int value2) {
		super(value1, value2);
		System.out.println("Inside the Child");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first number: "); // First value
		int value1 = scanner.nextInt();

		System.out.println("Enter the first number: "); // Second value
		int value2 = scanner.nextInt();
		
		new SuperDemo(value1, value2);
	} // End of main

} // End of class
