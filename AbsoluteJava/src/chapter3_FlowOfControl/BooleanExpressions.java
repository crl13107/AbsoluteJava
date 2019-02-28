package chapter3_FlowOfControl;

public class BooleanExpressions {

	// page 113 3.2
	public static void main(String[] args) {
		System.out
				.println("== checks refrence points, instead of checking if values are the same, so use eqauls method");
		String s1 = "hi";
		String s2 = "Hi";

		System.out.println("Compare to does alphebitical check, this can be changed to true false like below");
		System.out.println(s1.compareTo(s2) > 0); // also called lexicographic order
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println("\n|| is or, && is and. You can place ! for not in front of the boolean statement");

		System.out.println("page 131 for binding and precedence practice.");
		
		
		
	}
}
