package zChapter10_File_I_O;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ArrayIODemo {

	/**
	 * 
	 */

	public static void main(String[] args) {
		try {
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("datafile"));

			SomeClass[] a = new SomeClass[2];
			a[0] = new SomeClass(1, 'A');
			a[1] = new SomeClass(2, 'B');

			outputStream.writeObject(a);

			outputStream.close();

			System.out.println("data sent to file");

		} catch (IOException e) {
			System.out.println("Problem with file output");
		}
		System.out.println("Now let's reopen the file and dispaly the data.");
		SomeClass[] b = null;
		
		try {
			@SuppressWarnings("resource")
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("datafile"));
			b = (SomeClass[])inputStream.readObject();
			

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found");
		} catch (IOException e) {
			System.out.println("General problems");
		}
		for (int i=0; i <b.length; i++)
			System.out.println(b[i]);
		System.out.println("End of program.");
	}
}
