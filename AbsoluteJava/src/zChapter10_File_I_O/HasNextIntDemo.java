package zChapter10_File_I_O;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HasNextIntDemo {

	public static void main(String[] args) {
		Scanner inputStream = null;

		try {
			inputStream = new Scanner(new FileInputStream("data.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File data.txt was not found or couldn't be opened");
			System.exit(0);
		}
		int next, sum = 0;
		// TODO to put inputmismatch,nosuchelement and illegalstate exceptions, but
		// none of these are required to be put

		while (inputStream.hasNextInt()) {
			next = inputStream.nextInt();
			sum = sum + next;
			// sums all the ints found in a row. breaks when there isn't an int found 1 2
			// asdflsadf 3 4 = 3
		}
		inputStream.close();
		System.out.println("The sum of the numbers is " + sum);
	}
}
