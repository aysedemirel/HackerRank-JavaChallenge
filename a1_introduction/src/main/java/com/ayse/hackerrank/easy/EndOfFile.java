package com.ayse.hackerrank.easy;

import java.util.Scanner;

/**
 * Ctrl-Z is end of file command. </br> If it is end of file, print the lines with line number.
 *
 * @author aysedemirel
 */
public class EndOfFile {
    public static void main(String[] args) {
        solutionOne();
    }

    public static void solutionOne() {
        Scanner scanner = new Scanner(System.in);
        int lineNum = 1;
        while (scanner.hasNext()) {
            System.out.println(lineNum + " " + scanner.nextLine());
            lineNum++;
        }
    }
}
