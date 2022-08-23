package org.ayse.hackerrank.java.introduction;

import java.util.Scanner;

/**
 * <p>
 * Control with if-else<br> Get a number from user and control the range.<br> If number is odd,
 * print weird.<br> If number is even and in range [2,5], print not weird. <br> If number is even
 * and in range [6,20], print weird. <br> If number is even and greater than 20, print not weird.
 * </p>
 *
 * @author aysedemirel
 */
public class JavaIfElse {

  private static final Scanner scanner = new Scanner(System.in);

  public JavaIfElse() {
    int N = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    while (isNumberValid(N)) {
      N = scanner.nextInt();
    }
    if (isNumberOdd(N)) {
      System.out.println("Weird");
    } else {
      // number is even
      if (N >= 2 && N <= 5) {
        System.out.println("Not Weird");
      } else if (N >= 6 && N <= 20) {
        System.out.println("Weird");
      } else {
        System.out.println("Not Weird");
      }
    }
    scanner.close();
  }

  public static void main(String[] args) {
    new JavaIfElse();
  }

  private boolean isNumberValid(int number) {
    return (number > 100 || number < 1);
  }

  private boolean isNumberOdd(int number) {
    return number % 2 != 0;
  }
}
