package section1_JavaLinkedLists;

public class GenericLinkedListDemo {

	public static void main(String[] args) {

		LinkedList3<Entry> list = new LinkedList3<>();

		Entry entry1 = new Entry("Apples", 1);
		Entry entry2 = new Entry("Bannanas", 2);
		Entry entry3 = new Entry("Cantaloupe", 3);

		list.addToStart(entry1);
		list.addToStart(entry2);
		list.addToStart(entry3);
		System.out.println("List has " + list.size() + " nodes");
		list.outPutList();
		System.out.println("End of list");
	}

}
