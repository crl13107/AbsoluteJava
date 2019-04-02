package chapter4_DefiningClassOne;

public class InformationHidingAndEncapsulation {

	public static void main(String[] args) {
		System.out.println("Private sets variable to not be accessible outside of the class");
		System.out.println("Considered good programming, can still access through methods of the class");
		System.out.println("Therefore, most methods are public");
		System.out.println("Accessor moethods allow you to obtain data, mutator lets you change data");
		System.out.println("This means every programmer who uses the classes can use them and create "
				+ "their own obect to use, \nbut they can not mess with the class, only use set given methods");
		System.out.println("One good way is to write preconditions and post conditions for who uses the class");
		/**
		 * precondition: all of the values are ints postcondition: No one will actually
		 * ever read this
		 */
		System.out.println("Some programmers don't use these conditions, but you should always think in this way\n\n");

		// 4.3 - Overloading'
		System.out.println("Name and parameter list is the method signature.. setDate(int, int, int)");
		System.out.println(
				"You can not define operators such as the + in java to work with objects of a class you define like you can in c++");
		System.out.println("Consturctors set inital values of an object when it is made.");
		// page 230 stuff to datefirstry
		System.out.println(
				"Some arguemnts arise over consturctors are methods, but most argue they are, but a special kind");
		System.out.println(
				"You can invoke methods in the deifintion of a constructor, the new object is automatically set as this in the consturctor");
		System.out.println("Every class you created should have a no-argument consturctor(Sometimes called default constructor)");
		
	}
}
