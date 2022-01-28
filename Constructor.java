package corejava;

import java.util.Scanner;

/**
* Practical 7: Write a program to demonstrate the example of constructor and Parameterized constructor
* @author Shivang
* @version 1.01 2022-01-20
*/
public class Constructor {

	public Constructor() { // Default Constructor
		int number = 10;
		System.out.println("Default Constructor");
		System.out.println(number);
	}

	public Constructor(int a, int b) { // Parameterized constructor for adding two values
		int number = a;
		int number1 = b;
		int sum = number + number1;

		System.out.println("Parameterized Constructor");
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the First value:");
		int value1 = scanner.nextInt();

		System.out.print("Enter the Second value");
		int value2 = scanner.nextInt();

		scanner.close();

		new Constructor();
		new Constructor(value1, value2);
	} // End of main

} //End of Constructor class