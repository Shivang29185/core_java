package corejava;

import java.util.Scanner;

/**
* Practical 11: Write a practical to use this variable.
* @author Shivang
* @version 1.01 2022-01-24
*/
class ThisSum {

	int value1;
	int value2;

	ThisSum(int value1, int value2) {
		this.value1 = value1;
		this.value2 = value2;
	}

	public void display() {
		int sum = value1 + value2;
		System.out.println("Additition of both number is (using This): " + sum); // Displaying Addition
	}

} // End of This sum class

public class ThisDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number: "); // First value
		int value1 = scanner.nextInt();

		System.out.print("Enter the second number: "); // Second value
		int value2 = scanner.nextInt();

		scanner.close();

		ThisSum thisDemo = new ThisSum(value1, value2);
		thisDemo.display();
	} //End main

} //End This demo class