package org.ayse.hackerrank.java.oop;

import java.util.Scanner;

/**
 * You are given an interface AdvancedArithmetic which contains a method signature int
 * divisor_sum(int n). You need to write a class called MyCalculator which implements the
 * interface.
 * <p>
 * divisorSum function just takes an integer as input and return the sum of all its divisors. For
 * example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. The value of n will be
 * at most 1000.
 * <p>
 * Read the partially completed code in the editor and complete it. You just need to write the
 * MyCalculator class only. Your class shouldn't be public.
 *
 * @author aysedemireldeniz
 */
public class InterfaceChallange {

  public InterfaceChallange() {
    MyCalculator my_calculator = new MyCalculator();
    System.out.print("I implemented: ");
    ImplementedInterfaceNames(my_calculator);
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.print(my_calculator.divisor_sum(n) + "\n");
    sc.close();
  }

  static void ImplementedInterfaceNames(Object o) {
    Class[] theInterfaces = o.getClass().getInterfaces();
    for (int i = 0; i < theInterfaces.length; i++) {
      String interfaceName = theInterfaces[i].getName();
      System.out.println(interfaceName);
    }
  }

  public static void main(String[] args) {
    new InterfaceChallange();
  }

  interface AdvancedArithmetic {

    int divisor_sum(int n);
  }

  class MyCalculator implements AdvancedArithmetic {

    @Override
    public int divisor_sum(int n) {
      int result = n;
      for (int i = n - 1; i > 0; i--) {
        if (n % i == 0) {
          result += i;
        }
      }
      return result;
    }
  }
}
