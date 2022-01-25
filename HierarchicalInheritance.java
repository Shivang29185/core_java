package oopsconcept;

import java.util.Scanner;

/**
* Practical 15: Write a program to demonstrate all types of Inheritance concepts like.
		3. Hierarchical Inheritance.
* @author Shivang
* @version 1.01 2022-01-25
*/

class Internship {

	static String choice;

	String checkInternshipDetail() { // Check internship
		Scanner scanner = new Scanner(System.in);

		System.out.println();
		System.out.print("Want to Check Internship Details(yes / no):");
		choice = scanner.next();

		return choice;	
	}

} // End of class

class Java extends Internship {

	void javaInternship() { // Java internship
		System.out.println();
		System.out.println("Duration of Internship is 6 Months");
		System.out.println("Stipend for java internship is 5000");
		System.out.println("After Internship Salary will be 25000");
	}

} // End of class

class Android extends Internship {

	void androidInternship() { // Android internship
		System.out.println();
		System.out.println("Duration of Internship is 6 Months");
		System.out.println("Stipend for Android internship is 7000");
		System.out.println("After Internship Salary will be 28000");
	}

} // End of class

class Angular extends Internship {

	void angularInternship() { // Angular internship
		System.out.println();
		System.out.println("Duration of Internship is 6 Months");
		System.out.println("Stipend for Angular internship is 5000");
		System.out.println("After Internship Salary will be 25000");
	}

} // End of class

public class HierarchicalInheritance extends Internship {

	static String input;

	String details() { // User details
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter 'Java' for Checking Java Internship Details");
		System.out.println("Enter 'Android' for Checking Android Internship Details");
		System.out.println("Enter 'Angular' for Checking Angular Internship Details");

		System.out.print("Enter your choice:"); // Selected choice
		input = scanner.next();

		return input;
	}

	public static void main(String[] args) {
		HierarchicalInheritance hierarchicalInheritance = new HierarchicalInheritance();
		hierarchicalInheritance.details();

		while (true) {
			if (input.equalsIgnoreCase("java")) {
				Java java = new Java();
				java.javaInternship();
				java.checkInternshipDetail();
			} else if (input.equalsIgnoreCase("Android")) {
				Android android = new Android();
				android.androidInternship();
				android.checkInternshipDetail();
			} else if (input.equalsIgnoreCase("Angular")) {
				Angular angular = new Angular();
				angular.angularInternship();
				angular.checkInternshipDetail();
			} else {
				System.out.println("Wrong Choice");
				hierarchicalInheritance.checkInternshipDetail();
			}

			if (choice.equalsIgnoreCase("yes")) {
				hierarchicalInheritance.details();
			} else {
				System.out.println("Exit");
				break;
			}
		}
	} // End of main

} // End of class