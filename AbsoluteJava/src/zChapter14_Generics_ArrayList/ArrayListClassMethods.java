package zChapter14_Generics_ArrayList;

import java.util.ArrayList;

public class ArrayListClassMethods {
	public static void arraylist() {
		System.out.println("Array list is an array that can change length while the program is running.");
		System.out.println("Array lists are implemented using an array as a private instance variable.");
		System.out.println("They are 1)less effecient than arrays");
		System.out.println("2) do not have the square bracket notation, so they are more awkward");
		System.out.println("3) must contain Class types such as Double instead of double");
	}

	public static void usingArrayList() {
		System.out.println("Must include import java.util.ArrayList");
		System.out.println("Capacity = the amount of memory adresses an arraylist has allocated.");
		System.out.println("Java 7 supports typeinference for ArrayList.");
		System.out.println("An array list makes the object type it holds it's base class.");

	}

	public static void createArrayList() {
		ArrayList<String> list = new ArrayList<String>(20);
		ArrayList<String> list2 = new ArrayList<>(20);
		System.out.println("Add to be used before set normally");
		System.out.println("Add method overloaded");

		list.add("HI MOM");
		list2.add(1, "Hi miem");// adds string to 1 position and moves all other indexes up by 1

		list.set(0, "Hi mom!");
		String temp = list.get(0);
		System.out.println(temp);

		System.out.println(list.size()); // prints out how many objects in the ArrayList

		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}

	public static void methodsInArrayList() {
		System.out.println("Contains multiple methods better to look up as needed.");
		System.out.println("These include clone, trimToSize, contains, indexOf, etc.");
		System.out.println("Some methods require baseType while others require Object type.");
	}
	
	public static void tipsAndPitFalls() {
		System.out.println("use trimToSize to shrink the arrayList to save space where you can.");
		System.out.println("Clone method is a shallow copy and can lead to privacy leaks.");
		System.out.println("If you have clone in the base class, you can create"
				+ " a deep copy of every objectin the arrayList");
		System.out.println("Vector list is very similar to ArrayList and can be treated indentically?");//TODO
		System.out.println("ArrayList is a parameterized class. It has has parameter, which can be repalced by"
				+ " any reference type to obtain a class for a specific type.");
		System.out.println("Another word for paramterized classes is generics.");
		System.out.println("ArrayList without a generic are left  over from older java versions and aren't the same?");
	}


}
