package section1_JavaLinkedLists;

public class Methods {
	public static void simpleLinkedList() {
		System.out.println(
				"A linked list is a datastructure consisiting of a signle chain of neads, each connected by a link");
		System.out.println("Linked is a bject that holds location of next node.");
		System.out.println("This allows you to traverse through the nodes using links.");
		System.out.println("Linked link finds last node by setting last link = null.");
		System.out.println("Java garabge collector will get rid on unused nodes by itself.");
	}
	
	public static void linkedListNotes() {
		System.out.println("Setting head to null erases the entire linked list.");
		System.out.println("You have to be sure to update position after each iteration");
	}
	

	public static void nodeVgenerics() {
		System.out.println("Node and Node<T> are different, but the code will sometimes run fine");
		System.out.println("Linked lists often have 2 equal methods "
				+ "one for order mattering and one for when order doesn't matter.");
		System.out.println("Both are correct and useful, but usually order doesn't matter is used.");
		
	}
	
	
}
