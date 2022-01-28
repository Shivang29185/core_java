package corejava;

import java.util.Scanner;

/**
* Practical 11: Write a practical to use super variable.
* @author Shivang
* @version 1.01 2022-01-24
*/
class SuperClass {

	int show(int value1, int value2) {
		System.out.println("Inside the parent");
		int substraction = value1 - value2;
		return substraction;
	}

} // End of super class

class SuperDemo extends SuperClass {

	public SuperDemo(int value1, int value2) {
		System.out.println("Inside the Child");
		System.out.println("Substraction of two numbers:" + super.show(value1, value2));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number: "); // First value
		int value1 = scanner.nextInt();

		System.out.print("Enter the second number: "); // Second value
		int value2 = scanner.nextInt();

		scanner.close();

		new SuperDemo(value1, value2);
	} // End of main

} // End of super demo class