package com.ayse.hackerrank.easy;

import java.util.Scanner;

/**
 * <p>
 * Get a number from user and calculate multiplication in range [1,10]
 * </p>
 *
 * @author aysedemirel
 */
public class LoopsI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        // input control
        while (N < 2 || N > 20) {
            N = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        }
        scanner.close();
        solutionOne(N);
    }

    public static void solutionOne(int N) {
        for (int i = 1; i <= 10; i++) {
            String output = String.format("%d x %d = %d", N, i, N * i);
            System.out.println(output);
        }
    }

    public static void solutionTwo(int N) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + N * i);
        }
    }
}
