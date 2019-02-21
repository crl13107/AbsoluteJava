package chapter8_PolymorphismAbstract;

public class CopyingDemo {

	public static void main(String[] args) {
		Sale[] a = new Sale[2];
		a[0] = new Sale("atomic coffeee mug", 130.00);
		a[1] = new DiscountSale("invisible paint", 5.00, 10);
		Sale[] b = badCopy(a);

		System.out.println("With copy constructors");
		printer(a, b);
		System.out.println("With clone");
		b = goodCopy(a);
		printer(a, b);

		System.out.println(
				"Copy constructor loses discount, but clone constructor keeps all the object's information due to late binding and covariant casting.");

	}

	private static Sale[] goodCopy(Sale[] a) {
		Sale[] b = new Sale[a.length];
		for (int i = 0; i < a.length; i++)
			b[i] = a[i].clone();
		return b;
	}

	private static Sale[] badCopy(Sale[] a) {
		Sale[] b = new Sale[a.length];
		for (int i = 0; i < a.length; i++)
			b[i] = new Sale(a[i]); // problem here
		return b;
	}

	private static void printer(Sale[] a, Sale[] b) {
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
			System.out.println("b[" + i + "] = " + b[i]);
			System.out.println();
		}
	}
}
