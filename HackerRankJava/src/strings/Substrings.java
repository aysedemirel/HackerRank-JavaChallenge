package strings;

import java.util.Scanner;

/**
 * Find sub string with inputs from user.
 * 
 * @author aysedemirel
 */
public class Substrings {
  private static Scanner in = new Scanner(System.in);

  public static void main(String[] args) {

    String S = in.next();
    int start = in.nextInt();
    int end = in.nextInt();

    System.out.println(S.substring(start, end));
  }
}
