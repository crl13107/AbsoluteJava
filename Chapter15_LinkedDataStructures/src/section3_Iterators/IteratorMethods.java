package section3_Iterators;

public class IteratorMethods {

	public static void introduction() {
		System.out.println("Iterator steps through objects 1 by 1, performing steps on each object.");
		System.out.println("Made inner class public so that we can have variables of type outside of the class");
		System.out.println("We don't plan to use the inner class outside of the outer class otherwise.");
		System.out.println("The iterator i produced i this way can only be used with the linked list named list.");
		System.out.println("When using this way, the outer class name must be used before the inner class.");
	}

	public static void linkedListContinued() {
		System.out.println("Position refrences the current node in the linked list.");
		System.out.println("Previous is the link to the next node.");
		System.out.println("Maybe some typos in this section, pretty confusing and wrong imo.");
		System.out.println(
				"Java has an interface named iterator that specifies how java would like an iterator to behave");
		System.out.println("These iterators don't meet the requirements, but are in the same spirit.");
		System.out.println("It could easily be changed to match the interface (will be discussed in chapt 16.");
	}

	public static void deletingNodes() {
		System.out.println("Generally you use an iterator to add and delete nodes.");
		System.out.println("");
	}
}
