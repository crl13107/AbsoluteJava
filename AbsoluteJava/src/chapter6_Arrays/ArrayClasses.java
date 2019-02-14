package chapter6_Arrays;

public class ArrayClasses {

	public static void IntroductionToArrays() {
		System.out
				.println("Array = a data structure used to process a collection of data that is all of the same type");
		arrayTest(1, 2, 3, 4, 5);
		System.out.println("Subscripted variables = elements. Index = subscript. Length = size.");
		arraysAsAnObject();
	}

	private static void arraysAsAnObject() {
		System.out.println("Arrays are an object with only 1 instance variable, length.");
		System.out.println("Run time errors usually happen happen during the first or last iteration.");
		int[] scores = { 1, 2, 3, 4, 5 };
		System.out.print("Another way to initalize a variable: ");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println("\nYou can't set a string equal to a char variables");
		System.out.println("String S != char a.");
	}

	public static void arrayTest(int a, int b, int c, int d, int e) {
		int[] score = new int[5];

		// another way to declare
		@SuppressWarnings("unused")
		int[] scores;
		scores = new int[5];

		score[0] = a;
		score[1] = b;
		score[2] = c;
		score[3] = d;
		score[4] = e;
		System.out.print("Scores: ");
		for (int i = 0; i < score.length; i++) {
			System.out.print("Score " + (i + 1) + ": " + score[i] + " ");
		}
		int max = 0;

		for (int i = 0; i < score.length; i++) {
			if (score[i] > max)
				max = score[i];
		}
		System.out.println("Highest score = " + max);

	}

	public static void arrayReferences() {
		System.out.println("Arrays just hold refrences to points in memory. This is why they are considered classes.");
		System.out.println("If you set a Array equal to another array, you make them have the same reference.");
		System.out.println("Since == doesn't work on refrences, you must make a eqaulArray method to compare arrays");
		equalArray();
		System.out.println("This also means that methods can change their contents like other objects.");
		System.out.println("Main: args can be change for another other variable that is an array String.");
	}

	private static void equalArray() {
		int[] i = new int[5];
		int[] b = new int[5];
		System.out.println(b == i);
	}

	public static void forEachLoop() {
		System.out.println(
				"For each loop are useful for when you want to do math to figure out something like the total.");

		double[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int total = 0;
		for (double element : a)
			total += element;
		System.out.println(total);
	}

	public static void overLoading() {
		System.out.println("Varargs is a short name for variable arguments.");
		System.out.println("... is called ellipsis in java code. This is part of syntax and not an abbreviation.");
		max(3, 5);
		System.out.println("this lets you return any numner of a variable type into the method, including 0 varibles.");
		String[] stringOne = { "hi ", "losers." };
		String[] stringTwo = { "Who", "Dis", "BE???" };
		stringers(stringOne, stringTwo);
	}

	private static void stringers(String[]... arg) {
		System.out.println("Making a sentence with a string array!");
	}

	private static int max(int... arg) {
		if (arg.length == 0) {
			System.out.println("Fatal error, 0 arguments");
			System.exit(0);
		}
		int largest = arg[0];
		for (int i = 1; i < arg.length; i++)
			if (arg[i] > largest)
				largest = arg[i];
		return largest;

	}

	public static void sortArrays() {
		double[] a = { 3.0, 0.0, 1.0, 4.0, 5.0, 45.0, 8.0, 3.0, 10.0 };
		int numberUsed = 9;
		sort(a, numberUsed);
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}

	}

	private static void sort(double[] a, int numberUsed) {

		int index, indexofNextSmallest;

		for (index = 0; index < numberUsed - 1; index++) {
			indexofNextSmallest = indexofNextSmallest(index, a, numberUsed);
			interchange(index, indexofNextSmallest, a);
		}

	}

	private static void interchange(int i, int j, double[] a) {
		double temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;

	}

	private static int indexofNextSmallest(int startIndex, double[] a, int numberUsed) {
		double min = a[startIndex];
		int indexOfMin = startIndex;
		int index;
		for (index = startIndex + 1; index < numberUsed; index++)
			if (a[index] < min) {
				min = a[index];
				indexOfMin = index;
			}
		return indexOfMin;

	}

}
