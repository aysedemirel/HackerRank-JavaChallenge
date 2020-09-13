package introduction;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ctrl-Z is end of file command. </br>
 * If it is end of file, print the lines with line number.
 * 
 * @author aysedemirel
 */
public class EndOfFile {
  private static Scanner scanner;
  private ArrayList<String> results;

  public EndOfFile() {
    results = new ArrayList<>();
    getLinesFromUser();
  }

  private void getLinesFromUser() {
    scanner = new Scanner(System.in);
    int i = 0;
    while (scanner.hasNext()) {
      i++;
      results.add(i + " " + scanner.nextLine());
    }
    for (String resultLines : results) {
      System.out.println(resultLines);
    }
  }

  public static void main(String[] args) {
    new EndOfFile();
  }
}
