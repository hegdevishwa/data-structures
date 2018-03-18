package puzzles;

import java.util.Scanner;

public class GradingStudents {
  /**
   * At HackerLand University, a passing grade is any grade 40 points or higher on
   * a 100 point scale. Sam is a professor at the university and likes to round
   * each student’s grade according to the following rules:
   * 
   * If the difference between the grade and the next higher multiple of 5 is less
   * than 3, round to the next higher multiple of 5 If the grade is less than 38,
   * don’t bother as it’s still a failing grade Automate the rounding process then
   * round a list of grades and print the results.
   * 
   * Input Format
   * 
   * First Line
   * <li>integer</li>
   * <li>n number of students</li>
   * 
   * Next lines
   * 
   * integer : individual grades Output Format
   * 
   * Print lines, each with the rounded value of a student’s grade in input order.
   * 
   * Sample Input : 4 73 67 38 33 Sample Output : 75 67 40 33 Explanation 0 The
   * first grade, is two below the next higher multiple of , so it rounds to . is
   * points less than the next higher multiple of so it doesn’t round. , like ,
   * rounds up to next higher multiple of , or in this case. is less than , so it
   * does not round.
   * 
   * @param grades
   * @return
   */

  static int[] solve(int[] grades) {
    int[] finalGrades = new int[grades.length];
    for (int i = 0; i < grades.length; i++) {
      if ((grades[i] + 1) % 5 == 0 && (grades[i] + 1) > 38) {
        finalGrades[i] = grades[i] + 1;
      } else if ((grades[i] + 2) % 5 == 0 && (grades[i] + 2) > 38) {
        finalGrades[i] = grades[i] + 2;
      } else {
        finalGrades[i] = grades[i];
      }
    }
    return finalGrades;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] grades = new int[n];
    for (int grades_i = 0; grades_i < n; grades_i++) {
      grades[grades_i] = in.nextInt();
    }
    int[] result = solve(grades);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
    }
    System.out.println("");

  }

}
