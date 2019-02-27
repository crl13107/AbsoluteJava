package zChapter10_File_I_O;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileDemoScanner {

	public static void main(String[] args) {

		Scanner inputStream = null;
		try {
			inputStream = new Scanner(new FileInputStream("morestuff.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File morestuff.txt was not found,");
			System.out.println("or could not be oppened.");
			System.exit(0);
		}
		int n1 = inputStream.nextInt();
		int n2 = inputStream.nextInt();
		int n3 = inputStream.nextInt();

		inputStream.nextLine(); // to go to the next line
		String line = null;
		while (inputStream.hasNextLine()) {
			line = inputStream.nextLine(); //keeps creating new lines, not good for java
		}

		System.out.println("The three numbers read from the file are: " + n1 + ", " + n2 + ", " + n3);
		System.out.print("The last line read from the file is: ");
		System.out.println(line);
		inputStream.close();
	}
}
