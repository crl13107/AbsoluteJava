package zChapter10_File_I_O;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class BinaryInputDemo {

	public static void main(String[] args) {
		//MUST BE BINARY TYPE TO READ, DOES NOT READ FILES
		try {

			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("numbers.dat"));
			System.out.println("Reading the file numbers.dat");
			int n1 = inputStream.readInt();
			int n2 = inputStream.readInt();

			System.out.println("Numbers read from file: ");
			System.out.println(n1);
			System.out.println(n2);
			inputStream.close();
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find file numbers.dat");
		}
		catch (IOException e) {
			System.out.println("Problems with input from numbers.dat");
		}
		System.out.println("End of program");
	}
}