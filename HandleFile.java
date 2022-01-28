package oopsconcept;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
* Practical 25:Write a program to read the data from a myTestFile file (Using File Handling, Input Handling, Loops, 
* String Handling, and Exception Handling).
* @author Shivang
* @version 1.01 2022-01-27
*/
public class HandleFile {

	public static void main(String[] args) throws IOException {
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		try {
			File file = new File("F:\\study\\8th sem\\java internship\\myNewTestFile");
			fileReader = new FileReader("F:\\study\\8th sem\\java internship\\myTestFile"); // File reading
			fileWriter = new FileWriter(file);

			int i;
			while ((i = fileReader.read()) != - 1 ) {
				System.out.print((char)i);

				i = Character.toUpperCase(i);
				fileWriter.write(i);
			}
		} catch (IOException ioException) {
			System.out.println("Error:" + ioException);
		} finally {
			fileReader.close();
			fileWriter.close();
		}
	} // End of main

} // End of Handle file class