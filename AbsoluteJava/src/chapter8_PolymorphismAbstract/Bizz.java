package chapter8_PolymorphismAbstract;

public class Bizz {

	public static void main(String[] args) {
		for (int i = 1; i < 101; i++)
			if (i % 3 == 0 && i % 5 == 0)
				System.out.println("FizzBuzz " + i);
			else if (i % 3 == 0) {
				System.out.println("Fizz " + i);
			} else if (i % 5 == 0)
				System.out.println("Buzz " + i);
			else
				System.out.println(i);

	}
}
