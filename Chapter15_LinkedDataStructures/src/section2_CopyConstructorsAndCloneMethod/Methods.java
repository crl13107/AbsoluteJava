package section2_CopyConstructorsAndCloneMethod;

public class Methods {

	public static void introduction() {
		System.out.println("Some consider the clone method in java so bad they ignore it altogether.");
		System.out.println("This chapter will explain why java clone is made the way it is.");
		System.out.println("It will also touch on what makes a good and bad clone method.");
	}
	
	public static void simpleCopyAndClone() {
		System.out.println("When copying a linked list, you add the clones to the end up of list.");
		System.out.println("Clone is protected in java for security reasons. With class calling it.");
		System.out.println("Type casting objects you create then calling clone will result in an error.");
		System.out.println("This is because java only knows it is a descendent of the obj class.");
		System.out.println("One way around this it to place a bound on the type parameter.");
		System.out.println("PublicelyCloneable has 3 properties:");
		System.out.println("1) the class implements the cloneable interface");
		System.out.println("2) the class hada public clone method");
		System.out.println("3) clone method for the class makes a deep copy (offical way)");
		//step 3 not checked by the compiler
		System.out.println();
	}
}
