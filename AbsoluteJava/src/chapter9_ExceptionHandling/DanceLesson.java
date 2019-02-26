package chapter9_ExceptionHandling;

import java.util.Scanner;

public class DanceLesson {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter number of male dancers");
		int men = keyboard.nextInt();

		System.out.println("Enter number of female dancers");
		int women = keyboard.nextInt();
		try {
			if (men == 0 && women == 0)
				throw new Exception("Lesson canceled, no studnets!");
			else if (men == 0)
				throw new Exception("lesson is canceled. No men");
			else if (women == 0)
				throw new Exception("Lesson canceled, no wamans");
			if (women >= men)
				System.out.println("Each man must dance with " + women / men + " women.");
			else
				System.out.println("Each women must dance with " + men / women + " men.");
		} catch (Exception e) {
			String message = e.getMessage();
			System.out.println(message);
			System.exit(0);
		}
		System.out.println("Begin the lesson");
		keyboard.close();

	}
}
