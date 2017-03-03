package datastructures;
public class BinarySearchTree {

	private Node root;

	public BinarySearchTree() {
		root = null;
	}

	private class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public void insert(int element) {
		root = addNode(element, root);
		System.out.println(root.data);
		if (root.left != null) {
			System.out.println(root.left.data);
		}

		if (root.right != null) {
			System.out.println(root.right.data);
		}

	}

	public boolean search(int element) {
		return searchNode(root, element);
	}

	private Node addNode(int element, Node root) {

		Node rootPtr = root;
		if (rootPtr == null) {
			rootPtr = new Node(element);
			System.out.println("root");
		} else if (rootPtr.data >= element) {
			System.out.println("left");
			rootPtr.left = addNode(element, rootPtr.left);
		} else {
			System.out.println("right");
			rootPtr.right = addNode(element, rootPtr.right);
		}
		return rootPtr;
	}

	private boolean searchNode(Node root, int element) {
		Node rootPtr = root;
		if (root == null) {
			return false;
		} else if (rootPtr.data == element) {
			return true;
		} else if (rootPtr.data >= element) {
			return searchNode(rootPtr.left, element);
		} else {
			return searchNode(rootPtr.right, element);
		}
	}

}
