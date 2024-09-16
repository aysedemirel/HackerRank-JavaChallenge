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

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();
    double d = scan.nextDouble();
    scan.nextLine();
    String s = scan.nextLine();
    scan.close();
    System.out.println("String: " + s);
    System.out.println("Double: " + d);
    System.out.println("Int: " + i);
  }
  
}
