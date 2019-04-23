package section2_CopyConstructorsAndCloneMethod;

public class LinkedList<T extends PubliclyCloneable> implements PubliclyCloneable {
	// must have object clone because of implement
	public Object clone() {
		return null;
	}

	private class Node<T> {

		private T data;
		private Node<T> link;

		public Node() {
			data = null;
			link = null;
		}

		public Node(T newData, Node<T> linkValue) {
			data = newData;
			link = linkValue;
		}
	}// end of inner class page 836
}