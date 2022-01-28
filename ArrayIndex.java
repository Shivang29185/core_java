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

		System.out.print("Enter the total entry:");
		int number = scanner.nextInt();

		int[] array = new int[number]; // Create array

		System.out.print("Enter Array Element:"); // Enter the array Element
		for (int i = 0; i < number; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.print("Enter the Array Element which index you want to found:"); 
		int find = scanner.nextInt();

		scanner.close();

		int count = 0;

		for (int i = 0; i < array.length; i++) { // Search & print index
			if (array[i] == find) {
				System.out.println("Index of " + find + " is:" + i );
				count++;
			}
		}
		if (count < 1) {
			System.out.println(find + " is not present in array");
		} 
	} // End of main

} // End of Array index class