package chapter3;

public class BranchingMechanism {

	public static void main(String[] args) {
		int i = 2;
		int i2 = 1;

		System.out.println(
				"Java is the same as C with if/else, it has if/else, if, ifelse, else and switch statments.\n");
		if (i == 1)
			System.out.println("1");
		else if (i == 2)
			System.out.println("2");
		else if (i == 3)
			System.out.println("3");
		else {
			System.out.println("other");
		}

		System.out.println("\nRemember breaks after each switch or it will keep running until end!\n");
		switch (i) {
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
		case 3:
			System.out.println("3");
		default:
			System.out.println("Other");
			break;
		}

		System.out.println(
				"\nConditional Operator: a statment that is true or flase, if true first number is used; if flase 2nd number is used.");
		System.out.println((i > i2 ? i : i2));
	}
}
