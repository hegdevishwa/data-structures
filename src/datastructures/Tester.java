package datastructures;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];

		int pc = 0;
		int nc = 0;
		int zc = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
			if (arr[i] > 0) {
				pc++;
			} else if (arr[i] < 0) {
				nc++;
			} else {
				zc++;
			}
		}

		double p = pc / n;
		System.out.print(p);
	}

}
