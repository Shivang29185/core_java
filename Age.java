package core_Java;
/**
 * Practical 2: Write a program to demonstrate the use of if / else statements.
 * @author Shivang
 * @version 1.01 2022-01-20
 */
// Checking age for vote
public class Age { 
	public static void main(String[] args) {
	
		int age = 22; // initialization age
		
		if (age < 18) { // Checking the age is valid or not.
			System.out.println("Age is not valid for giving vote."); //  age is not valid.
		} 
		else {
			System.out.println("Age is valid for giving vote."); // age is valid.
		}
			
	} // End of main

} // End of age