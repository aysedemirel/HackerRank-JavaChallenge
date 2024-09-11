package com.ayse.hackerrank.easy;

import java.util.Scanner;

/**
 * <p>
 * Input order: integer, double, string output order: string, double, integer
 * </p>
 *
 * @author aysedemirel
 */
public class StdinAndStdoutII {

  private static final Scanner scan = new Scanner(System.in);

  public StdinAndStdoutII() {
  }

  public static void main(String[] args) {
    int i = scan.nextInt();
    double d = scan.nextDouble();
    scan.nextLine();
    String s = scan.nextLine();
    System.out.println("String: " + s);
    System.out.println("Double: " + d);
    System.out.println("Int: " + i);
    scan.close();
  }
}
