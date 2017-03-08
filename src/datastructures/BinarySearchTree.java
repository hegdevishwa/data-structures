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

	/**
	 * Add an element to tree
	 */
	public void insert(int element) {
		root = addNode(element, root);
	}

	/**
	 * Search and Element in tree
	 */
	public boolean search(int element) {
		return searchNode(root, element);
	}

	/**
	 * Search minimum value in tree
	 */
	public int min() {
		return findMinValNode(root).data;
	}

	/**
	 * Search Maximum value in tree
	 */
	public int max() {
		return findMaxValNode(root).data;
	}

	/**
	 * 
	 */
	public int height() {
		return findHeight(root);
	}

	private Node addNode(int element, Node root) {

		Node rootPtr = root;
		if (rootPtr == null) {
			rootPtr = new Node(element);
		} else if (rootPtr.data >= element) {
			rootPtr.left = addNode(element, rootPtr.left);
		} else {
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

	private Node findMinValNode(Node root) {
		if (root == null) {
			System.out.println("Error: tree is empty");
			return null;
		} else if (root.left == null) {
			return root;
		}
		return findMinValNode(root.left);
	}

	private Node findMaxValNode(Node root) {
		if (root == null) {
			System.out.println("Error: tree is empty");
			return null;
		} else if (root.right == null) {
			return root;
		}
		return findMaxValNode(root.right);
	}

	private int findHeight(Node root) {
		if (root == null) {
			return -1;
		}
		return max(findHeight(root.left), findHeight(root.right)) + 1;
	}

	private int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
}
