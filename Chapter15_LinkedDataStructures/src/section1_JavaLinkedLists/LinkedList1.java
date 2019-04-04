package section1_JavaLinkedLists;

public class LinkedList1 {
	private Node1 head;

	public LinkedList1() {
		head = null;
	}

	/*
	 * adds a node at the start of the list with the specified data. The added node
	 * will be the first node in the list
	 */

	public void addToStart(String itemName, int itemCount) {
		head = new Node1(itemName, itemCount, head);
	}

	public boolean deleteHeadNode() {
		if (head != null) {
			head = head.getLink();
			return true;
		} else
			return false;
	}

	// returns number of nodes in list
	public int size() {
		int count = 0;
		Node1 position = head;
		while (position != null) {
			count++;
			position = position.getLink();
		}
		return count;
	}

	public boolean contains(String item) {
		return (find(item) != null);
	}

	private Node1 find(String target) {
		Node1 position = head;
		String itemAtPostion;
		while (position != null) {
			itemAtPostion = position.getItem();
			if (itemAtPostion.equals(target))
				return position;
		}
		return null;

	}

	public void outputList() {
		Node1 position = head;
		while (position != null) {
			System.out.println(position.getItem() + " " + position.getCount());
			position = position.getLink();
		}
	}
}