package chapter1;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("hello world"); // invoking of calling the method
		// java breaks down right into the byte code, so you don't have to recompile for
		// every computer, making java very good for Internet based applications,
		// although people consider it a general use language

		System.out.println("class loader- compiles classes seperately then links them");
		System.out.println("this is called linkers in other languages\n");

		System.out.println("look up sdk and jdk defintion and meaning \n");

		// questions are all vocab
		// start 1.2

		System.out.println(
				"indentifier - variable, must start with digit, can contain letters, digist, underscore, and $ ($ should be used for special occasions only!!");
		System.out.println(
				"variables lowercase with caps to start new words; classes start with upper class. convention, no required!");
		// page 16 has boolean,char,primitive,etc and what numbers they can go to
		// page 19 for shorter operations. I.E. amount *= count + 1 / amount = amount *
		// (count1 + count2)
		System.out.println("Java true/false is not 0/1 like most lagnuges");

		// starts 1.3

		System.out.println("\ndivision gets rid of evertyhing after decimals with integers. 5/2 = 2, not 2.5 or 3");
		System.out.println("14 divided by 3 is " + (14 / 3));
		System.out.println("With a remained of " + (14 % 3));

		int m = 2;
		int n = 11;
		double ans = n / (double) m; // double ans = n / m comes out to 5.0 instead of 5.5
		System.out.println(
				"variable always prints out it's type. the varibale equations will take form of greatest precendence char type, then cast to awnser");
		System.out.println("\n" + ans);
		System.out.println("java does not type cast for you, this would be called type coercion if it did\n");
		// ++n vs n++, pretty obvious, but on page 31-32
		System.out.println("No primitive type of string in java, it but strings are a class in the library");

		// start with page 37
		
	}
}
