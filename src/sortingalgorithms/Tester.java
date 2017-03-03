package sortingalgorithms;

public class Tester {

	public static void main(String[] args) {

		int a[] = { 15, 2, 54, 20, 4, 1 };

		for (int i : a)
			System.out.print(i + " ");

		System.out.println();

		SelectionSort.sort(a);

		for (int i : a)
			System.out.print(i + " ");
		

	}

}
