package oopsconcept;

import java.util.Scanner;

/**
* Practical 15: Write a program to demonstrate all types of Inheritance concepts like.
* 2. Multi-level Inheritance.
* @author Shivang
* @version 1.01 2022-01-25
*/

class Raj {

	String name;
	int enrollnmentNo;

	public void studentDetails(Scanner scanner) { // Taking student details
		System.out.print("Enter the student name: ");
		name  = scanner.next();

		System.out.print("Enter the Enrollnment no of student:");
		enrollnmentNo = scanner.nextInt();	
	}

	void displayStudentDetails() { // Displaying student details.
		System.out.println();
		System.out.println("Student Name:" + name);
		System.out.println("Student Enrollnment:" + enrollnmentNo);
	}

} // End of class

class Marks extends Raj {

	int advanceJava;
	int webProgramming;
	int cloudComputing;
	int compilerDesign;
	int firstTotal;
	int secondTotal;
	static float average;

	public void studentFirstSemMarks(Scanner scanner) { // First semester marks
		System.out.println();
		System.out.println("Enter the First Sem Marks:");
		System.out.print("Enter the Advance Java Marks: ");
		advanceJava = scanner.nextInt();

		System.out.print("Enter the Web Programming Marks:");
		webProgramming = scanner.nextInt();	
	}

	public void studentSecondSemMarks(Scanner scanner) { // Second semester marks
		System.out.println();
		System.out.println("Enter the Second Sem Marks:");
		System.out.print("Enter the Cloud Computing Marks: ");
		cloudComputing = scanner.nextInt();

		System.out.print("Enter the Compiler Design Marks:");
		compilerDesign = scanner.nextInt();	
	}

	float displayTotal() { // Display total
		firstTotal = advanceJava + webProgramming;
		secondTotal = cloudComputing + compilerDesign;
		average = (firstTotal + secondTotal) / 4;

		System.out.println("Total marks of First Sem :" + firstTotal);
		System.out.println("Total marks of Second Sem :" + secondTotal);

		return average;
	}

} // End of class

public class StudentInfo extends Marks {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentDetails(scanner);
		studentInfo.studentFirstSemMarks(scanner);
		studentInfo.studentSecondSemMarks(scanner);
		studentInfo.displayStudentDetails();
		studentInfo.displayTotal();

		scanner.close();
		System.out.println("Student average marks is:" + average + "%"); // Display Average

	} // End of main

} // End of class