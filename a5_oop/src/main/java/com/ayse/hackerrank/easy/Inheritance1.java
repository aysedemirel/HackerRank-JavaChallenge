package com.ayse.hackerrank.easy;

/**
 * Print:
 * <p>
 * I am walking
 * <p>
 * I am flying
 * <p>
 * I am singing
 *
 * @author aysedemireldeniz
 */
public class Inheritance1 {

    public Inheritance1() {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }

    public static void main(String[] args) {
        new Inheritance1();
    }

    class Animal {

        void walk() {
            System.out.println("I am walking");
        }
    }

    class Bird extends Animal {

        void fly() {
            System.out.println("I am flying");
        }

        void sing() {
            System.out.println("I am singing");
        }
    }
}
