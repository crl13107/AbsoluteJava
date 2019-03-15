package zChapter13_Interfaces_InnerClasses;

public class GeneralizedSelectionSort {

	// sorts partially filled arrays of objects that implement the comparable
	// interface

	public static void sort(@SuppressWarnings("rawtypes") Comparable[] arr, int numberUsed) {
		int index, indexOfNextSmallest;
		for (index = 0; index < numberUsed - 1; index++) {
			indexOfNextSmallest = indexOfNextSmallest(index, arr, numberUsed);
			interchange(index, indexOfNextSmallest, arr);
		}
	}

	@SuppressWarnings("unchecked")
	private static int indexOfNextSmallest(int startIndex, @SuppressWarnings("rawtypes") Comparable[] arr,
			int numberUsed) {
		@SuppressWarnings("rawtypes")
		Comparable min = arr[startIndex];
		int indexOfMin = startIndex;
		int index;
		for (index = startIndex + 1; index < numberUsed; index++)
			if (arr[index].compareTo(min) < 0) {
				min = arr[index];
				indexOfMin = index;
			}
		return indexOfMin;
	}

	private static void interchange(int i, int j, @SuppressWarnings("rawtypes") Comparable[] arr) {
		@SuppressWarnings("rawtypes")
		Comparable temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}
}
