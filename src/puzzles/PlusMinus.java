package puzzles;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		int pc = 0;
		int nc = 0;
		int zc = 0;
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
			if (arr[arr_i] > 0) {
				pc++;
			} else if (arr[arr_i] < 0) {
				nc++;
			} else {
				zc++;
			}
		}
		double p = pc/n;
		System.out.println(pc / n);
		System.out.println(nc / n);
		System.out.println(zc / n);

	}

}
