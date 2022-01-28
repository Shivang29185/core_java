package corejava;

import java.util.Scanner;

/**
 * Practical 2: Write a program to demonstrate the use of if / else statements.
 * @author Shivang
 * @version 1.01 2022-01-20
 * Checking age for vote
 */
public class Age {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your age");
		int age = scanner.nextInt();

		scanner.close();

		if (age < 18) { // Checking the age is valid or not.
			System.out.println("Age is not valid for giving vote."); 
		} else {
			System.out.println("Age is valid for giving vote.");
		}
	} // End of main

} // End of age class