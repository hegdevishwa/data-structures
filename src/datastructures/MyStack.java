package datastructures;

public class MyStack<E> {

	final int MAX_SIZE = 1000;
	Object[] s = new Object[MAX_SIZE];
	int top = -1;

	public boolean isEmpty() {
		return (top < 0);
	}

	public boolean push(E element) {
		if (top >= MAX_SIZE) {
			throw new RuntimeException("Stack overflow");
		} else {
			s[++top] = element;
			return true;
		}
	}

	public E pop() {
		if (top < 0) {
			throw new RuntimeException("Stack is empty");
		} else {
			E e = (E) s[top--];
			return e;

		}
	}

}
