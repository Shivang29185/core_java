package oopsconcept;

import java.util.ArrayList;
import java.util.Collections;

/**
* Practical 23:Write a program to demonstrate comparable interface.
* @author Shivang
* @version 1.01 2022-01-27
*/
class StudentDetails implements Comparable<StudentDetails> {

	int id;
	int age;
	String name;

	public StudentDetails(int id, String name, int age) { // Constructor
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(StudentDetails student) { // Method	
		return (this.id - student.id);
	}

	@Override
	public String toString() { // To String conversion
		return "StudentDetails [id=" + id + ", age=" + age + ", name=" + name + "]";
	}

} // End of class

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<StudentDetails> list = new ArrayList<StudentDetails>();
		list.add(new StudentDetails(2, "Shivang", 21));
		list.add(new StudentDetails(3, "Ravi", 23));
		list.add(new StudentDetails(1, "Rutvik", 20));

		System.out.println("List before Shorting"); // Printing Before Shorting
		for (StudentDetails stDetails : list) {
			System.out.println(stDetails);
		}

		Collections.sort(list); // Shorting method

		System.out.println();
		System.out.println("List After Shorting"); // Printing After Shorting
		for (StudentDetails stDetails : list) {
			System.out.println(stDetails);
		}
	} // End of main

} // End of class