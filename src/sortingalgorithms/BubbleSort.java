package sortingalgorithms;

public class BubbleSort {

	public static void sort(int[] a) {
		int size = a.length;

		for (int i = 0; i < size; i++) {

			for (int j = 0; j < size - i; j++) {

				if (a[i] > a[i + 1]) {
					swap(a, i, i + 1);
				}
			}

		}

	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	
}
