package com.ayse.hackerrank.easy;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * You will be given two integers x and y as input, you have to compute x/y. If x and y are not
 * 32-bit signed integers or if y is zero, exception will occur, and you have to report it. Read
 * sample Input/Output to know what to report in case of exceptions.
 * <p>
 * 10-0 -> java.lang.ArithmeticException: / by zero
 * <p>
 * 23.323-0 -> java.util.InputMismatchException
 * <p>
 * 10-Hello ->java.util.InputMismatchException
 * <p>
 * 10-3 -> 3
 *
 * @author aysedemireldeniz
 */
public class TryCatch {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int result = x / y;
            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}
