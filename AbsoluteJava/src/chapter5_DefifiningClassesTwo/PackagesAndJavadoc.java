package chapter5_DefifiningClassesTwo;

public class PackagesAndJavadoc {

	public static void main(String[] args) {
		System.out.println("For javadoc to save your comment, you must use block comments /* \n * \n */");
		System.out.println(
				"The comment must also immediately precede a public class definition, a public method, or other public item.");
		System.out.println(
				"In C++ you defines 2 files, one that has implementation and 1 that tells the programmer all they need to know to use the class.");
		System.out.println(
				"Javadoc does this automatically, so you must use comments differently to accompolish the same result.");
		System.out.println(
				"Special infromation about parameters and so forth are preceded by the @ symbol and are cllaed @ tags.");
		System.out.println("@ tags have their own order and must be on seperate lines.");
		System.out.println(
				"Deprecated @ tag represents a method that is being phased out to allow for backward compatability.");
		System.out.println(
				"Javadoc has it's own set of commands (page 333), which explains how to properly export the classes and files to javadoc format.");

	}
}
