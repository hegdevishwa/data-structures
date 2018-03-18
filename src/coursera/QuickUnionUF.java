package coursera;

import java.util.Scanner;

/**
 * A dynamic connectivity problem.
 * 
 * @author hegdev1
 *
 */

public class QuickUnionUF {

  private int[] id;

  public QuickUnionUF(int n) {
    id = new int[n];
    for (int i = 0; i < n; i++) {
      id[i] = i;
    }
  }

  /**
   * Iterate until i is its own root i.e i=id[i]
   * 
   * @param i
   * @return
   */
  private int root(int i) {
    while (i != id[i])
      i = id[i];
    return i;
  }

  /**
   * If both P and Q have same root then they're connected
   * 
   * @param p
   * @param q
   * @return
   */
  public boolean connected(int p, int q) {
    return root(p) == root(q);
  }

  /**
   * Assign q's root to p
   * 
   * @param p
   * @param q
   */
  public void union(int p, int q) {
    int i = root(p);
    int j = root(q);
    id[i] = j;
  }

  public static void main(String args[]) {

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();

    QuickUnionUF qf = new QuickUnionUF(n);
    qf.union(4, 3);
    qf.union(3, 8);
    qf.union(5, 6);
    qf.union(9, 4);
    qf.union(2, 1);

    System.out.println("Is connected (8,9):" + qf.connected(8, 9));
    System.out.println("Is connected (5,4):" + qf.connected(5, 4));
    System.out.println("Is connected (2,1):" + qf.connected(2, 1));

    qf.union(5, 0);
    qf.union(7, 2);

    System.out.println("Is connected (5,1):" + qf.connected(5, 1));
    System.out.println("Is connected (9,4):" + qf.connected(9, 4));

  }
}
