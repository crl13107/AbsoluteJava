package zChapter14_Generics_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GolfScores {

	public static void main(String[] args) {
		ArrayList<Double> score = new ArrayList<>();

		System.out.println("This program reads gold scores and shows");
		System.out.println("Hoe much each differs from the average.");

		System.out.println("Enter gold scores:");
		fillArrayList(score);
		showDifference(score);
	}

	public static void fillArrayList(ArrayList<Double> arr) {
		System.out.println("Enter a list of nonegative numbers.");
		System.out.println("Mark the end of the list ith a negative number.");
		Scanner keyboard = new Scanner(System.in);

		double next;
		next = keyboard.nextDouble();
		while (next >= 0) {
			arr.add(next);
			next = keyboard.nextDouble();
		}
		keyboard.close();
	}

	public static double computeAverage(ArrayList<Double> arr) {
		double total = 0;
		for (Double element : arr)
			total = total + element;
		int numberOfScores = arr.size();
		if (numberOfScores > 0) {
			return (total / numberOfScores);
		} else {
			System.out.println("Error: Trying to average 0 numbers.");
			System.out.println("compute Average returns 0.");
			return 0;
		}
	}

	public static void showDifference(ArrayList<Double> arr) {
		double average = computeAverage(arr);
		System.out.println("Average of the " + arr.size() + " scores= " + average);
		System.out.println("The scores are ");
		for (double element : arr)
			System.out.println(element + " differs from average by " + (element - average));
	}
}
