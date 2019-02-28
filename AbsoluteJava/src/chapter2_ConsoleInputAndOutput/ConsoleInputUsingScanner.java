package chapter2_ConsoleInputAndOutput;

import java.util.Scanner; //used for input from user

public class ConsoleInputUsingScanner {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Type the int you want to see");
		int num = keyboard.nextInt();
		System.out.println(num);

		String word = keyboard.nextLine(); // just next for word
		System.out.println("you entered the line: " + word);
		System.out.println("sometimes have to do a nextline to get rid of the \\n");
		System.out.println("\n It is good to echo the user input so that it checks and correctly displays!\n");

		System.out.println("Enter two numbers using # delimiter");
		keyboard.useDelimiter("#");
		String int1 = keyboard.next();
		String int2 = keyboard.next();
		System.out.println("You entered " + int1 + " " + int2 + " using # Delimiter");

		System.out.println("Keep in mind keyboard.nextint wouldn't won't work as you can't store whitespace in it.");

		keyboard.close();
	}
}
