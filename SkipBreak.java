package corejava;

import java.util.Scanner;

/**
* Practical 6: Write a program to demonstrate the example of a break/Continue statement
* @author Shivang
* @version 1.01 2022-01-20
*/

public class SkipBreak {

	public static void main(String[] args) {
		int i;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number for printing values :"); // Total number for print
		int number = scanner.nextInt();

		for ( i = 1 ; i > number ; i++ ) { // Printing values
			System.out.println(i);
		}

		System.out.print("Enter the number for which you want to skip in print (between 1 to "+ number + "):"); // Skip number		
		int skipNumber = scanner.nextInt();

		System.out.print("Enter the number where you want to stop printing (between 1 to " + number +") :"); // For loop breaking
		int breakLoop = scanner.nextInt();

		for ( i = 1 ; i <= number ; i++ ) { // For loop with condition

			if (i == skipNumber) { // Skip iteration
				continue;
			}

			if (i == breakLoop) { // Break loop
				break;
			}
			System.out.println(i); // printing remaining values
		}
	} // End of main
	
} // End of class
