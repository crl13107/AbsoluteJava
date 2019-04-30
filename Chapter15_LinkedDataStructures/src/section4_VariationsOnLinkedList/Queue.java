package section4_VariationsOnLinkedList;

public class Queue {

	private class Node {
		private String item;
		private Node link;

		@SuppressWarnings("unused")
		public Node() {
			item = null;
			link = null;
		}

		public Node(String newItem, Node linkValue) {
			item = newItem;
			link = linkValue;
		}
	} // end of inner class

	private Node front;
	private Node back;

	public Queue() {
		front = null;
		back = null;
	}

	public void addToBack(String itemName) {
		Node newEntry = new Node(itemName, null);
		if (front == null) {
			back = newEntry;
			front = back;
		} else {
			back.link = newEntry;
			back = back.link;
		}
	}

	public boolean isEmpty() {
		return (front == null);
	}

	public void clear() {
		front = null;
		back = null;
	}

	// return the string in the front of the queue
	public String whoIsNext() {
		if (front == null)
			return null;
		else
			return front.item;
	}

	public boolean removeFront() {
		if (front != null) {
			front = front.link;
			return true;
		} else
			return false;
	}
}
