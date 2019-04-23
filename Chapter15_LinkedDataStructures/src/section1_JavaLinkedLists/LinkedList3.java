package section1_JavaLinkedLists;

public class LinkedList3<T> {

	@SuppressWarnings("hiding")
		class Node<T> {
		private T data;
		private Node<T> link;

		@SuppressWarnings("unused")
		public Node() {
			data = null;
			link = null;
		}

		public Node(T newData, Node<T> linkValue) {
			data = newData;
			link = linkValue;
		}
	} // end of Node inner class

	private Node<T> head;

	public LinkedList3() {
		head = null;
	}

	public void addToStart(T itemdata) {
		head = new Node<T>(itemdata, head);
	}

	public boolean deleteHeadNode() {
		// deletes head and returns true if list still contains a node
		if (head != null) {
			head = head.link;
			return true;
		} else
			return false;
	}

	public int size() {
		int count = 0;
		Node<T> position = head;
		while (position != null) {
			count++;
			position = position.link;
		}
		return count;
	}

	public boolean contains(T item) {
		return find(item) != null;
	}

	private Node<T> find(T target) {
		Node<T> position = head;
		T itemAtPosition;
		while (position != null) {
			itemAtPosition = position.data;
			if (itemAtPosition.equals(target))
				return position;
			position = position.link;
		}
		return null; // target not found
	}

	public T findData(T target) {
		Node<T> result = find(target);
		if (result == null)
			return null;
		else
			return result.data;
	}

	public void outPutList() {
		Node<T> position = head;
		while (position != null) {
			System.out.println(position.data);
			position = position.link;
		}
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public void clear() {
		// clears entire list, all references from head removed by garbage collector
		head = null;
	}

	@SuppressWarnings("unchecked")
	public boolean equals(Object otherObject) {
		if (otherObject == null)
			return false;
		else if (getClass() != otherObject.getClass())
			return false;
		else {
			LinkedList3<T> otherList = (LinkedList3<T>) otherObject;
			if (size() != otherList.size())
				return false;
			Node<T> position = head;
			Node<T> otherPosition = otherList.head;
			while (position != null) {
				if (!(position.data.equals(otherPosition.data)))
					return false;
				position = position.link;
				otherPosition = otherPosition.link;
			}
			return true;
		}
	}
}
