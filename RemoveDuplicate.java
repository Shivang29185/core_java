package oopsconcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
* Practical 22:Write a program to prepare the list like(“A”, ”B”, ”C”, ”D”, ”A”, ”C”, ”E”,”E”, ”E”) and remove duplicate 
* values of the list.
* @author Shivang
* @version 1.01 2022-01-27
*/
public class RemoveDuplicate {

	public static void main(String[] args) {
		// Initialization of String
		List<String> listStrings = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "A", "C", "E", "E", "E"));

		System.out.println("List values:"+ listStrings); // Print list Values

		for (int i = 1; i < listStrings.size(); i++) { 
			for (int j = 2; j < listStrings.size(); j++) {
				String value = listStrings.get(i);
				String value2 = listStrings.get(j);

				if (value.equals(value2)) { // Comparing two values
					listStrings.remove(value2);
				}
			}
		}
		System.out.println("List values After removing Dublicate values:"+ listStrings); // Print list Values
	} // End of main

} // End of Remove Duplicate class