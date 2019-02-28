package chapter1_IntoToJava;

public class Chapter1 {

	public static void main(String[] args) {
		// start page 37
		String h = " Hello World ";
		String h2 = " Hello world ";
		String f = " Hello World ";

		System.out.println(h.trim() + " trim example");
		System.out.println(h2.equalsIgnoreCase(h) + " Shows ignore case equal");
		System.out.println(h == f);
		System.out.println(h.equals(f));

		// substring, lastindex of, start
		// indexof
		System.out.println("compare to and compretoignore case returns negative 0 and positive for abc order");
		System.out.println("\\ is called an escape sequence");
		System.out.println("\n Strings are immutable in Java\n");
		System.out.println("java uses unicode");
		System.out.println(h.lastIndexOf("o"));
		// Start 1.4
		System.out.println(
				"Public static final makes it so a value can never be changed and must be decalred outside of main program");
		System.out.println();
		
		
	}

}