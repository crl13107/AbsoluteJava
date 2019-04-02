package chapter5_DefifiningClassesTwo;

import java.lang.Math;

public class StatCallingClasses {

	static int helloWorld = 0;
	static String idk = "Hello World";

	static void callingObject() {
		System.out.println("Static methods do not require a calling object.");
		System.out.println("You will call the class itself.");
		System.out.println(
				"Static methods can't use instance variables or methods invokving this, unless the method creates an object itself.");
		newObjectTest();
	}

	static void newObjectTest() {
		StatCallingClasses testClass = new StatCallingClasses();
		testClass.fakeMethod();
	}

	private void fakeMethod() {
		System.out.println("However, you can invoke a static method within another static method.");

	}

	public static void staticMethods() {
		System.out.println("Classes can have static variables that belong to the class");
		System.out.println("Final can be used for static variables, making it so the number can not change.");
		System.out.println(
				"Good programming style indicates that all static variables should be private unless they are final.");
		System.out.println(
				"YOU CAN'T access instance variables in a static method, but you can access static variables.");
		accessingStaticVariables();
	}

	public static void accessingStaticVariables() {
		helloWorld++;
		howManyVariablesCreated();
		for (int i = 0; i < 52; i++) {
			helloWorld++;
		}
		howManyVariablesCreated();
	}

	private static void howManyVariablesCreated() {
		System.out.println(helloWorld);
	}

	public static void mathClass() {
		System.out.println("The Math class contains many math methods Along with Pie and E");
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.abs(-3));
		double PIE = Math.PI;
		double E = Math.E;
		System.out.println(Math.sqrt(PIE) + ". Pie = " + PIE + ". E = " + E);
		System.out.println("The math class also contains the RNG which can be found in chapter3 Package");

	}

	public static void wrapperClasses() {
		Integer intergerObject = new Integer(32);
		@SuppressWarnings("unused")
		int i = intergerObject;
		System.out.println("Boxing is when you take an primitive and turn it into an object, unboxing is the opposite");
		System.out.println("Starting with Java 5.0, it does the unboxing and boxing automatically.");
		@SuppressWarnings("unused")
		Integer numberOfSamuria = 32;

		Double price = 19.90;
		price = price + 5.12;

		Double priceTwo = new Double(19.90);
		price = new Double(price.doubleValue() + 5.12);

		System.out.println(
				price + " " + priceTwo + " are the same, but one uses this new automatic boxing and unboxing.");

	}

	public static void staticWrapperClasses() {
		System.out.println("The wrapper class has a bunch of useful methods, which are all held within one library.");
		// TODO PAGE 282
		System.out.println(
				"There is no no arugment constructor for wrapper classes as it would make no sense to have a wrapper object that isn't assigned to a value!");

	}

	public static void classInvariant() {
		System.out.println("A statment that is always true for every object of the class is a class invariant.");
		System.out.println("A class invariant can ehlp to define a class in a consistent and organized way.");
		System.out.println(
				"You can compare numbers when you construct the object to make sure certain conditions are met.");
		System.out
				.println("Null can be used for things like if a person is dead, it says deathdate is null, or false.");

	}

	public static void copyConstructor() {
		System.out.println("A copy constructor is a constructor with a single argument of the same type as the class.");
		System.out.println("It should create a new object, but with the same values as the other object.");
		System.out.println("One should isntead use clone insteaed of copy constructors.. see chapter 8/13.");
		System.out.println("Using classes as arguments...~315");
	}

	public static void mutableAndImmutableClasses() {
		System.out.println("strings are immutable in java.");
		System.out.println("Deep copies don't share refrences while shallow copies do (shallow are unsafe).");
		System.out.println("Never return a refrence to a private instance variable as it ruins the concept of it.");
		
	}

}
