public class MyLinkedList<E> {

	private Node<E> head;
	private int size = 0;

	/** Appends an element at the end of list */
	public void add(E element) {
		Node<E> newNode = new Node<E>(element, null);
		if (head == null) {
			head = newNode;
		} else {
			newNode.link = head;
			head = newNode;
		}
		size++;
	}

	/** Retrieves an element from a specified position */
	public E get(int position) {
		return (E) getNode(position).data;
	}

	/** check the size of LinkedList */
	public int size() {
		return size;
	}

	/** Deletes an element from a specified position */
	public E remove(int position) {

		Node<E> temp1 = this.getNode(position - 1);
		Node<E> temp2 = temp1.link;
		temp1.link = temp2.link;
		E data = (E) temp2.data;
		temp2 = null;
		size--;
		return data;
	}

	/** Reverse the list */
	public void reverse() {
		Node<E> current = head;
		Node<E> next = null;
		Node<E> previous = null;
		while (current != null) {
			next = current.link;
			current.link = previous;
			previous = current;
			current = next;
		}
		head = previous;
	}

	/** Reverse recursively */
	public void reverseRecursively() {
		recursiveReverse(head);
	}

	private void recursiveReverse(Node<E> node) {
		if (node.link == null) {
			head = node;
			return;
		}
		recursiveReverse(node.link);
		Node<E> temp = node.link;
		temp.link = node;
		node.link = null; // This is required as when we reach last node after
							// reverseig, its link must be net to null;
	}

	/** Getting a node at specified position */
	private Node<E> getNode(int position) {
		if (position > size || position < 0) {
			throw new RuntimeException("Position is not correct");
		} else if (position == 1) {
			return head;
		} else {
			Node<E> temp = head;
			for (int i = 0; i < position; i++) {
				temp = temp.link;
			}
			return temp;
		}
	}

	private class Node<E> {
		E data;
		Node<E> link;

		Node(E data, Node<E> link) {
			this.data = data;
			this.link = link;
		}
	}

	public void display() {

		Node<E> temp = head;

		while (temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.link;
		}
	}

}
