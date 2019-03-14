package zChapter11_Recursion;

public class RecursionMethods {

	public static void vertNumbers() {
		System.out.println("A method that calls itself is recursive.");
		writeVertical(1234);
		System.out.println("Base/stopping cases are where"
				+ " the method accomplishes its task without the use of any recursive calls.");
		System.out.println("Infinite recursion - where it runs until the pc runs out of resources.");
		System.out.println("A stack uses LIFO. These are used for recursive methods.");
		System.out.println("One piece of the info in a stack is called a stack frame/activation record.");
		System.out.println("Stack overflow is when a stack tries to grow beyond its limit");
		System.out.println("This is often caused by infinite recursion.");
	}

	public static void iteration() {
		System.out.println("Recursion is never required.");
		System.out.println("Some programming methods don't even allow recursion.");
		System.out.println("Iterative solutions are almost always more effective anyway.");
		System.out.println("Recursion can make your job easier and your code easier to understand.");
		System.out.println("In some occasions, the JVM will automatically convert your code to interative.");
		iterativeExample(1234);
	}

	public static void thinkingRecursively() {
		System.out.println("We need not be concerned with the content of the stack, just that it works and ends.");
		System.out.println("The main problem usually occurs when stopping case isn't correct.");

		int arr[] = { 1, 2, 3, 4, 5 };
		int key = 3;
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		// searches for the key, then prints the location it is at
		System.out.println("The key value " + key + " is at index: " + binarySearch(arr, arr[0], arr.length, key));
		System.out.println("The key value " + key + " is at index: " + search(arr, arr[0], arr.length, key));
		System.out.println("Tail recursion - has property that it does nothing after recusrive call "
				+ "except return method's value.");
		System.out.println("Most tail methods will be converted to iterative methods by the JVM.");
	}

	public static void findingAFile() {
		
	}

	public static int search(int[] arr, int lowEnd, int highEnd, int key) {
		int first = lowEnd;
		int last = highEnd;
		int mid;

		boolean found = false;
		int result = 0;

		while ((first <= last) && !(found)) {
			mid = (first + last) / 2;

			if (key == arr[mid]) {
				found = true;
				result = mid;
			} else if (key < arr[mid]) {
				last = mid - 1;
			} else if (key > arr[mid]) {
				first = mid + 1;
			}
		}
		if (first > last)
			result = 1;
		return result;
	}

	private static int binarySearch(int[] arr, int first, int last, int key) {

		int result = 0;
		if (first > last)
			result = -1;
		else {
			int mid = (first + last) / 2;

			if (key == arr[mid])
				result = mid;
			else if (key < arr[mid])
				result = binarySearch(arr, first, mid - 1, key);
			else if (key > arr[mid])
				result = binarySearch(arr, mid + 1, last, key);
		}
		return result;

	}

	public static void recursionThatReturnsAvalue() {
		for (int n = 0; n < 4; n++)
			System.out.println("3 to the power " + n + " is " + power(3, n));

	}

	private static int power(int x, int n) {
		if (n < 0) {
			System.out.println("illegal argument to power.");
			System.exit(0);
		}
		if (n > 0)
			return (power(x, n - 1) * x);
		else
			return (1);
	}

	private static void iterativeExample(int n) {
		int nsTens = 1;
		int leftEndPiece = n;
		while (leftEndPiece > 9) {
			leftEndPiece = leftEndPiece / 10;
			nsTens = nsTens * 10;
		}
		for (int powerOfTen = nsTens; powerOfTen > 0; powerOfTen = powerOfTen / 10) {
			System.out.println(n / powerOfTen);
			n = n % powerOfTen;
		}

	}

	private static void writeVertical(int n) {
		// if under 10, prints the numbers
		if (n < 10) {
			System.out.println(n);
		} else {
			// Otherwise you run the method again, then print 10
			// System.out.println(n % 10); Used to print other direction
			writeVertical(n / 10); // method resumes after this
			System.out.println(n % 10);
		}
	}
}
