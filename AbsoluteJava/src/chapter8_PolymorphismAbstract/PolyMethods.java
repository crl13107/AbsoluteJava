package chapter8_PolymorphismAbstract;

public class PolyMethods extends AbstractClasses {

	public static void polyBasics() {
		System.out.println("The 3 main points of OOP are encapsulation, inheritance and polymorphism.");
		System.out.println("Java uses late, or dynamic binding.");
		System.out.println("Binding refers to the process of associating a method definition");
		System.out.println("with the method definition witha  method invocation.");
		System.out.println("Early binding is when the method definition is associated with the method invocation.");
		System.out.println(
				"Late binding is when method definition is associated with the method invocation at run time.");
		System.out.println(
				"Additional overhead is placed with each object keeping track of where all the methods are located. This is the cost of late binding");
		System.out.println(
				"late bind = polymorphism almost. It just means process of assigning multiple meanings to the same method name uing late binding");

	}

	public static void polyFinal() {
		System.out.println("Final allows java to use early binding, but doesn't improve effeciency that much.");
		System.out.println("Final classes can't be extended and can not be edited");
		System.out.println("So final classes can't be used as base or derived classes");

	}

	public static void lateBindingToString() {
		System.out.println("SysOut has a method to string, so when we call it");
		System.out.println("It produces sysout(theObject.toString");
		System.out.println("Java doesn't use late binding for private or static method.");
		System.out.println(
				"When java doesn't use late binding, it uses static binding in which the decision of which definition of a method to use with a calling object is made at compile time based on the type of variable naming the object.");
		System.out.println(
				"java uses static binding with static methods so the choice of which definition ofa satic method to use is determined by the type of the variabl, not by the object.");
		System.out.println("Non static methods may call static methods.");
		System.out.println("It may inherit the method and use it in a strange way.");
	}

	public static void casting() {
		System.out.println("You can assign derived classes = to base class types.");
		System.out.println("Might not seem useful at first, but we do this every time we use super.");
		System.out.println(
				"Class parameter decides which method names can be used, but the argument determines which definition of the method name is used.");
		System.out.println("Downcasting is tricky and often involves errors, while upcasting is ok.");
		System.out.println("Sale otherSale  = (Sale)otherObject"); // creates a new object using downcasting
		System.out.println("discountVariable = saleVariable");// also illegal
		System.out.println("Up to programmer to only use downcasting when it makes sense..");
		System.out.println("One way is to use isntance of to check before downcasting.");
		System.out.println("For example: if (someObject instanceof DiscountSale then ....");
	}

	public static void introToClone() {
		System.out.println("Clone has no parameters and returns a copy of the calling object");
		System.out.println("It doesn't do this by default, so you must override and make it do what you want.");
		System.out.println("Java 5.0 allows covariant casting.. but you can extra cast just to be safe.");
		System.out.println("Copy method doesn't perform a true copy because it doesn't support covariant types.");
		System.out.println(
				"This is why the clone method is used because of late binding creating the right type of object.");

	}

	public static void abstractClassMethods() {
		System.out.println("Abstract classes can't be used to create objects.");
		System.out.println(
				"They simply list unfinished methods classes must implement if they extend the abstract class.");
		System.out.println("A non abstract class is a concrete one.");
		System.out.println("Can only make an object of a descendant of an abstract class, not the class it'self.");
		System.out.println("Not all methods need to be abstract in the class, ie have a constructor in it.");
	}

	@Override
	public void abstractClasses() {
		// TODO Auto-generated method stub

	}

}
