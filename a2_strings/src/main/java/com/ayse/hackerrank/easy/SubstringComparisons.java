package com.ayse.hackerrank.easy;

import java.util.*;

/**
 * Return the respective lexicographically smallest and largest substrings as a single
 * newline-separated string.
 *
 * @author aysedemirel
 */
public class SubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        for (int i = 0; i <= s.length() - k; i++) {
            String subStr = s.substring(i, i + k);
            if (subStr.compareTo(smallest) < 0 || smallest.isEmpty()) {
                smallest = subStr;
            }
            if (subStr.compareTo(largest) > 0 || largest.isEmpty()) {
                largest = subStr;
            }
        }
        return smallest + "\n" + largest;
    }

    public static String getSmallestAndLargestList(String s, int k) {
        List<String> substrings = new ArrayList<>();
        for (int i = 0; i <= s.length() - k; i++) {
            // Add a substring of length 'k' to our list
            substrings.add(s.substring(i, i + k));
        }
        // Sort list
        Collections.sort(substrings);

        // Set first and last elements as smallest and largest
        String smallest = substrings.get(0);
        String largest = substrings.get(substrings.size() - 1);

        return smallest + "\n" + largest;
    }

    public static String getSmallestAndLargestArray(String s, int k) {
        // Because each substring has length 'k', we know the number of possible substrings
        String[] substrings = new String[s.length() - k + 1];

        for (int i = 0; i <= s.length() - k; i++) {
            // Add a substring of length 'k' to our array
            substrings[i] = s.substring(i, i + k);
        }

        // Sort array
        Arrays.sort(substrings);

        // Set first and last elements as smallest and largest
        String smallest = substrings[0];
        String largest = substrings[substrings.length - 1];

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
