package oopsconcept;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
* Practical 24:Write a program to create a text file(The file name is “myTestFile”)and add your personal details to 
* the test file.
* @author Shivang
* @version 1.01 2022-01-27
*/
public class CreateFile {

	public static void main(String[] args) {
		try {
			File file = new File("F:\\study\\8th sem\\java internship\\myTestFile");
			FileWriter fileWriter = new FileWriter(file);

			if (file.createNewFile()) { // Creating new file
				System.out.println("File created: " + file.getName());
			} else {
				System.out.println("File already Exists.");
			}

			fileWriter.write("Name: Shivang \n");
			fileWriter.write("Age: 21 \n");
			fileWriter.write("Sem: 8 \n");
			fileWriter.write("Branch: Computer\n");
			fileWriter.write("Collage: GEC Modasa");
			fileWriter.close();
		} catch (IOException ioException) {
			System.out.println("Error:" + ioException);
		}
	} // End main

} // End class