package sortingalgorithms;

public class MergeSort {

	private static void merge(int[] left, int[] right, int[] a) {
		int i = 0, j = 0, k = 0;
		int lSize = left.length;
		int rSize = right.length;

		while (i < lSize && j < rSize) {
			if (left[i] <= right[j]) {
				a[k] = left[i];
				i++;
			} else {
				a[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < lSize) {
			a[k] = left[i];
			i++;
			k++;
		}
		while (j < rSize) {
			a[k] = right[j];
			j++;
			k++;
		}
	}

	private static void mergeSort(int[] a) {
		if (a.length < 2) {
			return;
		}
		int mid = a.length / 2;

		int[] left = new int[mid];
		int[] right = new int[a.length - mid];

		for (int i = 0; i < mid; i++) {
			left[i] = a[i];
		}
		for (int j = mid; j < a.length; j++) {
			right[j - mid] = a[j];

		}

		mergeSort(left);
		mergeSort(right);
		merge(left, right, a);

	}

	public static void sort(int[] a) {
		mergeSort(a);
	}
}
