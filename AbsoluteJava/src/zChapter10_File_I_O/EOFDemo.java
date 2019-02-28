package zChapter10_File_I_O;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EOFDemo {

	public static void main(String[] args) {

		try {
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("numbers.dat"));
			int number;
			System.out.println("Reading numbers in numbers.dat");
			try {
				while (true) {
					number = inputStream.readInt();
					System.out.println(number);
				}

			} catch (EOFException e) {
				System.out.println("No more numbers.");
				inputStream.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found or can't be edited.");
		} catch (IOException e) {
			System.out.println("Problem with input from file numbers.dat");
		}
	}
}