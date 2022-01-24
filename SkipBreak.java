package corejava;

import java.util.Scanner;

/**
* Practical 6: Write a program to demonstrate the example of a break/Continue statement
* @author Shivang
* @version 1.01 2022-01-20
*/

public class SkipBreak {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of Rounds :"); // Total number of rounds for loop
		int number = scanner.nextInt();

		for (int i = 1; i <= number; i++ ) { // For loop with condition
			System.out.print("Want to Skip Round" + i + "(yes/no):");
			String continueRound = scanner.next();

			System.out.print("Want to Break Round" + i + "(yes/no):");
			String breakRound = scanner.next();

			if (continueRound.equalsIgnoreCase("yes")) {
				System.out.println("Skip Round" + i +".");
				System.out.println();
				continue;
			}
			
			if (breakRound.equalsIgnoreCase("yes")) {
				System.out.println("Iteration Stoped.");
				break;
			}

			System.out.print("Enter the last value for print in Round" + i + ":"); // Total number for print
			int number2 = scanner.nextInt();

			System.out.print("Enter the number for which you want to skip in print (between 1 to "+ number2 + "):"); // Skip for number1		
			int skipNumber = scanner.nextInt();

			System.out.print("Enter the number where you want to stop printing (between 1 to " + number2 +") :"); // Breaking for number1
			int breakLoop = scanner.nextInt();

			System.out.println("Values of Round" + i +": ");
			for (int j = 1; j <= number2; j++ ) { // 
				if (j == skipNumber) { // Skip iteration
					continue;
				}

				if (j == breakLoop) { // Break loop
					break;
				}
				System.out.print(j + " ");// Printing remaining values
			}
			System.out.println();
			System.out.println();
		}
		scanner.close();
	} // End of main
	
} // End of class