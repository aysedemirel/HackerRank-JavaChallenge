package com.ayse.hackerrank.easy;

import java.util.Scanner;

/**
 * Static example in java
 *
 * @author aysedemirel
 */
public class StaticInitializerBlock {

    private static final String ERROR_MESSAGE = "Breadth and height must be positive";
    private static int breadth;
    private static int height;
    private static boolean flag = false;

    static {
        initializeDimensions();
    }

    private static void initializeDimensions() {
        try (Scanner scanner = new Scanner(System.in)) {
            breadth = scanner.nextInt();
            height = scanner.nextInt();
            if (breadth <= 0 || height <= 0) {
                throw new IllegalArgumentException(ERROR_MESSAGE);
            }
            flag = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = breadth * height;
            System.out.print(area);
        }
    }
}
