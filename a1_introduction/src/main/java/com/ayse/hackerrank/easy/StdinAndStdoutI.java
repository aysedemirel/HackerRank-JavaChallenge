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

  private static final int LOOP_NUMBER = 3;
  private static final Scanner scanner = new Scanner(System.in);

  public StdinAndStdoutI() {
    for (int i = 0; i < LOOP_NUMBER; i++) {
      int myInt = scanner.nextInt();
      System.out.println(myInt);
    }
    scanner.close();
  }

  public static void main(String[] args) {
    new StdinAndStdoutI();
  }
}
