package com.ayse.hackerrank.easy;

import java.util.Scanner;

/**
 * <p>
 * Get a query number from user, after that, get three inputs from user for number of query. <br>
 * print format: (a+2^0*b),(a+2^0*b+2^1*b)...(a+2^0*b+2^1*b+...+2^n-1*b)
 * </p>
 *
 * @param t,a,b,n
 * @author aysedemirel
 */
public class LoopsII {


    public static void main(String[] argh) {
        solutionOne();
    }

    public static void solutionOne() {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result = a;
            for (int j = 0; j < n; j++) {
                result += (int) (Math.pow(2, j) * b);
                System.out.print(result + " ");
            }
            System.out.println();
        }
        in.close();
    }

    public static void solutionTwo() {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 0, k = 1, e = a + k * b; j < n; ++j, k *= 2, e += k * b) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
