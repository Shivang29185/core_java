package oopsconcept;

import java.util.Scanner;

/**
* Practical 13: Write a program to demonstrate data abstraction.
* @author Shivang
* @version 1.01 2022-01-24
*/
abstract class Shape {

	int side;

	public Shape(int side) {
		this.side = side;
		int area = side * side;

		System.out.println();
		System.out.println("Area of Square is:" + area);
	}

	abstract void areaOfTriangle(float height, float breath); // Abstract area of triangle method

} // End of shape class

public class AbstractionDemo extends Shape {

	static int side;

	public AbstractionDemo(int side) { // Constructor for abstraction demo
		super(side);
	}

	void areaOfTriangle(float height, float breath) { // Abstraction override
		float area = (height * breath) / 2;
		System.out.println("Area of Triangle is:" + area);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the Height of triangle:");
		float height = scanner.nextFloat();

		System.out.print("Enter the Breath of triangle:");
		float breath = scanner.nextFloat();

		System.out.print("Enter the side of square:");
		side = scanner.nextInt();

		scanner.close();

		AbstractionDemo abstractionDemo = new AbstractionDemo(side);
		abstractionDemo.areaOfTriangle(height, breath);
	} // End of main

} // End of abstraction demo class