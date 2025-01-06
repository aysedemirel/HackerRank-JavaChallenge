package com.ayse.hackerrank.easy;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Given a string, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
 * We define a token to be one or more consecutive English alphabetic letters. Then, print the
 * number of tokens, followed by each token on a new line.
 *
 * @author aysedemirel
 */
public class StringTokens {


    public static void main(String[] args) {
        solutionOne();
    }

    private static void solutionOne() {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        boolean isInputValid = s.matches("[A-Za-z !,?._'@]+");
        boolean isLengthValid = !s.isEmpty() && (s.length() <= 400000);
        if (isInputValid && isLengthValid) {
            String[] split = s.split("[ !,?._'@]+");
            System.out.println(split.length);
            for (String string : split) {
                System.out.println(string);
            }
        } else {
            System.out.println("0");
        }
        scan.close();
    }

    private static void solutionTwo() {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        boolean isInputValid = s.matches("[A-Za-z !,?._'@]+");
        boolean isLengthValid = !s.isEmpty() && (s.length() <= 400000);
        if (isInputValid && isLengthValid) {
            Pattern pattern = Pattern.compile("[ !,?._'@]+");
            String[] split = pattern.split(s);
            System.out.println(split.length);
            for (String string : split) {
                System.out.println(string);
            }
        } else {
            System.out.println("0");
        }
        scan.close();
    }
}
