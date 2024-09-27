package com.ayse.hackerrank.easy;

import java.util.Scanner;

/**
 * Given a string A, print Yes if it is a palindrome, print No otherwise.
 *
 * @author aysedemirel
 */
public class StringReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        solutionOne(A);
    }

    private static void solutionOne(String A) {
        char[] reverse = new char[A.length()];
        for (int i = 0; i < A.length(); i++) {
            reverse[i] = A.charAt(A.length() - 1 - i);
        }
        if (new String(reverse).equals(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static void solutionTwo(String A) {
        for (int i = 0; i < A.length() / 2; i++) {
            if (A.charAt(i) != A.charAt(A.length() - 1 - i)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    private static void solutionThree(String A) {
        StringBuilder sb = new StringBuilder(A);
        String reversed = sb.reverse().toString();
        if (A.equals(reversed)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static void solutionFour(String A) {
        int left = 0;
        int right = A.length() - 1;
        while (left < right) {
            if (A.charAt(left) != A.charAt(right)) {
                System.out.println("No");
                return;
            }
            left++;
            right--;
        }
        System.out.println("Yes");
    }

    private static void solutionFive(String A) {
        byte[] str = A.getBytes();
        byte[] reverse = new byte[str.length];
        int lastIndex = str.length - 1;
        for (int i = lastIndex; i >= 0; i--) {
            reverse[lastIndex - i] = str[i];
        }
        String result = A.equals(new String(reverse)) ? "Yes" : "No";
        System.out.println(result);
    }


}
