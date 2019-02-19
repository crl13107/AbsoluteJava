package chapter8_PolymorphismAbstract;

public class PolyMethods {

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
		System.out.println("java uses static binding with static methods so the choice of which definition ofa satic method to use is determined by the type of the variabl, not by the object.");
		System.out.println("Non static methods may call static methods.");
		System.out.println("It may inherit the method and use it in a strange way.");
		
		
	}
}
