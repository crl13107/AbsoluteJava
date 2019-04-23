package section2_CopyConstructorsAndCloneMethod;

public class DeepDemo {
	public static void main(String[] args) {
		LinkedList<StockItem> originalList = new LinkedList<StockItem>();
		originalList.addToStart(new StockItem("red dress", 1));
		originalList.addToStart(new StockItem("black shoe", 2));
		
		LinkedList<StockItem> copyList = originalList.clone();
		if (originalList.equals(copyList))
			System.out.println("Ok, Lists are equal");
		System.out.println("Now we change copyList");
		StockItem dataEntry = copyList.findData(new StockItem("red dress", 1));
		dataEntry.setName("orange pants");
		
		System.out.println("OriginalList :");
		originalList.outPutList();
		
		System.out.println("copyList: ");
		copyList.outPutList();
		
		System.out.println("Only one list is changed");

	}
}
