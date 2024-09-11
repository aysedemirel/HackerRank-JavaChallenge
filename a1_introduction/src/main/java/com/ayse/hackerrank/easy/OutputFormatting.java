package com.ayse.hackerrank.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <p>
 * Get 3 line inputs from user. One line input should be like "java 12" (String and integer).<br>
 * The lenght of the first word before whitespace sohould be 15 character, if it is not, fill it
 * with white space <br> The number should be 3 digit, if it is not fill it with zero.
 * </p>
 *
 * @author aysedemirel
 */
public class OutputFormatting {

  private static final int LOOP_NUMBER = 3;
  private static final Scanner scanner = new Scanner(System.in);
  private final List<Data> inputs;

  public OutputFormatting() {
    inputs = new ArrayList<Data>();
    getInputs();
    printResult();
  }

  public static void main(String[] args) {
    new OutputFormatting();
  }

  private void getInputs() {
    for (int i = 0; i < LOOP_NUMBER; i++) {
      String str = scanner.next();
      int number = scanner.nextInt();
      Data data = new Data();
      data.setNumber(number);
      data.setStr(str);
      inputs.add(data);
    }
  }

  private void printResult() {
    System.out.println("================================");
    for (int i = 0; i < LOOP_NUMBER; i++) {
      String str = inputs.get(i).getStr();
      int num = inputs.get(i).getNumber();
      System.out.println(getStringValidFormat(str) + getIntegerValidFormat(num));
    }
    System.out.println("================================");
  }

  private String getStringValidFormat(String str) {
    if (str.length() > 15) {
      return str.substring(0, 14);
    }
    while (str.length() < 15) {
      str += " ";
    }
    return str;
  }

  private String getIntegerValidFormat(int num) {
    if (num < 0 || num > 999) {
      return "000";
    } else if (num >= 0 && num <= 9) {
      return "00" + num;
    } else if (num >= 10 && num <= 99) {
      return "0" + num;
    } else {
      return String.valueOf(num);
    }
  }

  private class Data {

    String str;
    int number;

    public String getStr() {
      return str;
    }

    public void setStr(String str) {
      this.str = str;
    }

    public int getNumber() {
      return number;
    }

    public void setNumber(int number) {
      this.number = number;
    }
  }
}
