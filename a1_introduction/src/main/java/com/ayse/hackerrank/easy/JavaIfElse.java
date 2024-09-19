package com.ayse.hackerrank.easy;

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        // If number is invalid, enter another number
        while (isNumberValid(N)) {
            N = scanner.nextInt();
        }
        solutionOne(N);
        scanner.close();
    }

    private static boolean isNumberValid(int number) {
        return (number > 100 || number < 1);
    }

    public static void solutionOne(int N) {
        if (N % 2 != 0) {
            System.out.print("Weird");
        } else if (N >= 2 && N <= 5) {
            System.out.print("Not Weird");
        } else if (N >= 6 && N <= 20) {
            System.out.print("Weird");
        } else {
            System.out.print("Not Weird");
        }
    }

    /**
     * Alternative solution using separate method
     */
    public static void solutionTwo(int N) {
        if (isNumberOdd(N)) {
            System.out.print("Weird");
        } else if (N >= 2 && N <= 5) {
            System.out.print("Not Weird");
        } else if (N >= 6 && N <= 20) {
            System.out.print("Weird");
        } else {
            System.out.print("Not Weird");
        }
    }

    private static boolean isNumberOdd(int number) {
        return number % 2 != 0;
    }


}
