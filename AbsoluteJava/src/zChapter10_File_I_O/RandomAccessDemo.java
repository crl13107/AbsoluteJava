package zChapter10_File_I_O;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemo {

	public static void main(String[] args) {

		try {
			RandomAccessFile ioStream = new RandomAccessFile("bytedata", "rw");

			System.out.println("Writing 3 bytes to the file bytedata");
			ioStream.write(1);
			ioStream.write(2);
			ioStream.write(3);
			System.out.println("Length = " + ioStream.length());
			System.out.println("File point location = " + ioStream.getFilePointer());

			System.out.println("Moving file pointer to location 1.");
			ioStream.seek(1);
			byte oneByte = ioStream.readByte();
			System.out.println("The value at location 1 is " + oneByte);
			oneByte = ioStream.readByte();
			System.out.println("The next value is " + oneByte);

			System.out.println("Now we move the file pointer back to location 1, and change the byte");
			ioStream.seek(1);
			ioStream.write(9);
			ioStream.seek(1);
			oneByte = ioStream.readByte();
			System.out.println("The value at location 1 is now " + oneByte);

			System.out.println("Now we go to the end of the file and write a double.");
			ioStream.seek(ioStream.length());
			ioStream.writeDouble(41.99);
			System.out.println("The length of the file is now = " + ioStream.length());

			System.out.println("Returning to location 3, where we wrote the double");
			ioStream.seek(3);
			double oneDouble = ioStream.readDouble();
			System.out.println("The double value at location 3 is " + oneDouble);

			ioStream.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		catch (IOException e) {
			System.out.println("Problems withfile I/O.");
		}
		System.out.println("End of program.");
	}
}
