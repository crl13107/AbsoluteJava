package section6_Sets;


public class Set<T> {

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

	
	} // end of node inner class

	private Node<T> head;

	public Set() {
		head = null;
	}

	public boolean add(T newItem) {
		if (!contains(newItem)) {
			head = new Node<T>(newItem, head);
			return true;
		}
		return false;
	}
	

	public boolean contains(T item) {
		Node<T> position = head;
		T itemAtPosition;
		while (position != null) {
			itemAtPosition = position.data;
			if (itemAtPosition.equals(item))
				return true;
			position = position.link;
		}
		return false; // target not found
	}

	public void output() {
		@SuppressWarnings("rawtypes")
		Node position = head;
		while (position != null) {
			System.out.print(position.data.toString() + " ");
			position = position.link;
		}
		System.out.println();
	}

	public Set<T> union(Set<T> otherSet) {
		Set<T> unionSet = new Set<T>();
		Node<T> position = head;
		while (position != null) {
			unionSet.add(position.data);
			position = position.link;
		}
		return unionSet;
	}

	public Set<T> intersection(Set<T> otherSet){
		Set<T> interSet = new Set<T>();
		Node<T> position = head;
		while (position != null) {
			if (otherSet.contains(position.data))
				interSet.add(position.data);
			position = position.link;
		}
		return interSet;
	}


	public void clear() {
		// clears entire list, all references from head removed by garbage collector
		head = null;
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

	public boolean isEmpty() {
		return (head == null);
	}

}
