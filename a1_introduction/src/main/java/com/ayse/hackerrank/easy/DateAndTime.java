package com.ayse.hackerrank.easy;

import java.io.*;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;

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
    // Solution with Calendar
    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.DAY_OF_MONTH, day);
        // Month is 0-based in Calendar, so subtract 1
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.YEAR, year);

        // or you can set all of them directly
        //calendar.set(year, month - 1, day);

        return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH).toUpperCase();
    }

    // Solution with LocalDate
    public static String findDayByLocalDate(int month, int day, int year) {
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
