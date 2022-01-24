package oopsconcept;

import java.util.Scanner;

/**
* Practical 15: Write a program to demonstrate all types of Inheritance concepts like.
		1. Single Inheritance.
* @author Shivang
* @version 1.01 2022-01-24
*/
class ParentClass {

	String emailid;
	int userid;

	void addDetails() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the Emailid:");
		emailid = scanner.next();

		System.out.print("Enter the Userid:");
		userid = scanner.nextInt();

		scanner.close();
	}

} // End of class

public class SingleInheritance extends ParentClass {

	static String name;
	static String mobileNo;

	void display() {
		System.out.println();
		System.out.println("Userid is:" +this.userid);
		System.out.println("Name is:" + name);
		System.out.println("Emailid is:" +this.emailid);
		System.out.println("Mobile no is:" + mobileNo);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the name:");
		name = scanner.next();
		
		System.out.print("Enter the Mobile no:");
		mobileNo = scanner.next();

		SingleInheritance singleInheritance = new SingleInheritance();
		singleInheritance.addDetails();
		singleInheritance.display();

		scanner.close();
	} // End of main
	
} // End of class
