package zChapter10_File_I_O;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BinaryOutputDemo {

	public static void main(String[] args) {
		
		try {
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("numbers.dat"));
			int i;
			for (i = 0; i <5;i++) 
				outputStream.writeInt(i);
			System.out.println("Numbers written to the file numbers.dat.");
			outputStream.writeDouble(9.99);
			outputStream.writeBoolean(false);
			outputStream.writeChar('A');
			outputStream.close();
		}
		catch (IOException e) {
		System.out.println("Problems with file output.");
		System.out.println(e.getMessage());
		}
		for (int i=0; i<5; i++)
			System.out.println();
	}
}
