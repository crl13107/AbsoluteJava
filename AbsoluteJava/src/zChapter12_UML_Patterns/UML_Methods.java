package zChapter12_UML_Patterns;

public class UML_Methods {

	public static void uml() {
		System.out.println("Unified modeling language was made in 1996 to help represent OOP.");
		System.out.println("Class diagram is the easiest to understand of the UML.");
		System.out.println("~ package, #protected,  - members of the objects");
		System.out.println("Class diagrams use squares to represent the main parts of classes.");
		System.out.println("It then uses more sqaures to show inheritance.");
	}

	public static void patterns() {
		System.out.println("Patterns are design outlines that apply across variety of software applications.");
		System.out.println("A container is a class whose objects hold multiple pieces of data.");
		System.out.println("An array is a type of container.");
		System.out.println("An Iterator is a construct that allows you to cycle through all items in a container.");
		System.out.println("Adaptor pattern fransforms one class into a different class without chagning the underlying"
				+ "class but merley by adding a new interface.");
	}

	public static void mvc() {
		System.out.println(
				"Model-view-controller pattern is a way of seperating the I/O task of an app from the rest of the app.");
		System.out.println("MVC is a version of divide and conquer, splitting 1 task into 3 smaller ones.");
		System.out.println("The model part of the pattern perfroms the heart of the application.");
		System.out.println("The view is the output part, it displays a picture of the model's state.");
		System.out.println("The controller is the input part, relays commands to the model.");
		
	}
	
	public static void sortingPatterns() {
		System.out.println("These sorting patterns only work for things that can be compared with >");
		System.out.println("You can make this doable with classes that implment the comparbale interface.");
		System.out.println("Mergesort worst and best case are very close.");
		System.out.println("Quicksort can have much worse cases, but generally is better than quick.");
		System.out.println("Patterns are not requirements, but they have become useful "
				+ "tools to standardize software design.");
	}
	
}
