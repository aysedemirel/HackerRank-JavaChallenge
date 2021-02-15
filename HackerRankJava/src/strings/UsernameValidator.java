package strings;

import java.util.Scanner;


/**
 * If the username consists of less than 8 or greater than 30 characters, then it is an invalid
 * username. [a-z][A-Z][0-9][_] -> valid <br>
 * The first character of the username must be an alphabetic character <br>
 * 
 * @author aysedemirel
 */
class ValidUsername {
  public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}


public class UsernameValidator {
  private static final Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int n = Integer.parseInt(scan.nextLine());
    while (n-- != 0) {
      String userName = scan.nextLine();
      if (userName.matches(ValidUsername.regularExpression)) {
        System.out.println("Valid");
      } else {
        System.out.println("Invalid");
      }
    }
  }
}
