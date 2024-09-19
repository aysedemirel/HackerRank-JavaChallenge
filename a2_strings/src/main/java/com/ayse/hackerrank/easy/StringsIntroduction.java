package com.ayse.hackerrank.easy;

import java.util.Scanner;

/**
 * Get two strings from user. </br> 1- Sum the lengths of and . </br> 2- Determine if is
 * lexicographically larger than (i.e.: does come before in the dictionary?).</br> 3- Capitalize the
 * first letter in and and print them on a single line, separated by a space.</br>
 *
 * @author aysedemirel
 */
public class StringsIntroduction {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String A = sc.next();
        String B = sc.next();
        sc.close();
        System.out.println(A.length() + B.length());
        printLexicographically(A, B);
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " "
                + B.substring(0, 1).toUpperCase() + B.substring(1));
    }

    private static void printLexicographically(String A, String B) {
        int compareLexicographically = A.compareTo(B);
        if (compareLexicographically > 0) {
            // A >B
            System.out.println("Yes");
        } else if (compareLexicographically == 0) {
            // A == B
            System.out.println("No");
        } else {
            // A<B
            System.out.println("No");
        }
    }
}
