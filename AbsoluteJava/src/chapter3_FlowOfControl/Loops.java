package chapter3_FlowOfControl;

public class Loops {

	public static void main(String[] args) {

		System.out.println("each run through of a loop is called an interation");
		System.out.println("While loop checks, then runs where a do while runes, then checks");
		System.out.println("Semi human/machine code is referred to as pseduocode");
		System.out.print("Sentinal value is a value that will never be reached.");
		System.out.println(" This does not have to be negative, but it is used as a marker for when the loop ends");
		for (int i = 0; i > 0; i++) {
			System.out.println("heyyyy");
		}

		System.out.println("\nThe last type of loop in Java is the for loop. for (int i = 0; i > 0; i++)");
		System.out.println(
				"The first initalizes the varible, the second checks if it runs the body, the third runs the body and updates the variable");
		System.out.println("You can also use commas to increase stuff");
		System.out.println("for (term =1, sum=0; ....");
		System.out.println("; sum = sum+term, term++");
		System.out.println("If you put a semicolon after the for loop you will create an etmpy/null statement");
		System.out.println("nested loops");

		//148 break and continue staements
		System.out.println("Break ends the loop. Continue ends the current iteration of the loop.");
		System.out.println("Nested loop breaks will only break innermost loop, you can use break VariableName to "
				+ "end the entire nest of loops though.");
		System.out.println("System.exit(0) will break the program and end it immediately");
	}

}
