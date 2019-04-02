package zChapter12_UML_Patterns;

public class MergeSort {

	public static void sort(double[] arr, int begin, int end) {
		if ((end - begin) >= 1) {
			int splitPoint = split(arr, begin, end);
			sort(arr, begin, splitPoint);
			sort(arr, splitPoint + 1, end);
			join(arr, begin, splitPoint, end);
		}
	}

	private static int split(double[] arr, int begin, int end) {
		return ((begin + end) / 2);
	}

	private static void join(double[] arr, int begin, int splitPoint, int end) {
		double[] temp;
		int intervalSize = (end - begin + 1);
		temp = new double[intervalSize];
		int nextLeft = begin;
		int nextRight = splitPoint + 1;
		int i = 0;

		while ((nextLeft <= splitPoint) && nextRight <= end) {
			if (arr[nextLeft] < arr[nextRight]) {
				temp[i] = arr[nextLeft];
				i++;
				nextLeft++;
			}
			else {
				temp[i] = arr[nextRight];
				i++;
				nextRight++;
			}
		}
		while (nextLeft <= splitPoint) {
			temp[i] = arr[nextLeft];
			i++;
			nextLeft++;
		}
		while (nextRight <= end) {
			temp[i] = arr[nextRight];
			i++;
			nextRight++;
		}
		for (i = 0; i< intervalSize; i++)
			arr[begin+i] = temp[i];
	}
}
