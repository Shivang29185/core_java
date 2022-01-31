package oopsconcept;

import java.util.Scanner;

/**
* Practical 16: Write a program to demonstrate two types of polymorphism like compile-time and runtime polymorphism.
* @author Shivang
* @version 1.01 2022-01-25
*/
class Addition {

	public void Add(int value1, int value2) { // Add with two parameter method
		int sum = value1 + value2;

		System.out.println();
		System.out.println("Function Overloading");
		System.out.println("Addition of two value is:" + sum);
	}

	public void Add(int value1, int value2, int value3) { // Add with three parameter method
		int sum2 = value1 + value2 + value3;

		System.out.println();
		System.out.println("Function Overloading");
		System.out.println("Addition of three value is:" + sum2);
	}

	public void Add(int value1, int value2, int value3, int value4) { // Add with two parameter method
		int sum3 = value1 + value2 + value3 + value4;

		System.out.println();
		System.out.println("Function Overloading");
		System.out.println("Addition of four value is:" + sum3);
	}

} // End of Addition class

public class Polymorphism extends Addition {

	public void Add(int value1, int value2) { // Add two number in overriding
		int sum4 = value1 + value2;

		System.out.println();
		System.out.println("Function Overridding");
		System.out.println("Addition of two value is:" + sum4);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the First value:");
		int value1 = scanner.nextInt();

		System.out.print("Enter the Second value:");
		int value2 = scanner.nextInt();

		System.out.print("Enter the Third value:");
		int value3 = scanner.nextInt();

		System.out.print("Enter the Fourth value:");
		int value4 = scanner.nextInt();

		Addition addition = new Addition();
		addition.Add(value1, value2);
		addition.Add(value1, value2, value3);
		addition.Add(value1, value2, value3, value4);

		Polymorphism polymorphism = new Polymorphism();
		polymorphism.Add(value1, value2);

		scanner.close();
	} // End of main

} // End of polymorphism class