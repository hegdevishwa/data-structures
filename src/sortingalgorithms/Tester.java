package sortingalgorithms;

public class Tester {

	public static void main(String[] args) {

		System.out.println(" --------------------- Selection sort_--------------");
		int a[] = { 15, 2, 54, 20, 4, 1 };

		for (int i : a)
			System.out.print(i + " ");

		System.out.println();

		SelectionSort.sort(a);

		for (int i : a)
			System.out.print(i + " ");

		System.out.println();
		System.out.println(" --------------------- Merger sort_--------------");

		int b[] = { 15, 2, 54, 20, 4, 1 };

		for (int i : b)
			System.out.print(i + " ");

		System.out.println();

		MergeSort.sort(b);

		for (int i : b)
			System.out.print(i + " ");

	}

}
