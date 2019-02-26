package chapter9_ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class ExceptionMethods {

	public static void basics() {
		System.out.println("One way of dividing task of designing and coding is split into 2 tasks:");
		System.out.println("One where nothing unusual happens and one where there is an error.");
		System.out.println("This is the system of a library throwing an excepting and handling the exception");
		System.out.println("First your program \"try\" to run through the program");
		System.out.println("If an exception happens, it then runs the catch block part of code.");
		System.out.println("Catch block is often refered to as an exception handler");
		System.out.println("By convention you should use e for your exception catches.");
		System.out.println(
				"The throw block is in control, but the catch takes control if there is an error in the porgam");

	}

	public static void handlingWithScanner() {
		Scanner keyboard = new Scanner(System.in);
		int number = 0;
		boolean done = false;

		while (!done) {
			try {
				System.out.println("Enter a whole number");
				number = keyboard.nextInt();
				done = true;
				System.out.println("Final number is " + number);
				keyboard.close();
			} catch (InputMismatchException e) {
				keyboard.nextLine();
				System.out.println("Not a correctly written whole number!!!");
				System.out.println("Please try again");
			}
		}
	}

	public static void throwingExceptions() throws Exception {
		System.out.println("Most programs only require we handle errors, but we can create our own error handling");
		System.out.println("every exception has a string instance variable that contains a message");
		System.out.println("This is how the method e.getmessage() prints the message the error contains.");
		System.out.println("For example, the error might be division by zero or negative numbers not allowed.");
		int i = 0;
		if (i == 32)
			throw (new Exception("Lesson is canceled. no students"));

	}

	public static void exceptionClass() {
		System.out.println("When creating an exception class, it must extend the exception class");
		System.out.println("the main will contain all the members of the class.");
		System.out.println(
				"The constructors are the most important part. Your class will usually only contain 2 constructor methods and that is it.");
		System.out.println();
		System.out.println("Unless you have a good reason, just extend the base exception class");
		System.out.println("Every exception you defeine should extend an exception class");

	}

	public static void multipleCatchBlocks() {
		System.out.println("You can have different catch blocks that run depending on which exception occurs.");
		System.out.println("Catch blocks are checked in order, so the most specific must be checked first.");
		System.out.println(
				"If a catch block covers all exceptions, the other catch blocks are dead code since the first catch block will always catch the exception.");
	}

	public static void throwingExceptionsInMethods() {
		
	}
}
