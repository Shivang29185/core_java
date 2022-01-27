package oopsconcept;

import java.io.FileReader;
import java.io.IOException;

/**
* Practical 25:Write a program to read the data from a myTestFile file (Using File Handling, Input Handling, Loops, 
* String Handling, and Exception Handling).
* @author Shivang
* @version 1.01 2022-01-27
*/
public class HandleFile {

	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("F:\\study\\8th sem\\java internship\\myTestFile"); // File reading

			int i;
			while ((i = fileReader.read()) != - 1 ) {
				 System.out.print((char)i);
			}
			fileReader.close();
		} catch (IOException ioException) {
			System.out.println("Error:" + ioException);
		}
	} // End of main

} // End of class