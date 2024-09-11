package com.ayse.hackerrank.easy;

/**
 * Generic methods are a very efficient way to handle multiple datatypes using a single method. This
 * problem will test your knowledge on Java Generic methods.
 * <p>
 * Let's say you have an integer array and a string array. You have to write a single method
 * printArray that can print all the elements of both arrays. The method should be able to accept
 * both integer arrays or string arrays.
 * <p>
 * You are given code in the editor. Complete the code so that it prints the following lines:
 * <p>
 * 1, 2, 3, Hello, World
 *
 * @author aysedemireldeniz
 */
public class JavaGenerics {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Printer<Integer> myPrinter = new Printer<>();
    Printer<String> strPrinter = new Printer<>();
    Integer[] intArray = {1, 2, 3};
    String[] stringArray = {"Hello", "World"};
    myPrinter.printArray(intArray);
    strPrinter.printArray(stringArray);
  }

  static class Printer<T> {

    public void printArray(T[] arr) {
      for (T t : arr) {
        System.out.println(t);
      }
    }
  }
}
