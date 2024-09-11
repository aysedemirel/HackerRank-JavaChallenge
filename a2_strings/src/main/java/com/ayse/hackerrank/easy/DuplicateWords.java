package com.ayse.hackerrank.easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Sample input: 5 <br> Goodbye bye bye world world world<br> Sam went went to to to his
 * business<br> Reya is is the the best player in eye eye game<br> in inthe <br> Hello hello Ab aB
 * <p>
 * Sample output: Goodbye bye world<br> Sam went to his business<br> Reya is the best player in eye
 * game<br> in inthe<br> Hello Ab<br>
 *
 * @author aysedemirel
 */
public class DuplicateWords {

  public static void main(String[] args) {

    /*
     * \b : Start of a word boundary
     *
     * \w+ : Any number of word characters
     *
     * (\s+\1\b)* : Any number of space followed by word which matches the previous word and ends
     * the word boundary. Whole thing wrapped in * helps to find more than one repetitions.
     */
    String regex = "\\b(\\w+)(\\s+\\1\\b)*";
    Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

    Scanner in = new Scanner(System.in);
    int numSentences = Integer.parseInt(in.nextLine());

    while (numSentences-- > 0) {
      String input = in.nextLine();

      Matcher m = p.matcher(input);

      // Check for subsequences of input that match the compiled pattern
      while (m.find()) {
        input = input.replaceAll(m.group(0), m.group(1));
      }

      // Prints the modified sentence.
      System.out.println(input);
    }

    in.close();
  }
}
