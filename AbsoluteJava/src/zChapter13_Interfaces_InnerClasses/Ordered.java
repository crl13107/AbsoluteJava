package zChapter13_Interfaces_InnerClasses;

public interface Ordered {

	boolean precedes(Object other); //public by default
	
	//for objects of the class o1 and 02 01.follows(o2) == 02.precedes(o.1)
	
	public boolean foolows(Object other);
}
