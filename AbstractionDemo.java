package oopsconcept;

import java.util.Scanner;

/**
* Practical 13: Write a program to demonstrate data abstraction.
* @author Shivang
* @version 1.01 2022-01-24
*/

abstract class Triangle {
	
	float height1, breath1;
	
	/*public Triangle(float height, float breath) { // Constructor for Triangle
		this.height1 = height;
		this.breath1 = breath;
	}*/

	abstract void areaOfTriangle(float height, float breath); // Abstract area of triangle method
} // End of class

public class AbstractionDemo extends Triangle {

	static float height, breath;
	float area;

	/*public AbstractionDemo(float height, float breath) { // Constructor for abstraction demo
		super(height,breath);
	}*/
	
	@Override
	void areaOfTriangle(float height, float breat) { // Abstraction override
		area = (height * breath) / 2;
		System.out.println("Area of Triangle is:" + area);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the Height:");
		height = scanner.nextInt();

		System.out.print("Enter the Breath:");
		breath = scanner.nextInt();

		scanner.close();

		//AbstractionDemo abstractionDemo = new AbstractionDemo(height, breath);
		AbstractionDemo abstractionDemo = new AbstractionDemo();
		abstractionDemo.areaOfTriangle(height, breath);
	} // End of main
	
} // End of class
