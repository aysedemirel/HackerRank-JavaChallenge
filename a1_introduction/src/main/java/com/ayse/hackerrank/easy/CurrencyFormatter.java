package com.ayse.hackerrank.easy;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Get a double number from user. It is your payment and classified it with countries : US, India,
 * China, France
 *
 * @author aysedemirel
 */
public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        final Locale indiaLocale = Locale.of("en", "IN");
        // for before Java 19
        // final Locale indiaLocale = new Locale("en", "IN");

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(indiaLocale).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
