package section4_VariationsOnLinkedList;

public class DoubleLinkedListDemo {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		DoublyLinkedList.DoublyLinkedIterator i = list.iterator();
		
		list.addToStart("Shoes");
		list.addToStart("Orange juice");
		list.addToStart("coat");
		System.out.println("List contains");
		i.restart();
		
		while (i.hasNext())
			System.out.println(i.next());
		System.out.println();
		
		i.restart();
		i.next();
		i.next();
		System.out.println("Delete " + i.peek());
		i.delete();
		
		System.out.println("List no contains:");
		i.restart();
		
		while (i.hasNext())
			System.out.println(i.next());
		System.out.println();
		
		i.restart();
		i.next();
		System.out.println("Inserting socks before " + i.peek());
		i.insertHere("socks");
		
		i.restart();
		System.out.println("List now coantains");
		
		while (i.hasNext())
			System.out.println(i.next());
		System.out.println();
	}
}
