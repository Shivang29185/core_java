package oopsconcept;

import java.util.Scanner;

/**
* Practical 19:Write a program to find the index of an array element.
* @author Shivang
* @version 1.01 2022-01-26
*/
public class ArrayIndex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] array = new int[20]; // Create array

		System.out.print("Enter the number:");
		int number = scanner.nextInt();

		System.out.print("Enter Array Element:"); // Enter the array Element
		for (int i = 0; i < number; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.print("Enter the Array Element which index you want to found:"); 
		int find = scanner.nextInt();

		scanner.close();

		for (int i = 0; i < array.length; i++) { // Search & print index
			if (array[i] == find) {
				System.out.println("Index of " + find + " is:" + i );
			} else {
				System.out.println("Element not found in Array");
			}
		}	
	} // End of main

} // End of class