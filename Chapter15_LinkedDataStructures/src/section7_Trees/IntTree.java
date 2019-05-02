package section7_Trees;

public class IntTree {

	private static class IntTreeNode {
		private int data;
		private IntTreeNode leftLink;
		private IntTreeNode rightLink;

		public IntTreeNode(int newData, IntTreeNode newLeftLink, IntTreeNode newRightLink) {
			data = newData;
			leftLink = newLeftLink;
			rightLink = newRightLink;
		}
	} // end of inner class

	private IntTreeNode root;

	public IntTree() {
		root = null;
	}

	public void add(int item) {
		root = insertInSubtree(item, root);
	}

	public boolean contains(int item) {
		return isInSubtree(item, root);
	}

	public void showElements() {
		showElementsInSubTree(root);
	}

	public static IntTreeNode insertInSubtree(int item, IntTreeNode subTreeRoot) {
		if (subTreeRoot == null)
			return new IntTreeNode(item, null, null);
		else if (item < subTreeRoot.data) {
			subTreeRoot.leftLink = insertInSubtree(item, subTreeRoot.leftLink);
			return subTreeRoot;
		} else {
			subTreeRoot.rightLink = insertInSubtree(item, subTreeRoot.rightLink);
			return subTreeRoot;
		}
	}

	public static boolean isInSubtree(int item, IntTreeNode subTreeRoot) {
		if (subTreeRoot == null)
			return false;
		else if (subTreeRoot.data == item)
			return true;
		else if (item < subTreeRoot.data)
			return isInSubtree(item, subTreeRoot.leftLink);
		else
			return isInSubtree(item, subTreeRoot.rightLink);
	}
	
	public static void showElementsInSubTree(IntTreeNode subTreeRoot) {
		//uses inorder
		if (subTreeRoot != null) {
			showElementsInSubTree(subTreeRoot.leftLink);
			System.out.println(subTreeRoot.data);
			showElementsInSubTree(subTreeRoot.rightLink);
		}
	}
}
