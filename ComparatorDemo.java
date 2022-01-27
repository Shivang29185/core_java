package oopsconcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
* Practical 23:Write a program to demonstrate comparator interface.
* @author Shivang
* @version 1.01 2022-01-27
*/
class NameComparator implements 
public class ComparatorDemo {
	
	public static void main(String[] args) {
		ArrayList<StudentDetails> list = new ArrayList<StudentDetails>();
		list.add(new StudentDetails(2, "Shivang", 21));
		list.add(new StudentDetails(3, "Ravi", 23));
		list.add(new StudentDetails(1, "Rutvik", 20));

		System.out.println("List before Shorting"); // Printing Before Shorting
		for (StudentDetails stDetails : list) {
			System.out.println(stDetails);
		}

		Collections.sort(list, new NameComparator() ()); // Shorting method

		System.out.println();
		System.out.println("List After Shorting"); // Printing After Shorting
		for (StudentDetails stDetails : list) {
			System.out.println(stDetails);
		}

	}

}
