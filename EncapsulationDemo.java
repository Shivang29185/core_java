package oopsconcept;

import java.util.ArrayList;
import java.util.Scanner;

/**
* Practical 14: Write a program to demonstrate encapsulation.
* @author Shivang
* @version 1.01 2022-01-24
*/
public class EncapsulationDemo {

	class GetSet {

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

	} // End of get set class

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<GetSet> arrayList = new ArrayList<>();

		System.out.print("Enter the number of total Data Entry:"); // Total number of Data
		int choice = scanner.nextInt();


		for (int i = 1; i <= choice; i++) {
			GetSet getSet = new EncapsulationDemo().new GetSet();

			System.out.println("Enter the "+ i + " Student Detail:");
			System.out.print("Enter Student Name:"); // Student name
			getSet.setStudentName(scanner.next());

			System.out.print("Enter Student Roll No:"); // Student roll no
			getSet.setStudentRollNo(scanner.nextInt());

			System.out.print("Enter Student Branch:"); // Student branch
			getSet.setStudentBranch(scanner.next());

			System.out.print("Enter Student result(pass / Fail):"); // Student result
			getSet.setStudentResult(scanner.next());

			System.out.println();	

			arrayList.add(getSet);
		}

		for (GetSet getSet : arrayList) {
			System.out.println();
			System.out.println("Student Details:"); // Display student details
			System.out.println("Name of student is:" + getSet.getStudentName()); 
			System.out.println("Roll no is:" + getSet.getStudentRollNo());
			System.out.println("Branch is:" + getSet.getStudentBranch());
			System.out.println("Result is:" + getSet.getStudentResult());
			System.out.println();
			System.out.println();
		}
		scanner.close();
	} // End of main

} // End of Encapsulation demo class