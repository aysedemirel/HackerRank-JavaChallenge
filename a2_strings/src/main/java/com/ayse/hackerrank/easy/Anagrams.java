package com.ayse.hackerrank.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Two strings contain all the same letters in the same frequencies, print "Anagrams".
 * Otherwise, print "Not Anagrams".
 *
 * @author aysedemirel
 */
public class Anagrams {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = solutionThree(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

    private static boolean solutionOne(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        int[] arr = new int[26];
        for (int i = 0; i < a.length(); i++) {
            arr[a.charAt(i) - 'a']++;
            arr[b.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean solutionTwo(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        Map<Character, Integer> characters = new HashMap<>();
        for (char c : a.toLowerCase().toCharArray()) {
            characters.put(c, characters.getOrDefault(c, 0) + 1);
        }
        for (char c : b.toLowerCase().toCharArray()) {
            if (!characters.containsKey(c) || characters.get(c) == 0) {
                return false;
            }
            characters.put(c, characters.get(c) - 1);
        }
        return true;
    }

    private static boolean solutionThree(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        char[] strA = a.toLowerCase().toCharArray();
        char[] strB = b.toLowerCase().toCharArray();
        Arrays.sort(strA);
        Arrays.sort(strB);

        for (int i = 0; i < strA.length; i++) {
            String A = strA[i] + "";
            String B = strB[i] + "";
            if (!A.equalsIgnoreCase(B)) {
                return false;
            }
        }
        return true;
    }

    private static boolean solutionFour(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.isEmpty() && b.isEmpty())
            return true;
        else {
            char c = a.charAt(0);
            return b.contains(String.valueOf(c)) && solutionFour(a.substring(1), b.replaceFirst(String.valueOf(c), ""));
        }
    }
}
