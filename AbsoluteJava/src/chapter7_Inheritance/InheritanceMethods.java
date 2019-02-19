package chapter7_Inheritance;

public class InheritanceMethods {

	int a, b;

	void constructor(int a, int b) {
		a = this.a;
		b = this.b;
	}

	public static void basics() {
		System.out.println("Inherintance is one of the main reasons for OOP.");
		System.out.println("Inheritance creates basic classes that can be defined and complied.");
		System.out.println("Inheritance is where a derived class takes data from a base class.");
		System.out.println("base class is called superclass, derived is subclass.");
		System.out.println("The base/derived class inherits all instance variables and methods of the super class.");
		System.out.println("sometimes refered to as child/parent.");
		System.out.println("Adding final means a method can't be overidden by a subclass");
		System.out.println("Adding final to a class means the class may not be used as a base class.");
		System.out.println(
				"You make change the return type of an overridden method if the overridden return type is a subclass of the other return type");
		System.out.println("This is known as a covariant return type and is new in java.");
		System.out.println(
				"Aren't really changing the object, just putting more restrictions on it which is why it is ok.");
		System.out.println("You can make derived methods more permissive, but not more restrictive");
	}

	public static void superAndThis() {
		System.out.println("Super lets you acces immediate parent class.");
		System.out.println("The super constructor creates an object using the base class");
		System.out.println("Super must be the first call in a method, or it can no be used.");
		System.out.println("These are is-a relationships because each derived class is of base class.");
		System.out.println("Hence, objects belong to multiple classes.");
		System.out.println("super(theString,delimeters)");
		System.out.println("Super constructor will automatically be called.");

	}

	public static void enhancedTokenizer() {
		System.out.println("Enhanced string tokenizer is the same, but add a method named tokensSoFar.");
		System.out.println("This command can be used to print all of the tokens that have been used.");
	}

	public static void encapAndInheritance() {
		System.out.println("Private methods should be helping methods that are only used in the class.");
		System.out.println("If you want a method to be inhereted, it isn't just simple so make it public.");
		System.out.println("Protected gives access to inherited classes directly.");
		System.out.println("It also gives package access");
		System.out.println("By default java uses package, or friendly acess if you don't mark meethods/ints/etc");
		System.out.println("derived classes can't access variables that are package access unless in the same package");

	}

	public static void programmingWithInheritance() {
		System.out.println("We think in the has a vs is a relationship between classes.");
		System.out.println("You can create methods in subclasses with the name name and parameters.");
		System.out.println("You can then use super.methodName to access the base class method.");

	}

	protected static void classObject() {
		System.out.println("Every object and class we make are of the object class in java and many other iterations.");
		System.out.println("Object class is in java.lang, which is automatically imported.");
		System.out.println(
				"Every object has a equals and toString method, so it is important to override them because they will rarely work otherwise.");
		System.out.println("Many java imports assume your classes will contain these methods.");
		System.out.println("This assumption is usually that your methods have parameters: (object otherObject).");
		System.out.println("We must typecast the other object to type object.");
		System.out.println(
				"All objects contain a .getClass() which compare if the object were derived from the same class. This is makred final and can't be overriden");
		System.out.println("When comparing use getClass instead of instanceOf!");
		System.out.println(
				"getClass will get the class used to create the object, while instanceOf will check if it is a subclass/base class of.");
		// https://www.youtube.com/watch?v=zprPxfMqiIQ 
	}
	
	protected static void recap() {
		
	}

}
