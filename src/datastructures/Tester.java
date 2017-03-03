package datastructures;
public class Tester {

	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(10);
		bst.insert(15);
		bst.insert(8);
		bst.insert(25);
		bst.insert(3);

		System.out.println(bst.search(25));
		System.out.println(bst.search(99));

	}

}
