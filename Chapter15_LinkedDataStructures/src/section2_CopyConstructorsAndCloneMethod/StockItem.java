package section2_CopyConstructorsAndCloneMethod;

public class StockItem implements PubliclyCloneable {

	private String name;
	private int number;

	public StockItem() {
		name = null;
		number = 0;
	}

	public StockItem(String nameData, int numberData) {
		name = nameData;
		number = numberData;
	}

	public void setNumber(int newNumber) {
		number = newNumber;
	}

	public void setName(String newName) {
		name = newName;
	}

	public String toString() {
		return (name + " " + number);
	}

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// shouldn't happen
			return null; // to keep complier happy
		}
	}

	public boolean equals(Object otherObject) {
		if (otherObject == null)
			return false;
		else if (getClass() != otherObject.getClass())
			return false;
		else {
			StockItem otherItem = (StockItem) otherObject;
			return (name.equalsIgnoreCase(otherItem.name) && number == otherItem.number);
		}
	}
}
