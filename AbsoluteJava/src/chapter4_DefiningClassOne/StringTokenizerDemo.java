package chapter4_DefiningClassOne;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerDemo {

	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your last name");
		System.out.println("folloed by your first and middle names");
		System.out.println("If you have no middle name");
		System.out.println("enter \"None\".");
		String inputLine = keyboard.nextLine();
		
		String delimiters = ", "; // comma and blank space
		StringTokenizer nameFactory = new StringTokenizer(inputLine, delimiters);
		String firstName = nameFactory.nextToken();
		String lastName = nameFactory.nextToken();
		String middleName = nameFactory.nextToken();
		if (middleName.equalsIgnoreCase("none"))
			middleName = ""; //emtpy string
		
		System.out.println("Hello " + firstName + " " + middleName + " " + lastName);
		keyboard.close();
	}
}
