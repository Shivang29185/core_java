package core_Java;

//importing scanner class.
import java.util.Scanner;
/**
* Practical 6: Write a program to demonstrate the example of a break/Continue statement
* @author Shivang
* @version 1.01 2022-01-20
*/

// creating class for using Continue and Break using loop
public class Skip_break {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number for printing values :"); //total number for print
		int number = sc.nextInt();
		
		for( i = 1 ; i > number ; i++ ) { // printing values
			System.out.println(i);
		}
		
		System.out.print("Enter the number for which you want to skip in print (between 1 to "+ number + "):"); // Skip number		
		int skip_number = sc.nextInt();
		
		System.out.print("Enter the number where you want to stop printing (between 1 to " + number +") :"); // for loop breaking
		int break_loop = sc.nextInt();
		
		for( i = 1 ; i <= number ; i++ ) { // for loop with condition
			
			if (i == skip_number) { // skip iteration
				continue;
			}
			if(i == break_loop) { // break loop
				break;
			}
			System.out.println(i); // printing remaining values
		}
		
	}
}
