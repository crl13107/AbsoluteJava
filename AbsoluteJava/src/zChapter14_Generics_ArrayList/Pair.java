package zChapter14_Generics_ArrayList;

public class Pair<T> {

	private T first;
	private T second;

	public Pair() {
		first = null;
		second = null;
	}

	public Pair(T firstItem, T secondItem) {
		first = firstItem;
		second = secondItem;
	}

	public void setFirst(T newFirst) {
		first = newFirst;
	}

	public void setSecond(T newSecond) {
		second = newSecond;
	}

	public T getFirst() {
		return first;
	}

	public T getSecond() {
		return second;
	}

	public String toString() {
		return ("First: " + first.toString() + "\n" + "Second: " + second.toString());
	}

	public boolean equals(Object otherObject) {
		if (otherObject == null)
			return false;
		else if (getClass() != otherObject.getClass())
			return false;
		else {
			@SuppressWarnings("unchecked")
			Pair<T> otherPair = (Pair<T>) otherObject;
			return (first.equals(otherPair.first) && second.equals(otherPair.second));

		}

	}
}
