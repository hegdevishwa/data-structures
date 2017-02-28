import java.util.LinkedList;

public class Tester {

	public static void main(String[] args) {

		MyLinkedList<String> list = new MyLinkedList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");

		System.out.println(list);
		System.out.println(list.size());

		System.out.println(list.get(2));
		// System.out.println(list.remove(2));
		// System.out.println(list.get(2));
		list.reverse();
		System.out.println(list.get(2));

	}

}
