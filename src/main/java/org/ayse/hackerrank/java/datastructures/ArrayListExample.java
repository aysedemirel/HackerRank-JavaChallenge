package org.ayse.hackerrank.java.datastructures;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * The first line has an integer n. In each of the next n lines there will be an integer d denoting
 * number of integers on that line and then there will be d space-separated integers. In the next
 * line there will be an integer q denoting number of queries. Each query will consist of two
 * integers x and y.
 *
 * @author aysedemireldeniz
 */
public class ArrayListExample {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int n = scanner.nextInt();
      List<List<Integer>> dataList = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        int size = scanner.nextInt();
        List<Integer> childList = new ArrayList<>();
        for (int j = 0; j < size; j++) {
          int num = scanner.nextInt();
          childList.add(num);
        }
        dataList.add(childList);
      }
      int q = scanner.nextInt();
      final int RAW = dataList.size();
      for (int i = 0; i < q; i++) {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x <= RAW && y <= dataList.get(x - 1).size()) {
          System.out.println(dataList.get(x - 1).get(y - 1));
        } else {
          System.out.println("ERROR!");
        }
      }
    } catch (InputMismatchException e) {
      e.printStackTrace();
    }
  }
}
