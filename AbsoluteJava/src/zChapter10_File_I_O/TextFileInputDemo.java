package zChapter10_File_I_O;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileInputDemo {

	public static void main(String[] args) {

		try {
			BufferedReader inputStream = new BufferedReader(new FileReader("morestuff2.txt"));

			String line = inputStream.readLine();
			System.out.println("The first line read from the file is: " + line);

			inputStream.skip(32); // skips 32 characters

			line = inputStream.readLine();
			System.out.println("The second line read from the file is " + line);

			System.out.println("Reading using read statment: ");

			char next = (char) (inputStream.read());
			System.out.println(next);
			System.out.println(inputStream.read());
			inputStream.close();
		} catch (FileNotFoundException e) {
			System.out.println("File was no found or could not be opened");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
