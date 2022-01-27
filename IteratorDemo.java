package oopsconcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
* Practical 20:Write a program to add string values(“Hello”,”world”,”$yourname” etc.) in the list and print all the values 
* using an iterator.
* @author Shivang
* @version 1.01 2022-01-26
*/
public class IteratorDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the total value you want to Enter:"); // Enter total valur
		int value = scanner.nextInt();
	
		List<String> addValue = new ArrayList<String>();

		for (int i = 0; i < value; i++) { // Getting array from user
			System.out.print("Enter value:");
			addValue.add(scanner.next());
		}
		scanner.close();

		System.out.println("Without Iterator");
		System.out.println(addValue); // Without iterator

		Iterator<String> iterator = addValue.iterator();
		System.out.println();
		System.out.println("With Iterator");

		while (iterator.hasNext()) { // Print the value using iterator
			System.out.println(iterator.next());
		}
	} // End main

} // End class