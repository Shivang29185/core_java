package oopsconcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
* Practical 23:Write a program to demonstrate the comparator interface.
* @author Shivang
* @version 1.01 2022-01-28
*/
class Students {

	int id;
	int age;
	String name;

	public Students(int id, String name, int age) { // Constructor
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", age=" + age + ", name=" + name + "]";
	}

} // End of Student class

class AgeComparator implements Comparator <Students> {

	@Override
	public int compare(Students student1, Students student2) { // Method of AgeComparator
		return student1.age - student2.age;
	}

} // End of age comparator class

public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Students> students= new ArrayList<Students>();
		students.add(new Students(2, "Shivang", 21));
		students.add(new Students(3, "Ravi", 23));
		students.add(new Students(1, "Rutvik", 20));

		System.out.println("List before Shorting"); // Printing Before Shorting
		for (Students students2 : students) {
			System.out.println(students2);
		}

		Collections.sort(students, new Comparator<Students>() { // Shorting method

			@Override
			public int compare(Students students1, Students students2) {
				return students1.name.compareTo(students2.name);
			}
		});

		System.out.println();
		System.out.println("List After Shorting using Name"); // Printing After Shorting
		for (Students students2 : students) {
			System.out.println(students2);
		}

		Collections.sort(students, new AgeComparator()); // Shorting method through class

		System.out.println();
		System.out.println("List After Shorting using age"); // Printing After Shorting
		for (Students students2 : students) {
			System.out.println(students2);
		}
	} // End of main

} // End of comparator class