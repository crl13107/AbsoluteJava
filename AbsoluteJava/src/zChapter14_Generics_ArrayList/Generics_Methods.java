package zChapter14_Generics_ArrayList;

public class Generics_Methods {

	public static void generics() {
		System.out.println(
				"Generics are of parameter types. This means any class definition " + "will work for the same method");
		System.out.println("Classes and methods can have a type parameter.");
		System.out.println("By convention, the paramter type is capitalized since it represents a class.");
		System.out.println();
	}

	public static void pitFallGalore() {
		System.out.println("Do not use the generic version in the constructor.");
		System.out.println("You can't plug in a primitive type for a type parameter.");
		System.out.println("A type param can't be used everywhere a type name can be.");
		System.out.println("You can't do Pair<String>[] a = new Pair<String>[10];");
		System.out.println("Technical reason in java don't allow it");// TODO
	}

	public static void boundsOfGenerics() {
		System.out.println("You can create a bounds of a parameter type by extending the class.");
		System.out.println("public class Pair<T extends Comparable. ");
		System.out.println(
				"This will only let other classes than implement comparable to use the class, creating a bound");
	}
	
	public static void genericMethods() {
		System.out.println("You can use generics in methods the same way you would a class.");
		System.out.println("You can derive a generic class from non generic classes too.");
		System.out.println("UnorderedPair extends and creates the only difference from pair"
				+ "that the order doesn't matter in the compare method.");
	}
}
