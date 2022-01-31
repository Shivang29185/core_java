package oopsconcept;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
* Practical 24:Write a program to create a text file(The file name is “myTestFile”)and add your personal details to 
* the test file.
* @author Shivang
* @version 1.01 2022-01-27
*/
public class CreateFile {

	public static void main(String[] args) throws IOException, NullPointerException {
		Scanner scanner = new Scanner(System.in);
		FileWriter fileWriter = null;
		String pathname = "F:\\study\\8th sem\\java internship\\myTestFile";
		File file = new File(pathname);

		try {
			fileWriter = new FileWriter(file);

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
		} catch (IOException ioException) {
			System.out.println("Error:" + ioException);
		} finally {
			fileWriter.close();
		}

		System.out.println("Do you want to delete current file? (yes / no): ");
		String choice = scanner.next();

		scanner.close();
		if (choice.equalsIgnoreCase("yes")) {
			file.delete();
			System.out.println("File is deleted:" + file.getName());
		}
	} // End main

} // End create file class