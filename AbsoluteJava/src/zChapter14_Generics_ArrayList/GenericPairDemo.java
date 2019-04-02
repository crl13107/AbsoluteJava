package zChapter14_Generics_ArrayList;

import java.util.Scanner;

public class GenericPairDemo {

	public static void main(String[] args) {
		Pair<String> secretPair = new Pair<String>("Happy", "Day");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter two words:");
		String word1 = keyboard.next();
		String word2 = keyboard.next();

		Pair<String> inputPair = new Pair<String>(word1,word2);
		if (inputPair.equals(secretPair)) {
			System.out.println("You guessed the secret words in correct order");
		}
		else {
			System.out.println("You gussed wrong");
			System.out.println("Your guess: \n" + inputPair);
			System.out.println("Secret words: \n" + secretPair);
		}
		keyboard.close();
	}
}
