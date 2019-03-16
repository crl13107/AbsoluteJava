package zChapter14_Generics_ArrayList;

import java.util.Scanner;

public class GenericPairDemo2 {

	public static void main(String[] args) {
		Pair<Integer> secretPair = new Pair<Integer>(42, 42);
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Two numbers");
		int n1 = keyboard.nextInt();
		int n2 = keyboard.nextInt();
		Pair<Integer> inputPair = new Pair<Integer>(n1, n2);
		if (inputPair.equals(secretPair))
			System.out.println("You guessed the secret numbers in correct order");
		else {
			System.out.println("You gussed wrong");
			System.out.println("Your guess: \n" + inputPair);
			System.out.println("Secret words: \n" + secretPair);
		}
		keyboard.close();

	}
}
