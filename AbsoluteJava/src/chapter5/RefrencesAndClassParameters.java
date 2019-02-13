package chapter5;

import static java.lang.Character.*;

public class RefrencesAndClassParameters {

	public static void main(String[] args) {
		System.out.println("Vairbles keep track of where an adress where the object is stored.");
		System.out.println(
				"So if you set an object = to another object, you change there refrence points to the same memory location");
		System.out.println("All parameters in java are call-by-value parameters.");
		System.out.println(
				"Methods can't change the value of primitives, but can change the values of instance variables and classes.");
		System.out.println("Call by reference is simalir, but java does not use this.");
		System.out.println("Null is a special constant which holds a reference to no spot in memory.");

		new StatCallingClasses();

		System.out.println(
				"Annonymous objects are when you make an object, but don't give it a refrence to save the object information");
		// page 300 for string trokenizer example
		String sentence = "a";
		char firstCharacter = 'a';
		sentence = Character.toUpperCase(firstCharacter) + sentence.substring(1);

		sentence = toUpperCase(firstCharacter) + sentence.substring(1);
		
		System.out.println("Static imports allow you to call methods in the class without using *ClassName*.");
	}
}
