package sortingalgorithms;

public class SelectionSort {

	public static void sort(int[] a) {

		int size = a.length;

		for (int i = 0; i < size - 1; i++) {
			int min = i;

			for (int j = i + 1; j < size; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;

		}

	}

}
