package com.ayse.hackerrank.easy;

import java.util.Scanner;

public class AbstractClass {

    public AbstractClass() {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: " + new_novel.getTitle());
        sc.close();
    }

    public static void main(String[] args) {
        new AbstractClass();
    }

    abstract class Book {

        String title;

        String getTitle() {
            return title;
        }

        abstract void setTitle(String s);

    }

    class MyBook extends Book {

        void setTitle(String s) {
            title = s;
        }
    }
}
