package introduction;

import java.util.Scanner;

/**
 * <p>
 * Basic scanner example in a loop.<br>
 * Scanner is to get input from users
 * </p>
 * 
 * @author aysedemirel
 */
public class StdinAndStdoutI {

  private static Scanner scanner = new Scanner(System.in);
  private static final int LOOP_NUMBER = 3;

  public StdinAndStdoutI() {
    for (int i = 0; i < LOOP_NUMBER; i++) {
      int myInt = scanner.nextInt();
      System.out.println(myInt);
    }
    scanner.close();
  }

  public static void main(String[] args) {
    new StdinAndStdoutI();
  }
}
