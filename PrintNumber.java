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

		System.out.print("Enter the number for while loop:"); 
		int number1 = scanner.nextInt();

		System.out.print("Enter the number for do while loop:"); 
		int number2 = scanner.nextInt();

		scanner.close();

		System.out.println("---Printing number using while loop---"); // Printing numbers using While loop
		int i = 1; 
		while (i <= number1) { 
			System.out.println(i); 
			i++;
		}

		System.out.println("---Printing number using while loop---"); // Printing numbers using Do while loop
		int j = 1; 
		do {
			System.out.println(j); 
			j++;
		} while (j <= number2); 
	} // End of main

} // End of print number class