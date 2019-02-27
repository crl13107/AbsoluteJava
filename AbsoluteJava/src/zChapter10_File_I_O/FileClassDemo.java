package zChapter10_File_I_O;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class FileClassDemo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String line = null;
		String fileName = null;

		System.out.println("I will store a line of text for you.");
		System.out.println("Enter the line of text:");
		line = keyboard.nextLine();
		System.out.println("Enter a file name to hold the line:");
		fileName = keyboard.nextLine();
		File fileObject = new File(fileName);

		while (fileObject.exists()) {
			System.out.println("There already is a file named " + fileName);
			System.out.println("Enter a different file name:");
			fileName = keyboard.nextLine();
			fileObject = new File(fileName);
		}
		PrintWriter outputStream = null;
		try {
			outputStream = new PrintWriter(new FileOutputStream(fileName));
		} catch (FileNotFoundException e) {
			System.out.println("no file found");
			System.exit(0);
		}
		System.out.println("Writing \"" + line + "\"");
		System.out.println("to the file" + fileName);
		outputStream.println(line);

		outputStream.close();
		keyboard.close();
		System.out.println("Writing complete");
	}
}
