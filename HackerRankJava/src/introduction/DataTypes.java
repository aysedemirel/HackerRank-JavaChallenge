package introduction;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * It is an example to find your input's type. </br>
 * Type are byte, short, int, float, double, long
 * 
 * @author aysedemirel
 */
public class DataTypes {
  private static Scanner scannerIn = new Scanner(System.in);
  private ArrayList<String> resultStr;

  public DataTypes() {
    int t = scannerIn.nextInt();
    resultStr = new ArrayList<>();
    getNumberFromUser(t);
    printResult();
  }

  private void getNumberFromUser(int number) {
    for (int i = 0; i < number; i++) {
      try {
        long x = scannerIn.nextLong();
        resultStr.add(x + " can be fitted in:");
        if (x >= -128 && x <= 127) {
          resultStr.add("* byte");
        }
        if (x >= -32768 && x <= 32767) {
          resultStr.add("* short");
        }
        if (x >= -2147483648 && x <= 2147483647) {
          resultStr.add("* int");
        }
        if (x >= -9223372036854775808L && x <= 9223372036854775807L) {
          resultStr.add("* long");
        }
        if (x <= 340282347 * Math.pow(10, 38) && x >= 140239846 * Math.pow(10, -45)) {
          resultStr.add("* float");
        }
        if (x <= 17976931348623157L * Math.pow(10, 308)
            && x >= 49406564584124654L * Math.pow(10, -324)) {
          resultStr.add("* double");
        }
      } catch (Exception e) {
        resultStr.add(scannerIn.next() + " can't be fitted anywhere.");
      }
    }
  }

  private void printResult() {
    for (String result : resultStr) {
      System.out.println(result);
    }
  }

  public static void main(String[] args) {
    new DataTypes();
  }
}
