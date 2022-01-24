package corejava;

import java.util.Scanner;

/**
* Practical 11: Write a practical to use this variable.
* @author Shivang
* @version 1.01 2022-01-20
*/

public class ThisDemo {

	int number1,number2,sum;
	public ThisDemo(int value1, int value2) {
		this.number1 = value1;
		this.number2 = value2;
		sum = number1 + number2;
	}

	public void display() {
		System.out.println("Additition of both number is (using This): " + sum); // Displaying Addition
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first number: "); // First value
		int value1 = scanner.nextInt();

		System.out.println("Enter the first number: "); // Second value
		int value2 = scanner.nextInt();

		ThisDemo thisDemo = new ThisDemo(value1, value2);
		thisDemo.display();
	} //End main

} //End class
