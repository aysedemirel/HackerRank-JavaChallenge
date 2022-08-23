package org.ayse.hackerrank.java.introduction;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.LocalDate;

/**
 * Input example: 02 08 2020 </br> Output: SATURDAY </br>
 * <p>
 * It is a tool to get the day of week. </br>
 *
 * @author aysedemirel
 */
class Result {

  /*
   * Complete the 'findDay' function below.
   *
   * The function is expected to return a STRING. The function accepts following parameters: 1.
   * INTEGER month 2. INTEGER day 3. INTEGER year
   */
  // LocalDate is for java 8
  public static String findDay(int month, int day, int year) {
    LocalDate localDate = LocalDate.of(year, month, day);
    return localDate.getDayOfWeek().toString();
  }
}


public class DateAndTime {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int month = Integer.parseInt(firstMultipleInput[0]);

    int day = Integer.parseInt(firstMultipleInput[1]);

    int year = Integer.parseInt(firstMultipleInput[2]);

    String res = Result.findDay(month, day, year);

    bufferedWriter.write(res);
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
