package zChapter14_Generics_ArrayList;

import java.util.Scanner;

public class TwoTypePairDemo {

	public static void main(String[] args) {
		TwoTypePair<String, Integer> rating = new TwoTypePair<String, Integer>("The car guys", 8);
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Our current rating for " + rating.getFirst()+ " is " + rating.getSecond());
		
		System.out.println("How would you like to rate them?");
		int score = keyboard.nextInt();
		rating.setSecond(score);
		
		System.out.println("Our new rating for " + rating.getFirst()+" is " + rating.getSecond());

		keyboard.close();
	}
}
