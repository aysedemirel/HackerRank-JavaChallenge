package com.ayse.hackerrank.easy;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * iven a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
 * We define a token to be one or more consecutive English alphabetic letters. Then, print the
 * number of tokens, followed by each token on a new line.
 *
 * @author aysedemirel
 */
public class StringTokens {

    private static final String SPLIT_REGEX = "[ !,?._'@]+";
    private static final String VALID_REGEX = "[A-Za-z !,?._'@]+";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        boolean isInputValid = s.matches(VALID_REGEX);
        boolean isLengthValid = (s.length() >= 1) && (s.length() <= 400000);
        if (isInputValid && isLengthValid) {
            Pattern pattern = Pattern.compile(SPLIT_REGEX);
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
