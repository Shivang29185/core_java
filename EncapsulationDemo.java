package oopsconcept;

import java.util.Scanner;

/**
* Practical 14: Write a program to demonstrate encapsulation.
* @author Shivang
* @version 1.01 2022-01-24
*/
public class EncapsulationDemo {

	private String studentName;
	private int studentRollNo;
	private String studentBranch;
	private String studentResult;

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

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of total Data Entry:"); // Total number of Data
		int choice = scanner.nextInt();

		EncapsulationDemo encapsulationDemo = new EncapsulationDemo();

		for (int i = 1; i <= choice; i++) {
			System.out.print("Enter Student Name:"); // Student name
			encapsulationDemo.setStudentName(scanner.next());

			System.out.print("Enter Student Roll No:"); // Student roll no
			encapsulationDemo.setStudentRollNo(scanner.nextInt());

			System.out.print("Enter Student Branch:"); // Student branch
			encapsulationDemo.setStudentBranch(scanner.next());

			System.out.print("Enter Student result(pass / Fail):"); // Student result
			encapsulationDemo.setStudentResult(scanner.next());

			System.out.println();
			System.out.println("Student Details:"); // Display student details
			System.out.println("Name of student is:" + encapsulationDemo.getStudentName()); 
			System.out.println("Roll no is:" + encapsulationDemo.getStudentRollNo());
			System.out.println("Branch is:" + encapsulationDemo.getStudentBranch());
			System.out.println("Result is:" + encapsulationDemo.getStudentResult());
			System.out.println();
			System.out.println();
		}
		scanner.close();
	} // End of main

} // End of Encapsulation demo class