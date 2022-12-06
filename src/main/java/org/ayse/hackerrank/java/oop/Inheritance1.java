package org.ayse.hackerrank.java.oop;

/**
 * Print:
 * I am walking
 * I am flying
 * I am singing
 *
 * @author aysedemirel
 * */
public class Inheritance1 {
  class Animal{
    void walk()
    {
      System.out.println("I am walking");
    }
  }

  class Bird extends Animal
  {
    void fly()
    {
      System.out.println("I am flying");
    }
    void sing(){
      System.out.println("I am singing");
    }
  }

  public Inheritance1(){
    Bird bird = new Bird();
    bird.walk();
    bird.fly();
    bird.sing();
  }

  public static void main(String[] args) {
   new Inheritance1();
  }
}
