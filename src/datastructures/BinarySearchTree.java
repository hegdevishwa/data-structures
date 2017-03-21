package datastructures;

import java.util.TreeSet;

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

	/**
	 * Tree traversal pre-order
	 */

	public void preOrderTraversal() {

		traversePreOrder(root);
	}

	/**
	 * Tree traversal in-order
	 */

	public void inOrderTraversal() {

		traverseInOrder(root);
	}

	/**
	 * Tree traversal post-order
	 */

	public void postOrderTraversal() {

		traversePostOrder(root);
	}

	/**
	 * Checks if the tree is Binary search tree
	 */
	public boolean isBST() {
		int MIN_VAL = Integer.MIN_VALUE;
		int MAX_VAL = Integer.MAX_VALUE;
		return bstUtil(root, MIN_VAL, MAX_VAL);
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

	private void traversePreOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		traversePreOrder(root.left);
		traversePreOrder(root.right);
	}

	private void traverseInOrder(Node root) {
		if (root == null) {
			return;
		}
		traverseInOrder(root.left);
		System.out.print(root.data + " ");
		traverseInOrder(root.right);
	}

	private void traversePostOrder(Node root) {
		if (root == null) {
			return;
		}
		traversePostOrder(root.left);
		traversePostOrder(root.right);
		System.out.print(root.data + " ");

	}

	/** this will check if the sub tree is also bonary search tree **/
	private boolean bstUtil(Node root, int minVal, int maxVal) {
		if (root == null)
			return true;
		if (root.data > minVal && root.data < maxVal && bstUtil(root.left, minVal, root.data)
				&& bstUtil(root.right, root.data, maxVal)) {
			return true;
		} else {
			return false;
		}
	}

}
