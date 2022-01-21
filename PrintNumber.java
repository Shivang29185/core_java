package corejava;

import java.util.Scanner;

/**
 * Practical 4: Write a program to demonstrate the use of while loop and do while loop.
 * @author Shivang
 * @version 1.01 2022-01-20
 */


public class PrintNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Enter number for while loop
		System.out.print("Enter the number for while loop:"); 
		int number1 = scanner.nextInt();

		// Enter number for do while loop
		System.out.print("Enter the number for do while loop:"); 
		int number2 = scanner.nextInt();

		// Printing numbers using While loop
		System.out.println("---Printing number using while loop---");
		int i = 1; // initialization of i
		while (i <= number1) { // While condition
			System.out.println(i); // print the value of i
			i++;
		}

		// Printing numbers using Do while loop
		System.out.println("---Printing number using while loop---");
		int j = 1; // initialization of j
		do {
			System.out.println(j); // print the value of j
			j++;

		} while (j <= number2); // do while condition
	} // End of main

} // End of class
