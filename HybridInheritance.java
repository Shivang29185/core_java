package oopsconcept;

import java.util.Scanner;

/**
* Practical 15: Write a program to demonstrate all types of Inheritance concepts like.
		4. Hybrid Inheritance.
* @author Shivang
* @version 1.01 2022-01-25
*/

class JavaInterview {

	static int count = 0;

	int basicJava() { // Basic java question
		Scanner scanner = new Scanner(System.in);
		System.out.print("Do you know about class(yes / no):");
		String classAnswer = scanner.next();

		if(classAnswer.equalsIgnoreCase("yes")) {
			count++;
}
		
		System.out.print("Do you know about Object(yes / no):");
		String objectAnswer = scanner.next();

		if(objectAnswer.equalsIgnoreCase("yes")) {
			count++;
		}

		System.out.print("Do you know about Abstraction(yes / no):");
		String abstractionAnswer = scanner.next();

		if(abstractionAnswer.equalsIgnoreCase("yes")) {
			count++;
		}

		return count;
	}

} // End of class

class Intern extends JavaInterview {

	void applyedInternship() { // Internship method
		if(count >= 2) {
			System.out.println();
			System.out.println("Result:Pass   Marks:" + count);
			System.out.println("You are applicable for Internship in our company");
		} else {
			System.out.println();
			System.out.println("Result:Fail   Marks:" + count);
			System.out.println("Sorry you are not applicable for Internship in our company");
		}
	}

} // End of class

class Job extends JavaInterview {

	int applyedJob() { // Job method
		Scanner scanner = new Scanner(System.in);

		System.out.print("Do you know about Inheritance(yes / no):");
		String inheritanceAnswer = scanner.next();

		if(inheritanceAnswer.equalsIgnoreCase("yes")) {
			count++;
		}

		System.out.print("Do you know about Interface(yes / no):");
		String interfaceAnswer = scanner.next();

		if(interfaceAnswer.equalsIgnoreCase("yes")) {
			count++;
		}

		if(count >= 3) {
			System.out.println();
			System.out.println("Result:Pass   Marks:" + count);
			System.out.println("You are applicable for Job in our company");
		} else {
			System.out.println();
			System.out.println("Result:Fail   Marks:" + count);
			System.out.println("Sorry you are not applicable for Job in our company");
		}

		return count;
	}

} // End of class

public class HybridInheritance extends Job {

	void jobDetails() {
		System.out.println("Your Salary will be 30,000 Rs ");
		System.out.println("Yearly 18 paid leave is allowed");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the choice of Interview(Internship / Job):");
		String choice = scanner.next();

		if(choice.equalsIgnoreCase("Internship")) {
			Intern intern = new Intern();
			intern.basicJava();
			intern.applyedInternship();
		} else if (choice.equalsIgnoreCase("Job")) {
			HybridInheritance hybridInheritance = new HybridInheritance();
			hybridInheritance.basicJava();
			hybridInheritance.applyedJob();

			if(count >= 3) {
				hybridInheritance.jobDetails();
			}

		} else {
			System.out.println("Wrong Choice");
		} 
	} // End of main

} // End of class