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
	public int compareTo(StudentDetails studentDetails) { // Method	
		return (this.id - studentDetails.id);
	}

	@Override
	public String toString() { // To String conversion
		return "StudentDetails [id=" + id + ", age=" + age + ", name=" + name + "]";
	}

} // End of studentDetail class

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<StudentDetails> studentDetails = new ArrayList<StudentDetails>();
		studentDetails.add(new StudentDetails(2, "Shivang", 21));
		studentDetails.add(new StudentDetails(3, "Ravi", 23));
		studentDetails.add(new StudentDetails(1, "Rutvik", 20));

		System.out.println("List before Shorting"); // Printing Before Shorting
		for (StudentDetails studentDetails2 : studentDetails) {
			System.out.println(studentDetails2);
		}

		Collections.sort(studentDetails); // Shorting method

		System.out.println();
		System.out.println("List After Shorting"); // Printing After Shorting
		for (StudentDetails studentDetails2 : studentDetails) {
			System.out.println(studentDetails2);
		}
	} // End of main

} // End of comparable demo class