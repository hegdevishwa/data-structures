package puzzles;

import java.util.Scanner;

public class TimeConversion {

  /**
   * Given a time in -hour AM/PM format, convert it to military (24-hour) time.
   * 
   * Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour
   * clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour
   * clock.
   * 
   * Function Description
   * 
   * Complete the timeConversion function described below to return the converted
   * timestring.
   * 
   * timeConversion(string: s) Parameters: s: time string to convert Returns:
   * string representing time in 24 hour format Raw Input Format
   * 
   * A single string containing a time in -hour clock format (i.e.: or ), where
   * and .
   * 
   * Sample Input : 07:05:45PM Sample Output : 19:05:45
   */
  static String timeConversion(String s) {
    String[] arr = s.split(":");
    String AMPM = arr[2].substring(2);
    arr[2] = arr[2].replaceAll("[A-Z]+$", " ");
    StringBuffer sb = new StringBuffer();
    if (AMPM.equals("AM")) {
      int hour = Integer.valueOf(arr[0]);
      if (hour == 12) {
        sb.append("00");
      } else {
        sb.append(arr[0]);
      }
    } else {
      int hour = Integer.valueOf(arr[0]);
      if (hour == 12) {
        sb.append(hour);
      }else {
        hour = hour + 12;
        sb.append(hour);
      }
    }
    sb.append(":");
    sb.append(arr[1]);
    sb.append(":");
    sb.append(arr[2]);
    return sb.toString();
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    String result = timeConversion(s);
    System.out.println(result);
    in.close();
  }

}
