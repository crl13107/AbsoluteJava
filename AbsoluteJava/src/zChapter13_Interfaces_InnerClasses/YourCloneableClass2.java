package zChapter13_Interfaces_InnerClasses;


public class YourCloneableClass2 implements Cloneable {

	private YourCloneableClass someVariable;

	public Object clone() {
		try {
			YourCloneableClass2 copy = (YourCloneableClass2)super.clone();
			copy.someVariable = (YourCloneableClass)someVariable.clone(); //creates safe copy of instance variable
			return copy;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

}
