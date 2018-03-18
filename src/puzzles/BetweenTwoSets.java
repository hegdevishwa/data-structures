package puzzles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BetweenTwoSets {

  static int bruteForce(int[] a, int[] b) {

    List<Integer> arr = new ArrayList<>();
    int i = 0;
    int fact = 0;
    while (fact < b[0]) {
      i++;
      fact = a[0] * i;
      boolean isFact = false;
      for (int j = 0; j < a.length; j++) {
        if ((fact % a[j]) == 0) {
          isFact = true;
          for (int k = 0; k < b.length; k++) {
            if (b[k] % fact != 0 || fact > b[0]) {
              isFact = false;
              break;
            }
          }
        } else {
          isFact = false;
          break;
        }
      }
      if (isFact) {
        arr.add(fact);
      }
    }
    return arr.size();
  }

  static int gcd(int a, int b) {
    while (a > 0 && b > 0) {

      if (a >= b) {
        a = a % b;
      } else {
        b = b % a;
      }
    }

    return a + b;
  }

  static int lcm(int a, int b) {
    return (a / gcd(a, b)) * b;
  }

  static int getTotalX(int[] a, int[] b) {
    // return bruteForce(a, b);
    int multiple = 0;
    for (int i : b) {
      multiple = gcd(multiple, i);
    }
    System.err.println(multiple);

    int factor = 1;
    for (int i : a) {
      factor = lcm(factor, i);
      if (factor > multiple) {
        return 0;
      }
    }
    System.err.println(factor);

    if (multiple % factor != 0) {
      return 0;
    }

    int totalX = 1;

    for (int i = factor; i < multiple; i++) {
      if (multiple % i == 0 && i % factor == 0) {
        totalX++;
      }
    }

    return totalX;

  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int[] a = new int[n];
    for (int a_i = 0; a_i < n; a_i++) {
      a[a_i] = in.nextInt();
    }
    int[] b = new int[m];
    for (int b_i = 0; b_i < m; b_i++) {
      b[b_i] = in.nextInt();
    }
    int total = getTotalX(a, b);
    System.out.println(total);
    in.close();
  }

}
