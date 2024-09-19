package com.ayse.hackerrank.easy;

import java.util.Scanner;

/**
 * You are required to compute the power of a number by implementing a calculator. Create a class
 * MyCalculator which consists of a single method long power(int, int). This method takes two
 * integers, n and p, as parameters and finds n^p. If either n or p is negative, then the method
 * must throw an exception which says "n or p should not be negative.". Also, if both n and p are
 * zero, then the method must throw an exception which says "n and p should not be zero."
 * <p>
 * For example, -4 and -5 would result in java.lang.Exception: n or p should not be negative.
 * <p>
 * Complete the function power in class MyCalculator and return the appropriate result after the
 * power operation or an appropriate exception as detailed above.
 * <p>
 * Sample Input 0
 * <p>
 * 3 5
 * <p>
 * 2 4
 * <p>
 * 0 0
 * <p>
 * -1 -2
 * <p>
 * -1 3
 * <p>
 * Sample Output 0
 * <p>
 * 243
 * <p>
 * 16
 * <p>
 * java.lang.Exception: n and p should not be zero.
 * <p>
 * java.lang.Exception: n or p should not be negative.
 * <p>
 * java.lang.Exception: n or p should not be negative.
 *
 * @author aysedemireldeniz
 */
public class ExceptionHandling {

    public static void main(String[] args) {
        final ExceptionHandling sample = new ExceptionHandling();
        final Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();

            try {
                System.out.println(sample.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public int power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        }
        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }

        int result = 1;

        for (int i = 0; i < p; i++) {
            result *= n;
        }
        return result;
    }
}
