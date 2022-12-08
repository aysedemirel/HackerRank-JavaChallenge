package org.ayse.hackerrank.java.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * You are given a class Solution and an inner class Inner.Private. The main method of class
 * Solution takes an integer num  as input. The powerof2 in class Inner.Private checks whether a
 * number is a power of 2. You have to call the method powerof2 of the class Inner.Private from the
 * main method of the class Solution.
 * <p>
 * Sample Input: 8
 * <p>
 * Sample Output: 8 is power of 2
 *
 * @author aysedemireldeniz
 */
public class CanYouAccess {

  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int num = Integer.parseInt(br.readLine().trim());
      Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private

      //Write your code here
      Inner inn = new Inner();
      CanYouAccess.Inner.Private prv = inn.new Private();
      System.out.println(num + " is " + prv.powerof2(num));
      o = prv;

      System.out.println(
          "An instance of class: " + o.getClass().getCanonicalName() + " has been created");

    }//end of try
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }//end of main

  static class Inner {

    private class Private {

      private String powerof2(int num) {
        return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
      }
    }
  }
}
