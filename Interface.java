package oopsconcept;

/**
* Practical 17:Write a program to demonstrate the interface.
* @author Shivang
* @version 1.01 2022-01-26
*/
interface InterfaceDetails {

	void display();

} // End of interface

class Interface implements InterfaceDetails {

	public void display() { // Display method
		System.out.println("Inside Interface");
		System.out.println("Inside display method");
	}

	public static void main(String[] args) {
		Interface interface1 = new Interface();
		interface1.display();
	} // End of main

} // End of class