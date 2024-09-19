package com.ayse.hackerrank.easy;

import java.util.Scanner;

/**
 * <p>
 * Get 3 line inputs from user. One line input should be like "java 12" (String and integer).<br>
 * The length of the first word before whitespace should be 15 character, if it is not, fill it with
 * white space <br> The number should be 3 digit, if it is not fill it with zero.
 * </p>
 *
 * @author aysedemirel
 */
public class OutputFormatting {


    public static void main(String[] args) {
        solutionTwo();
    }

    public static void solutionOne() {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
    }

    public static void solutionTwo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            String resultStr = s1;
            for (int a = 0; a < (15 - s1.length()); a++) {
                resultStr += " ";
            }
            String resultInt;
            if (x >= 0 && x <= 9) {
                resultInt = "00" + x;
            } else if (x >= 10 && x <= 99) {
                resultInt = "0" + x;
            } else {
                resultInt = String.valueOf(x);
            }
            System.out.println(resultStr + resultInt);
        }
        System.out.println("================================");
    }


}
