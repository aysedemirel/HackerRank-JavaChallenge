package com.ayse.hackerrank.easy;

/**
 * Write the following code in your editor below:
 * <p>
 * A class named Arithmetic with a method named add that takes  integers as parameters and returns
 * an integer denoting their sum. A class named Adder that inherits from a superclass named
 * Arithmetic. Your classes should not be public .
 *
 * @author aysedemireldeniz
 */
public class Inheritance2 {

    public Inheritance2() {
        Adder a = new Adder();
        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
    }

    public static void main(String[] args) {
        new Inheritance2();
    }

    class Arithmetic {

        public int add(int i, int j) {
            return i + j;
        }
    }

    class Adder extends Arithmetic {

    }
}
