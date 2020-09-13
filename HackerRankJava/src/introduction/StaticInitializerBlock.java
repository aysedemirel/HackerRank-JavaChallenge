package introduction;

import java.util.Scanner;

/**
 * Static example in java
 * 
 * @author aysedemirel
 */
public class StaticInitializerBlock {
  private static Scanner scanner = new Scanner(System.in);
  private static int B;
  private static int H;
  private static boolean flag = false;

  static {
    B = scanner.nextInt();
    H = scanner.nextInt();
    try {
      if (B <= 0 || H <= 0) {
        throw new Exception("Breadth and height must be positive");
      } else {
        flag = true;
      }
    } catch (Exception e) {
      System.out.println(e);
      flag = false;
    }
  }


  public static void main(String[] args) {
    if (flag) {
      int area = B * H;
      System.out.print(area);
    }
  }// end of main
}
