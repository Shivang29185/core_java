package corejava;

/**
* Practical 10: Create programs of all the string methods like charAt(), concat(), equals() etc.
* @author Shivang
* @version 1.01 2022-01-21
*/
public class StringMethods {

	public static void main(String[] args) {
		String string = "Hello how are you"; // Initialization Strings
		String string2 = " I am Fine";
		String string3 = "";

		System.out.println("First String is: " + string); // Printing String
		System.out.println("Second String is: " + string2);

		System.out.println("Length of First String is: " + string.length()); // String Methods
		System.out.println("Length of Second String is: " + string2.length());

		System.out.println("Specific index value of index 8: " + string.charAt(8));

		System.out.println("ASCI value of index 4: " + string.codePointAt(4));
		System.out.println("ASCI value of before specified index 4: " + string.codePointBefore(4));

		System.out.println("Comparision of both string: " + string.compareTo(string2));

		System.out.println("Concatenate of both string: " + string.concat(string2));

		System.out.println("Finding sequence of character1: " + string.contains("how") + "\tFinding sequence of character2: " + 
		string.contains("abc") );

		System.out.println("String End with Specified character1: " + string.endsWith("ou") + "\tString End with Specified "
		+ "character2: " + string.endsWith("hel") );
		System.out.println("String Start with Specified character1: " + string.startsWith("re") + "\tString Start with Specified "
		+ "character2: " + string.startsWith("he") );

		System.out.println("Comparing both string using equal: " + string.equals(string2));

		System.out.println("Hash code of String2: "+string2.hashCode());

		System.out.println("Index of first letter of given word: " + string.indexOf("are"));

		System.out.println("Replace character: " + string.replace('o', 'i'));

		System.out.println("Checking String is Empty or not: " + string3.isEmpty());

		System.out.println("Convert the String into LowerCase: " + string2.toLowerCase());
		System.out.println("Convert the String into UpperCase: " + string2.toUpperCase());

		System.out.println("Remove White Space from both Side: " + string2.trim());
	} // End of main

} // End of string methods class