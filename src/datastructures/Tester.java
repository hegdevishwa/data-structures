package datastructures;

public class Tester {

	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(7);
		bst.insert(4);
		bst.insert(9);

		bst.insert(1);
		bst.insert(6);

		/*bst.insert(15);
		bst.insert(18);*/

		System.out.println("IS BST?" + bst.isBST());

	}

}
