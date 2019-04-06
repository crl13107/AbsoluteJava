package section1_JavaLinkedLists;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList1 list = new LinkedList1();

		list.addToStart("apple", 1);
		list.addToStart("Bannanas", 2);
		list.addToStart("Cantaloupe", 3);
		System.out.println("List has " + list.size() + " nodes.");

		list.outputList();
		if (list.contains("Cantaloupe"))
			System.out.println("cantaloupe is on List");
		else
			System.out.println("Cantalope not on list");

		list.deleteHeadNode();

		if (list.contains("Cantaloupe"))
			System.out.println("cantaloupe is on List");
		else
			System.out.println("Cantalope not on list");

		list.deleteHeadNode();
		list.deleteHeadNode();
		list.deleteHeadNode();
		// while (list.deleteHeadNode())
		// ;
		System.out.println("Start of list: ");
		list.outputList();
		System.out.println("End of list!");
	}
}
