package com.ayse.hackerrank.easy;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagramWithArrays(String a, String b) {
        // The way is not accepted from Hackerrank
        char[] strA = a.toCharArray();
        char[] strB = b.toCharArray();
        Arrays.sort(strA);
        Arrays.sort(strB);

        return Arrays.equals(strA, strB);
    }

    static boolean isAnagram(String a, String b) {
        char[] strA = a.toLowerCase().toCharArray();
        char[] strB = b.toLowerCase().toCharArray();
        sort(strA, 0, strA.length - 1);
        sort(strB, 0, strB.length - 1);
        if (strA.length != strB.length) {
            return false;
        }
        for (int i = 0; i < strA.length; i++) {
            String A = strA[i] + "";
            String B = strB[i] + "";
            if (!A.equalsIgnoreCase(B)) {
                return false;
            }
        }
        return true;
    }

    static void sort(char[] arr, int low, int high) {
        if (low < high) {
            /*
             * pi is partitioning index, arr[pi] is now at right place
             */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    static int partition(char[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        char temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
