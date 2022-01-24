package corejava;

import java.util.Scanner;

/**
* Practical 12: Write a program to demonstrate static methods, variables, and blocks.
* @author Shivang
* @version 1.01 2022-01-20
*/

public class StaticDemo {
	
	static double pi = 3.14; // Static variable
	static { // Static block
		System.out.println("This is static block");
	}
	public static void AreaOfCircle() { // Static method
		double r, area;

		Scanner scanner = new Scanner (System.in);

		System.out.print("Enter the value of radius:");
		r = scanner.nextInt();

		area = pi * r * r;

		System.out.println("Area of circle is:"+ area);
	}

	public static void main(String[] args) {
		AreaOfCircle();
	} // End of main

} // End of main
