package strings;

import java.util.Scanner;

/**
 * Return the respective lexicographically smallest and largest substrings as a single
 * newline-separated string.
 * 
 * @author aysedemirel
 */
public class SubstringComparisons {
  public static String getSmallestAndLargest(String s, int k) {
    String smallest = "";
    String largest = "";

    // Complete the function
    // 'smallest' must be the lexicographically smallest substring of length 'k'
    // 'largest' must be the lexicographically largest substring of length 'k'

    return smallest + "\n" + largest;
  }


  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    int k = scan.nextInt();
    scan.close();

    System.out.println(getSmallestAndLargest(s, k));
  }
}
