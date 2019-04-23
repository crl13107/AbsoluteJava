package section3_Iterators;

public class IteratorDemo {

	public static void main(String[] args) {
		LinkedList2 list = new LinkedList2();
		LinkedList2.List2Iterator i = list.iterator();
		list.addtoStart("Shoes");
		list.addtoStart("orange juice");
		list.addtoStart("Coat");

		System.out.println("List contains: ");
		i.restart();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		i.restart();
		// crashes during next
		i.next();

		System.out.println("Will delete the node for " + i.peek());
		i.delete();

		System.out.println();

		i.restart();
		i.next();
		System.out.println("Will add one node before " + i.peek());
		i.addHere("Socks");
		while (i.hasNext())
			System.out.println(i.next());
		System.out.println();
		System.out.println("Changing all items to credit card.");
		i.restart();
		while (i.hasNext()) {
			i.changeHere("Credit card");
			i.next();
		}
		System.out.println();
		System.out.println("list now contains:");
		i.restart();
		while (i.hasNext())
			System.out.println(i.next());
		System.out.println();
	}
}
