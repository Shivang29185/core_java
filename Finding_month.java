package core_Java;

// importing scanner class.
import java.util.Scanner;

/**
 * Practical 3: Write a program to find the current month name from the given number
	of the switch case.
 * @author Shivang
 * @version 1.01 2022-01-20
 */
// class for finding month
public class Finding_month {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the month number(1 to 12): "); // Taking user input
		int number = sc.nextInt();
		
		switch (number) { // choosen number
		
		case 1: { // print case 1 
			System.out.println("January");
		} break; 
				
		case 2: {// print case 2 
			System.out.println("Febuary");
		} break;
		
		case 3: {// print case 3
			System.out.println("March");
		} break;
		
		case 4: {// print case 4 
			System.out.println("April");
		} break;
		
		case 5: {// print case 5
			System.out.println("May");
		} break;
		
		case 6: {// print case 6
			System.out.println("June");
		} break;
		
		case 7: {// print case 7 
			System.out.println("July");
		} break;
		
		case 8: {// print case 8 
			System.out.println("August");
		} break;
		
		case 9: {// print case 9 
			System.out.println("September");
		} break;
		
		case 10: {// print case 10 
			System.out.println("October");
		} break;
		
		case 11: {// print case 11 
			System.out.println("November");
		} break;
		
		case 12: {// print case 12 
			System.out.println("December");
		} break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + number);
		}
	}
}
