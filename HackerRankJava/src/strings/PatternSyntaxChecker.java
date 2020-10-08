package strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Input:The first line of input contains an integer , denoting the number of test cases. The next
 * lines contain a string of any printable characters representing the pattern of a regex.</br>
 * Output:For each test case, print Valid if the syntax of the given pattern is correct. Otherwise,
 * print Invalid. Do not print the quotes.
 * 
 * @author aysedemirel
 */
public class PatternSyntaxChecker {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int testCases = Integer.parseInt(in.nextLine());
    String[] inputs = new String[testCases];
    for (int i = 0; i < testCases; i++) {
      inputs[i] = in.nextLine();
    }
    for (int i = 0; i < testCases; i++) {
      try {
        Pattern.compile(inputs[i]);
        System.out.println("Valid");
      } catch (PatternSyntaxException e) {
        System.out.println("Invalid");
      }
    }
    in.close();
  }
}
