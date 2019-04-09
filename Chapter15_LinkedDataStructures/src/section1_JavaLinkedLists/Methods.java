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
	
	public static void pitFallsWithGenericLinkedList() {
		
	}
	
	
}
