package section3_Iterators;

import java.util.NoSuchElementException;

public class LinkedList2 {
	private class Node {
		private String item;
		private Node link;

		public Node(String newItem, Node linkValue) {
			item = newItem;
			link = linkValue;
		}

		@SuppressWarnings("unused")
		public Node() {
			item = null;
			link = null;
		}
	}

	public class List2Iterator {
		private Node position;
		private Node previous;

		public List2Iterator() {
			position = head;
			previous = null;
		}

		public void restart() {
			position = head;
			//head = null; why does the book have this here? 
			//after a restart, you don't set to null
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			String toReturn = position.item;
			previous = position;
			position = position.link;
			return toReturn;
		}

		public boolean hasNext() {
			return (position != null);
		}

		public String peek() {
			if (!hasNext())
				throw new IllegalStateException();
			return position.item;
		}

		public void addHere(String newData) {
			if (position == null && previous != null)
				previous.link = new Node(newData, null);
			else if (position == null || previous == null)
				this.addtoStart(newData);
			else {
				Node temp = new Node(newData, position);
				previous.link = temp;
				previous = temp;
			}
		}

		public void changeHere(String newData) {
			if (position == null)
				throw new IllegalStateException();
			else
				position.item = newData;
		}

		public void delete() {
			if (position == null) {
				throw new IllegalStateException();
			} else if (previous == null) {
				head = head.link;
				position = head;
			} else {
				previous.link = position.link;
				position = position.link;
			}
		}

		public void addtoStart(String itemName) {
			head = new Node(itemName, head);
		}
	}

	private Node head;

	// below from LinkedList2 in section2

	public void addtoStart(String itemName) {
		head = new Node(itemName, head);
	}

	public List2Iterator iterator() {
		return new List2Iterator();

	}

}
