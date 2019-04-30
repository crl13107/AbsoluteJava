package section4_VariationsOnLinkedList;

public class DoublyLinkedList {

	@SuppressWarnings("unused")
	private class TwoWayNode {
		private String item;
		private TwoWayNode previous;
		private TwoWayNode next;

		public TwoWayNode() {
			item = null;
			next = null;
			previous = null;
		}

		public TwoWayNode(String newItem, TwoWayNode previousNode, TwoWayNode nextNode) {
			item = newItem;
			previous = previousNode;
			next = nextNode;
		}
	} // end of inner class

	public class DoublyLinkedIterator {
		// do not need a previous node when using a doubly linked list

		private TwoWayNode position = null;

		public DoublyLinkedIterator() {
			position = head;
		}

		public void restart() {
			position = head;
		}

		public String next() {
			if (!hasNext())
				throw new IllegalStateException();
			String toReturn = position.item;
			position = position.next;
			return toReturn;
		}

		public void insertHere(String newData) {
			if (position == null && head != null) {
				TwoWayNode temp = head;
				while (temp.next != null)
					temp = temp.next;
				temp.next = new TwoWayNode(newData, temp, null);
			} else if (head == null || position.previous == null)
				// at head of list
				DoublyLinkedList.this.addToStart(newData);
			else {
				TwoWayNode temp = new TwoWayNode(newData, position.previous, position);
				position.previous.next = temp;
				position.previous = temp;
			}
		}

		public void delete() {
			if (position == null)
				throw new IllegalStateException();
			else if (position.previous == null) {
				head = head.next;
				position = head;
			} else if (position.next == null) {
				position.previous.next = null;
				position = null;
			} else {
				position.previous.next = position.next;
				position.next.previous = position.previous;
				position = position.next;
			}
		}

		public boolean hasNext() {
			return (position != null);
		}

		public String peek() {
			if (!hasNext())
				throw new IllegalStateException();
			return position.item;
		}
	} // DoubleLinkedIterator

	private TwoWayNode head;

	public DoublyLinkedIterator iterator() {
		return new DoublyLinkedIterator();
	}

	public DoublyLinkedList() {
		head = null;
	}

	public void addToStart(String itemName) {
		TwoWayNode newHead = new TwoWayNode(itemName, null, head);
		if (head != null) {
			head.previous = newHead;
		}
		head = newHead;
	}

}
