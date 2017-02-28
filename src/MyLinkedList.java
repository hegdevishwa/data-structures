
public class MyLinkedList<E> {

	private Node<E> first;
	private Node<E> last;
	private int size = 0;

	/** Appends an element at the end of list */
	public void add(E element) {
		Node<E> newNode = new Node<E>(element, null);
		if (last == null) {
			first = newNode;
			last = newNode;
		} else {
			last.link = newNode;
			last = newNode;
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

	public void reverse() {
		Node<E> temp = first;
		first = last;
		last = temp;

		for (int i = 0; i < size; i++) {
			Node<E> t1 = temp.link;
			Node<E> t2 = t1.link;
			t1.link = temp;
			temp = t2.link;
			t2.link = t1;
		}
	}

	/** getting a node at specified position */
	private Node<E> getNode(int position) {
		if (position > size || position < 0) {
			throw new RuntimeException("Position is not correct");
		} else if (position == 1) {
			return first;
		} else if (position == size) {
			return last;
		} else {
			Node<E> temp = first;
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

}
