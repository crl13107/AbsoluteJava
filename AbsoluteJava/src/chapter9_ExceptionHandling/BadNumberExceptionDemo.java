package chapter9_ExceptionHandling;

import java.util.Scanner;

public class BadNumberExceptionDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter one of the numbers 42 and 24:");
			int inputNumber = keyboard.nextInt();
			if ((inputNumber != 42) && (inputNumber != 24))
				throw new BadNumberException(inputNumber);

			System.out.println("Thank you for entering" + inputNumber);
			keyboard.close();
		} catch (BadNumberException e) {
			System.out.println(e.getBadNumber() + " is not what I asked for.");
		}
		System.out.println("End of program.");
	}
}
