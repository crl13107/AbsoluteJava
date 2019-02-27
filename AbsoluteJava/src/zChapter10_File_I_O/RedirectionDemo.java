package zChapter10_File_I_O;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class RedirectionDemo {

	public static void main(String[] args) {
		PrintStream errStream = null;
		try {
			errStream = new PrintStream(new FileOutputStream("errormessages.txt"));			
		}
		catch (FileNotFoundException e) {
			System.out.println("Error openingfile");
			System.exit(0);
		}
		System.err.println("Hello from System.err");
		System.out.println("Hell from system.out");
		System.err.println("Hell again from system.err");
		
		errStream.close();
	}
}
