package puzzles;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		float pc = 0;
		float nc = 0;
		float zc = 0;
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
		float p = pc / n;
		float ng = nc / n;
		float z = zc / n;
		DecimalFormat formatter = new DecimalFormat("#.######");
		System.out.println(formatter.format(p));
		System.out.println(formatter.format(ng));
		System.out.println(formatter.format(z));

	}

}
