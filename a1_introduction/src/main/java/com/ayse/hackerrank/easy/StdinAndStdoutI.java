package com.ayse.hackerrank.easy;

import java.util.Scanner;

/**
 * <p>
 * Basic scanner example in a loop.<br> Scanner is to get input from users
 * </p>
 *
 * @author aysedemirel
 */
public class StdinAndStdoutI {

  public static void main(String[] args) {
    solutionOne();
    // solutionTwo();
  }

  public static void solutionOne() {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    scanner.close();
  }

  /**
   * Alternative solution using for loop
   */
  public static void solutionTwo() {
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
      int myInt = scanner.nextInt();
      System.out.println(myInt);
    }
    scanner.close();
  }
}
