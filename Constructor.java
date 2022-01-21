package corejava;

/**
* Practical 7: Write a program to demonstrate the example of constructor and Parameterized constructor
* @author Shivang
* @version 1.01 2022-01-20
*/

public class Constructor {

	public Constructor() { // Default Constructor
		int number = 10;
		System.out.println("Default Constructor");
		System.out.println(number);
	}
	
	public Constructor(int a , int b) { // Parameterized constructor for adding two values
		int number = a;
		int number1 = b;
		int sum = number + number1;
		System.out.println("Parameterized Constructor");
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Constructor constructor = new Constructor();
		Constructor constructor1 = new Constructor(5,20);
	} // End of main

} //End of class

