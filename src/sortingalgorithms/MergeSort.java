package sortingalgorithms;

import java.util.Arrays;

public class MergeSort {

	private void merge(int[] left, int[] right, int[] a) {
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

	private void mergeSort(int[] a) {
		if (a.length < 2) {
			return;
		}
		int mid = a.length / 2;

		int[] l = Arrays.copyOfRange(a, 0, mid);
		int[] r = Arrays.copyOfRange(a, mid + 1, a.length);
		

	}

}
