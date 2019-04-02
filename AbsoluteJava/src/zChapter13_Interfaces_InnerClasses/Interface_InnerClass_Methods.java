package zChapter13_Interfaces_InnerClasses;

public class Interface_InnerClass_Methods {

	public static void interfaces() {
		System.out.println("An interface is an extreme version of an abstract class.");
		System.out.println("It is like a contract that a class that implements it must do.");
		System.out.println("This is how java deals with multiple inheritance.");
		System.out.println("To implement an interface, a concrete class must 1)implement the intercae"
				+ "and 2) the class must implment ll method headings in the interface.");
		System.out.println("All methods must be public in an interface.");
		System.out.println("A class in java, unlike C++ may only have 1 base class.");
		System.out.println("Abstract classes can implement interfaces and only implement some of the methods.");
		System.out.println("Derving an interface from a base class is called extending the interface.");
		System.out.println("An interface can extend another interface, but no implement one.");
	}

	public static void interfacePitfalls() {
		// interface semantics are not enforced
		System.out.println("Interfaces do not force any semantics.");
		System.out.println("It would defeat multiple inheritance if it did.");
		System.out.println("Comments are nice to give in interfaces to help others, but they can ignore them.");
	}

	public static void comparableInterface() {
		System.out.println("The only method in comparebale interface is public int compareTo(Object other.");
		System.out.println("Negative if Object<Calling objects; 0 if equal, positive if Object>calling object.");
		System.out.println("Comparable follows 3 Semantics:");
		System.out.println("1)Irreflexive: for no object o does o come before o");
		System.out.println("2)Trichotomoy: only 1 holds true: o1 > o2, o1 = o2, o2>o1");
		System.out.println("3)Transitivity: if o1 comes before o2 and o2 before o3, o1 comes before o3.");
		System.out.println("Comprable is found in java.lang package, so it is avaialable to default.");
		System.out.println("It is up to the programmer to follow the semantics.");
		System.out.println("Only classes, not primitives, can use the comparable interface.");
		System.out.println("This is a good example of the put of wrappers to bring double to Double for comparison.");
	}

	public static void constantsInInterfaces() {
		System.out.println("The designers of java often used interfaces in ways it wasn't to be used for");
		System.out.println("One of these ways is to contain defined constants.");
		System.out.println("Interfaces can't have instance variable, but can have pub final vars.");
		System.out.println("Pitfall: illegal if two interfaces collide.");
		System.out.println("This means they have same headings/methods with differen outputs.");
	}

	public static void serializableInterface() {
		System.out.println("One of the ways they go against convetion is the serialiazble interface.");
		System.out.println("This lets you use I/O in a certain way");
		System.out.println("The interface itself contains no methods/constants.");
	}

	public static void cloneableInterface() {
		System.out.println("The clonable interface is used to say something about how the method clone"
				+ " which is inherited from the class Object should be used and how it should be redefined");
		System.out.println("Cloning can copy private data if done incorrectly.");
		System.out.println("Programmers have different ways that they like to use this.");
		System.out.println("It is important to know how the specific program expects the method to be redefined.");
		System.out.println("The official java way: ");
		System.out.println("Cloneable copies bit by bit and all primivite type data of immutable classes");
		System.out.println("The only issue is it if copies instance variables and causes a privacy leak.");
		System.out.println("Clones must have a try catch block because clone throws clonenothandled exception.");
	}

	public static void innerClasses() {
		System.out.println("Inner classes are classes within another class.");
		System.out.println("The most common use of them is as \"helping classes\"");
		System.out.println("The class that includes the inner class is the outer class.");
		System.out.println("Inner classes are local to the outer class.");
		System.out.println("Therfore you can reuse the same class name freely.");
		System.out
				.println("Inner and outer classes share private members. They also keep classes more self-contained.");
		System.out.println("To acess outer class variables, you must make an object of the inner class"
				+ " to acess the outer class.");
	}

	public static void moreInnerClass() {
		System.out.println("A static inner class is one that is not associated with an object of the outer class.");
		System.out
				.println("It can be added if the inner class has no reason to call outer class methods/instance vars.");
		System.out.println("You can use public inner classes the same as normal public methods.");
		System.out.println("You can create objects on the inner class directly if it is static.");
		System.out.println("it is legal to nest inner classes within inner classes.");
		System.out.println("These classes are inherited to derived classes and can't be overwitten.");
	}

	public static void annonymousClass() {
		System.out.println("Anon classes are created by embeding the class def inside the expression with new.");
		System.out.println("They have no class name.");
		System.out.println("By creating an interface with new, which has no constructor");
		System.out.println("You are really creating an object that implments the interface");
		System.out.println("Inner classes can be used to have two base classes.");
		System.out.println(
				"Many programmers like to use an anon class if you need only one object of a class and the class def is short");
	}
}
