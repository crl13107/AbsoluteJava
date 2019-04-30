package section4_VariationsOnLinkedList;

public class Stack {

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
	}

	private Node head;

	public Stack() {
		head = null;
	}

	public void push(String itemName) {
		head = new Node(itemName, head);
	}

	public String pop() {
		if (head == null)
			throw new IllegalStateException();
		else {
			String returnItem = head.item;
			head = head.link;
			return returnItem;
		}
	}

	public boolean isEmpty() {
		return (head == null);
	}
}
