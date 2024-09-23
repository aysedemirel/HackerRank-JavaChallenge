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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();
        System.out.println(A.length() + B.length());
        System.out.println(getLexicographically(A, B));
        System.out.println(capitalize(A) + " " + capitalize(B));
    }

    private static String getLexicographically(String A, String B) {
        return A.compareTo(B) > 0 ? "Yes" : "No";
    }

    public static String capitalize(String str) {
        return (str == null || str.length() <= 1) ?
                str :
                str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
