package oopsconcept;

import java.util.Scanner;

/**
* Practical 14: Write a program to demonstrate encapsulation..
* @author Shivang
* @version 1.01 2022-01-24
*/

class Student {

	private String studentName;
	private int studentRollNo;
	private String studentBranch;
	private String studentResult;

	// Getter & setter methods
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentRollNo() {
		return studentRollNo;
	}
	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
	public String getStudentBranch() {
		return studentBranch;
	}
	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}
	public String getStudentResult() {
		return studentResult;
	}
	public void setStudentResult(String studentResult) {
		this.studentResult = studentResult;
	}
	
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		int choice;
		String studentName;
		String studentBranch;
		String studentResult;
		int studentRollNo;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of total Data Entry:"); // Total number of Data
		choice = scanner.nextInt();

		for (int i = 1; i <= choice; i++) {
			System.out.print("Enter Student Name:"); // Student name
			studentName = scanner.next();

			System.out.print("Enter Student Roll No:"); // Student roll no
			studentRollNo = scanner.nextInt();

			System.out.print("Enter Student Branch:"); // Student branch
			studentBranch = scanner.next();

			System.out.print("Enter Student result(pass / Fail):"); // Student result
			studentResult = scanner.next();

			System.out.println();
			System.out.println("Student Details:"); // Display student details
			System.out.println("Name of student is:" + studentName); 
			System.out.println("Roll no is:" + studentRollNo);
			System.out.println("Branch is:" + studentBranch);
			System.out.println("Result is:" + studentResult);
			System.out.println();
			System.out.println();
		}
		scanner.close();
	} // End of main

} // End of class
