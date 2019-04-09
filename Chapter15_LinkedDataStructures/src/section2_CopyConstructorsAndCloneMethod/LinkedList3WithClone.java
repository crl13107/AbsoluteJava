package section2_CopyConstructorsAndCloneMethod;

public class LinkedList3WithClone<T> implements Cloneable {

	@SuppressWarnings("hiding")
	private class Node<T> {
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

	public LinkedList3WithClone() {
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
			LinkedList3WithClone<T> otherList = (LinkedList3WithClone<T>) otherObject;
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

	public LinkedList3WithClone(LinkedList3WithClone<T> otherList) {
		if (otherList == null)
			throw new NullPointerException();
		if (otherList.head == null)
			head = null;
		else
			head = copyOf(otherList.head);
	}

	@SuppressWarnings("unchecked")
	public LinkedList3WithClone<T> clone() {
		try {
			LinkedList3WithClone<T> copy = (LinkedList3WithClone<T>) super.clone();
			if (head == null)
				copy.head = null;
			else
				copy.head = copyOf(head);
			return copy;
		} catch (CloneNotSupportedException e) {
			// This should not happen
			return null; // to keep the compiler happy
		}
	}

	private Node<T> copyOf(Node<T> otherHead) {
		Node<T> position = otherHead; // moves down other's list
		Node<T> newHead; // will point to head of the copy list
		Node<T> end = null; // positioned at end of new growing list.

		// create first node
		newHead = new Node<T>(position.data, null);
		end = newHead;
		position = position.link;

		while (position != null) {
			end.link = new Node<T>(position.data, null);
			end = end.link;
			position = position.link;
		}
		return newHead;
	}

}
