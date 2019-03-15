package zChapter13_Interfaces_InnerClasses;

public class YourCloneableClass implements Cloneable {

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null; // shouldn't happen, here to keep compiler happy
		}
	}

}
