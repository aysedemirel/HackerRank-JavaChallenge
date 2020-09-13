package introduction;

import java.util.Scanner;

/**
 * <p>
 * Get a number from user and calculate multiplication in range [1,10]
 * </p>
 * 
 * @author aysedemirel
 */
public class LoopsI {
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int N = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    while (N < 2 || N > 20) {
      N = scanner.nextInt();
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    }
    for (int i = 1; i <= 10; i++) {
      String output = String.format("%d x %d = %d", N, i, N * i);
      System.out.println(output);
    }
    scanner.close();
  }
}
