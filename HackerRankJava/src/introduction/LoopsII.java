package introduction;

import java.util.Scanner;

/**
 * <p>
 * Get a query number from user, after that, get three inputs from user for number of query. <br>
 * print format: (a+2^0*b),(a+2^0*b+2^1*b)...(a+2^0*b+2^1*b+...+2^n-1*b)
 * </p>
 * 
 * @param q,a,b,n
 * @author aysedemirel
 */
public class LoopsII {
  private static Scanner scannerIn = new Scanner(System.in);
  private int a[] = new int[500];
  private int b[] = new int[500];
  private int n[] = new int[500];
  private int queryNumber;

  public LoopsII() {
    getNumbers();
    printResults();
  }

  private void getNumbers() {
    getQueryNumberFromUser();
    for (int i = 0; i < queryNumber; i++) {
      getAfromUser(i);
      getBfromUser(i);
      getNfromUser(i);
    }
    scannerIn.close();
  }

  private void getQueryNumberFromUser() {
    queryNumber = scannerIn.nextInt();
    while (queryNumber < 0 || queryNumber > 500) {
      System.out.println("Please enter query number in the range: [0,500]");
      queryNumber = scannerIn.nextInt();
    }
  }

  private void getAfromUser(int i) {
    a[i] = scannerIn.nextInt();
    while (a[i] < 0 || a[i] > 50) {
      System.out.println("Please enter a number in the range: [0,50]");
      a[i] = scannerIn.nextInt();
    }
  }

  private void getBfromUser(int i) {
    b[i] = scannerIn.nextInt();
    while (b[i] < 0 || b[i] > 50) {
      System.out.println("Please enter a number in the range: [0,50]");
      b[i] = scannerIn.nextInt();
    }
  }

  private void getNfromUser(int i) {
    n[i] = scannerIn.nextInt();
    while (n[i] < 0 || n[i] > 15) {
      System.out.println("Please enter a number in the range: [0,15]");
      n[i] = scannerIn.nextInt();
    }
  }

  private void printResults() {
    for (int i = 0; i < queryNumber; i++) {
      for (int j = 0; j < n[i]; j++) {
        int result = a[i];
        for (int k = 0; k <= j; k++) {
          result += Math.pow(2, k) * b[i];
        }
        System.out.print(result + " ");
      }
      System.out.println("");
    }
  }

  public static void main(String[] argh) {
    new LoopsII();
  }

}
