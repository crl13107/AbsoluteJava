package zChapter14_Generics_ArrayList;

public class SampleGenericMethods<T> {
	private T data;
	
	public SampleGenericMethods(T forData) {
		data = forData;
	}

	
	public <ViewerType> void showTo(ViewerType viewer) {
		System.out.println("Hello " + viewer);
		System.out.println("Data is " + data);
	};
	
	public static void main(String[] args) {
		SampleGenericMethods<Integer> object = new SampleGenericMethods<Integer>(42);
		object.<String>showTo("Friend");
	}
}
