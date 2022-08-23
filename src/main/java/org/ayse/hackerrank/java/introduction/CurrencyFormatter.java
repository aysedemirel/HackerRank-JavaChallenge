package org.ayse.hackerrank.java.introduction;

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

  private static final Locale INDIA_LOCALE = new Locale("en", "IN");
  private static final NumberFormat INDIA = NumberFormat.getCurrencyInstance(INDIA_LOCALE);
  private static final NumberFormat US = NumberFormat.getCurrencyInstance(Locale.US);
  private static final NumberFormat CHINA = NumberFormat.getCurrencyInstance(Locale.CHINA);
  private static final NumberFormat FRANCE = NumberFormat.getCurrencyInstance(Locale.FRANCE);

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();
    System.out.println("US: " + US.format(payment));
    System.out.println("India: " + INDIA.format(payment));
    System.out.println("China: " + CHINA.format(payment));
    System.out.println("France: " + FRANCE.format(payment));
  }
}
