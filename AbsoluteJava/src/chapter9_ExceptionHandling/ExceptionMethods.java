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
		System.out.println("Usually you want to catch the exception outside of the method that throws it.");
		System.out.println("If the method doesn't catch the exception, it must warn the user it can throw one.");
		System.out.println(
				"This warning is called a throw clause, including an exception class in a throws caluse is called declaring the exception");
		System.out.println("If the program can throw multiple exceptions, seperate it them by commmas.");
		System.out.println("2 ways to invoke ordinary exceptions:");
		System.out.println("Catching is the catch block within the method definition.");
		System.out.println(
				"Possible exception declared at start of method by placing throws caluse and letting whoever use it handle the exception.");
		System.out.println("This is often called the Catch or Declare Rule.");
		System.out.println(
				"You can keep throwing the responibility of the exception up the chain, but good programming has it be caught eventually.");
		System.out.println(
				"If an exeption is caught outside of a method, the method automatically ends if an exception is thrown.");
		System.out.println("The compiler will force you to follow the catch or declare rule.");

	}
	
	public static void exceptionsToCatchOrDeclareRule() {
		System.out.println("Some errors aren't force to be caught.");
		System.out.println("These errors usually indicate something is wrong with your code, as the exceptions are found in the standard java libraries.");
		System.out.println("Examples include runeTimeExceptions and Errors. ");
		System.out.println("Although legal to catch these errors, you are not forced to.");
		System.out.println("If an exception is never caught, our program eventually ends. Although all exceptions should be caught in good programming.");
		System.out.println("checked exceptions are checked for by catch and declare rule. unchecked ones aren't checked by this rule.");
		System.out.println("You don't need to worry too much which exceptions follow which rule because java will tell you.");
		System.out.println("If you overide a class that has exception methods, you can delete exceptions if you want.");
		System.out.println("Methods should throw exceptions, then the method should end the it should be caught outside of the method.");
		System.out.println("It is prefered to avoid exceptions where-ever possible though.");
		System.out.println("Exceptions should we saved for when different people would handle the errors differently");
		System.out.println("If everyone would handle your error the same way, you might as well handle the error instead of throwing an exception.");
		
	}
	
	public static void eventDrivenProgramming() {
		System.out.println("Exception handling is our first example of event-driven programming.");
		System.out.println("Objects send events, which are themselves objects.");
		System.out.println("Sending an event is called firing an event.");
	}
	
	public static void moreTechniques() {
		System.out.println("You can have nested try and catch blocks, but this is rarely how you should do it.");
		System.out.println("You must catch the exception in the innermost tryblock, or it will continue down looking for a catch.");
		System.out.println("So if you fail to catch the exception, it can skip to other parts of the program that you may of not intended for it to.");
		System.out.println("Finally block contains code to be executed whether the exception was called or not.");
		System.out.println("it should be placed after the try and catch block.");
		System.out.println("You can throw an exception inside of a catch block");
		System.out.println("it might be useful depending on the error message to throw exceptions for future blocks up the chain.");
		System.out.println("Assertion error's aren't required to be caught, but you can catch them.");
		System.out.println("Same with arrayIndexoutofboundsexception.");
		System.out.println("It is considered a run time error, so it doesn't have to be caught, although it can be caught.");
	}
}
