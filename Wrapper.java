package corejava;

import java.util.Scanner;

/**
* Practical 9: Create a practical to compare two variables of Wrapper class using Wrapper classes.
* @author Shivang
* @version 1.01 2022-01-21
*/
public class Wrapper {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first value:"); // First value
		int first = scanner.nextInt();

		System.out.print("Enter the Second value:"); // Second value
		int second = scanner.nextInt();

		Integer value1 = first; // Converting primitive to object
		Integer value2 = second;

		scanner.close();

		if (value1 == value2 ) {
			System.out.println("Both values are Same ");
		} else {
			System.out.println("Different values");
		}
	} // End of main

} // End of Wrapper class