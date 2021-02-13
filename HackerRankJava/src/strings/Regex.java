package strings;

import java.util.Scanner;

/**
 * IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0
 * to 255. Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.
 * 
 * @author aysedemirel
 */
public class Regex {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
      String IP = in.next();
      System.out.println(IP.matches(new MyRegex().pattern));
    }
    in.close();
  }
}


class MyRegex {
  private final String ONE_OR_TWO_DIGIT = "\\d{1,2}"; // one or two digit is fine
  private final String THREE_DIGIT_WITH_0_1 = "(0|1)\\d{2}"; // If it starts with 0 or 1 than
                                                             // pattern expects 2 digit (2 digit ok)
  private final String NUMBER_200_TO_249 = "2[0-4]\\d"; // detects for 200 to 249
  private final String NUMBER_250_TO_255 = "25[0-5]"; // detects for 250 to 255, biger than 255 is
                                                      // not accepted
  private final String ZERO_TO_255 = "(" + ONE_OR_TWO_DIGIT + "|" + THREE_DIGIT_WITH_0_1 + "|"
      + NUMBER_200_TO_249 + "|" + NUMBER_250_TO_255 + ")";
  private final String SEPERATE = "\\.";
  private final String GROUP = ZERO_TO_255 + SEPERATE; // Example -> 255. or 12. or 1.

  public final String pattern = GROUP + GROUP + GROUP + ZERO_TO_255; // Last one doesn't have a
                                                                     // seperate item

  public MyRegex() {}
}
