package com.ayse.hackerrank.easy;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Problem: add and multiply huge numbers. Use the power of Java's BigInteger class and solve it.
 * <p>
 * Input: There will be two lines containing two numbers, a and b.
 * <p>
 * Output: Output two lines. The first line should contain a+b, <br> and the second line should
 * contain axb.<br> Don't print any leading zeros.
 *
 * @author aysedemirel
 */
public class BigIntegerNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (scanner.hasNext()) {
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();
            BigInteger a_add_b = a.add(b);
            BigInteger a_mult_b = a.multiply(b);
            System.out.println(a_add_b);
            System.out.println(a_mult_b);
        }
        scanner.close();
    }
}
