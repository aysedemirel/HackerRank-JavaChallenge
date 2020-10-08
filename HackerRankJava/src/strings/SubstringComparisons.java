package strings;

import java.util.Scanner;

/**
 * Return the respective lexicographically smallest and largest substrings as a single
 * newline-separated string.
 * 
 * @author aysedemirel
 */
public class SubstringComparisons {
  public static String getSmallestAndLargest(String text, int seperatedIndex) {
    int startIndex = 0;
    String tempText = text.substring(startIndex, seperatedIndex);
    String smallest = tempText;
    String largest = tempText;
    for (int i = seperatedIndex; i < text.length(); i++) {
      tempText = tempText.substring(startIndex + 1, seperatedIndex) + text.charAt(i);
      if (largest.compareTo(tempText) < 0) {
        largest = tempText;
      }
      if (smallest.compareTo(tempText) > 0) {
        smallest = tempText;
      }
    }
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
