package oopsconcept;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
* Practical 21:Write another program using Map and Set concepts.
* @author Shivang
* @version 1.01 2022-01-27
*/
public class MapSet {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>(); // Set data using Map
		map.put("Name", "Shivang");
		map.put("RollNo", "13");
		map.put("Branch", "Computer");
		map.put("SPI", "7.5");

		Set<String> set = new HashSet<String>(); // Set data using Set
		set.add("Shivang");
		set.add("13");
		set.add("Computer");
		set.add("7.5");

		System.out.println("Data of Map"); // Printing values of Map
		System.out.println(map);

		System.out.println();
		System.out.println("Data of Set"); // Printing values of Set
		System.out.print(set);
	} // End of main

} // End of class