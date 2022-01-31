package corejava;

import java.util.Scanner;

/**
* Practical 12: Write a program to demonstrate static methods, variables, and blocks.
* @author Shivang
* @version 1.01 2022-01-24
*/
public class StaticDemo {

	static double pi = 3.14; // Static variable

	static { // Static block
		System.out.println("This is static block");
	}

	public static void areaOfCircle() { // Static method
		double radius;
		double area;

		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter the value of radius:");
		radius = scanner.nextInt();

		area = pi * radius * radius;

		System.out.println("Area of circle is:"+ area);
		scanner.close();
	}

	public static void main(String[] args) {
		areaOfCircle();
	} // End of main

} // End of main