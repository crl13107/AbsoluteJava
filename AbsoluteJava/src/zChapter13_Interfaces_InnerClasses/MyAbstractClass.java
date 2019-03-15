package zChapter13_Interfaces_InnerClasses;

import chapter8_PolymorphismAbstract.HourlyEmployee;

public abstract class MyAbstractClass implements Ordered {
	private int number;
	@SuppressWarnings("unused")
	private char grade;

	public boolean precedes(Object other) {
		if (other == null)
			return false;
		else if (!(other instanceof HourlyEmployee))
			return false;
		else {
			MyAbstractClass otherOfMyAbstractClass = (MyAbstractClass) other;
			return (this.number < otherOfMyAbstractClass.number);
		}
	}

	public abstract boolean follows(Object other);
}
