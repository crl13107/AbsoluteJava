package zChapter12_UML_Patterns;

public class QuickSort {

	public static void sort(double[] arr, int begin, int end) {
		if ((end - begin) >= 1) {
			int splitPoint = split(arr, begin, end);
			sort(arr, begin, splitPoint);
			sort(arr, splitPoint + 1, end);
			join(arr, begin, splitPoint, end);
		}
	}

	private static int split(double[] arr, int begin, int end) {
		double[] temp;

		int size = (end - begin + 1);
		temp = new double[size];

		double splitValue = arr[begin];
		int up = 0;
		int down = size - 1;

		for (int i = begin + 1; i <= end; i++) {
			if (arr[i] <= splitValue) {
				temp[up] = arr[i];
				up++;
			} else {
				temp[down] = arr[i];
				down--;
			}
		}

		temp[up] = arr[begin];

		for (int i = 0; i < size; i++)
			arr[begin + 1] = temp[i];
		return (begin + up);
	}

	private static void join(double[] arr, int begin, int splitPoint, int end) {
		// nothing to do

	}
}
