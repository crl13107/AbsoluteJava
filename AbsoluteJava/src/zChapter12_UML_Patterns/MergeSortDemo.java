package zChapter12_UML_Patterns;

public class MergeSortDemo {

	public static void main(String[] args) {
		double[] b = {7.7,5.5,11,3,16,4.4,20,14,13,42};
		int i;
		for (i = 0; i <b.length; i++) 
			System.out.println(b[i] + " ");
		System.out.println();
		
		MergeSort.sort(b, 0, b.length-1);
		System.out.println("Sorted array values: ");
		for (i = 0; i <b.length; i++) 
			System.out.println(b[i] + " ");
		System.out.println();
		
	}
}