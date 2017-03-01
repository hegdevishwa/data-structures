import java.util.LinkedList;
import java.util.Stack;

public class Tester {

	public static void main(String[] args) {

		MyLinkedList<String> l = new MyLinkedList<>();

		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		l.add("e");

		l.display();
		System.out.println();
		l.reverse();
		l.display();
		System.out.println();
		l.reverseRecursively();
		l.display();

	}

}
