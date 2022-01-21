package corejava;

import java.util.Scanner;

/**
 * Practical 5: Write a program to demonstrate the example of the ‘for’ loop and print the below-mentioned pattern.
 * @author Shivang
 * @version 1.01 2022-01-20
 */

public class Pattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number :"); //Enter number for creating pattern
		int number = scanner.nextInt();
		
		for (int i = 1 ; i <= number ; i++) { // For loop with condition
			for (int j = 1 ; j <= i ; j++) { // For loop with condition
				System.out.print("*");
			}
			System.out.println();
		}
	} // End of main

} // End of class
