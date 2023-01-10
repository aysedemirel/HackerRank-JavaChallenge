package org.ayse.hackerrank.java.datastructures;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Sample Input
 * <p>
 * 5,john tom,john mary,john tom,mary anna,mary anna,
 * <p>
 * Sample Output
 * <p>
 * 1, 2, 2, 3, 3,
 * <p>
 * Explanation
 * <p>
 * After taking the first input, you have only one pair: (john,tom)
 * <p>
 * After taking the second input, you have two pairs: (john, tom) and (john, mary)
 * <p>
 * After taking the third input, you still have two unique pairs.
 * <p>
 * After taking the fourth input, you have three unique pairs: (john,tom), (john, mary) and (mary,
 * anna)
 * <p>
 * After taking the fifth input, you still have three unique pairs.
 *
 * @author aysedemireldeniz
 */
public class HashSetExample {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    HashSet<String> ts = new HashSet<>();
    for (int i = 0; i < size; i++) {
      String first = scanner.next();
      String second = scanner.next();
      ts.add(first + " " + second);
      System.out.println(ts.size());
    }
  }

}
