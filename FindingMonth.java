package corejava;

import java.util.Scanner;

/**
 * Practical 3: Write a program to find the current month name from the given number
	of the switch case.
 * @author Shivang
 * @version 1.01 2022-01-20
 */
public class FindingMonth {

	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the month number(1 to 12): "); // Taking user input
		int number = scanner.nextInt();

		scanner.close();

		switch (number) { // Choose number

			case 1: 
				System.out.println("January");
				break; 

			case 2: 
				System.out.println("Febuary");
				break;

			case 3: 
				System.out.println("March");
				break;

			case 4:  
				System.out.println("April");
				break;

			case 5: 
				System.out.println("May");
				break;

			case 6: 
				System.out.println("June");
				break;

			case 7:  
				System.out.println("July");
				break;

			case 8:  
				System.out.println("August");
				break;

			case 9:  
				System.out.println("September");
				break;

			case 10:  
				System.out.println("October");
				break;

			case 11:  
				System.out.println("November");
				break;

			case 12:  
				System.out.println("December");
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + number);
		}
	} // End of main

} // End of Finding month class