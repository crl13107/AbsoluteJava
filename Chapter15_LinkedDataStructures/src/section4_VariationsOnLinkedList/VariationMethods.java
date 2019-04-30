package section4_VariationsOnLinkedList;

public class VariationMethods {

	public static void intro() {
		System.out.println("The main difference betwwen single and double link is double link keeps"
				+ "a link to the pervious node as well.");
		System.out.println("In some cases this makes our"
				+ " code simpler because we don't need temp variables to hold previous location");
		System.out.println("When deleting, you need to update 2 previous node and link though.");
	}

	public static void stack() {
		System.out.println("Stack is not a linked data structure, but it can be implemented that way.");
		System.out.println("Stack is lifo, like cafeteria trays.");
	}

	public static void queue() {
		System.out.println("A Queue is a FIFO based structure.");
		System.out.println("Needs pointers to both head and tail. Easier to remove from head");
	}

	public static void timeComplexity() {
		System.out.println("Big O notation is the estimate on run time, or upper-bound estimate");
		System.out.println("Linear = N / Quadratic less than N^2 / Expo: over N^2");
	}
}
