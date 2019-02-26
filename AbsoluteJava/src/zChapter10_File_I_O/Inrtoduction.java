package zChapter10_File_I_O;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Inrtoduction {

	public static void main(String[] args) {
		IO_Methods.intrdocution();
		IO_Methods.textFiles();
		PrintWriter outputStream = null;
		try {
			outputStream = new PrintWriter(new FileOutputStream("stuff.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Error opening the file");
			System.exit(0);
		}

		System.out.println("Writing to file.");
		outputStream.println("The quick brown fox");
		outputStream.println("jumps over the lazy dog");
		outputStream.close();
		
		IO_Methods.pitFallsOne();

	}
}
