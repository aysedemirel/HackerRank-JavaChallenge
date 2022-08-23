package org.ayse.hackerrank.java.strings;

import java.util.Scanner;

/**
 * Given a string A, print Yes if it is a palindrome, print No otherwise.
 *
 * @author aysedemirel
 */
public class StringReverse {

  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    String A = sc.next();
    printResult(A);
  }

  private static void printResult(String A) {
    if (A.equals(new String(getReverseString(A)))) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

  private static byte[] getReverseString(String A) {
    byte[] str = A.getBytes();
    byte[] reverseStr = new byte[str.length];
    int lastIndex = str.length - 1;
    for (int i = lastIndex; i >= 0; i--) {
      reverseStr[lastIndex - i] = str[i];
    }
    return reverseStr;
  }
}
