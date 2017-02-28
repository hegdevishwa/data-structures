import javax.lang.model.element.Element;

public class MyArrayList<E> {

	private Object[] objectArray;
	private int size;

	MyArrayList() {
		objectArray = new Object[10];
		size = 0;
	}

	public void add(E element) {
		objectArray[size++] = element;
	}

	public E remove(int index) {
		if (index >= size || index < 0) {
			throw new RuntimeException("Invaid index");
		}
		E element = (E) objectArray[index];

		objectArray[index] = null;
		size--;
		return element;
	}

	public E get(int index) {
		if (index >= size || index < 0) {
			throw new RuntimeException("Invaid index");
		}
		E element = (E) objectArray[index];
		return element;
	}

	public int size() {
		return this.size;
	}

	private void ensureCapacity() {
		if (size < objectArray.length) {
			return;
		}
		resize();
	}

	private void resize() {
		Object[] temp = new Object[objectArray.length * 2];
		copy(objectArray, temp);
		objectArray = temp;
	}

	private void copy(Object[] src, Object[] dest) {
		if (dest.length < src.length) {
			throw new RuntimeException(src + " cannot be copied into " + dest);
		}
		for (int i = 0; i < src.length; i++) {
			dest[i] = src[i];
		}
	}

}
