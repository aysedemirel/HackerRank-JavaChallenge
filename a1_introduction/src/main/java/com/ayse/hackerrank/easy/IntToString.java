package com.ayse.hackerrank.easy;

import java.security.Permission;
import java.util.Scanner;

/**
 * Get a integer from user. Add it in a string and parse the string like integer. If they are equal,
 * you did good job. Otherwise, wrong answer :)
 *
 * @author aysedemirel
 */
public class IntToString {

    public static void main(String[] args) {

        DoNotTerminate.forbidExit();

        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();
            // starting of the solution
            // You can choose one of the solutions

            // String s = "" + n;
            // String s = Integer.toString(n);
            String s = String.valueOf(n);

            // ending of the solution
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}


//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1;
    }
}