package com.ayse.hackerrank.easy;

/**
 * Complete the code in your editor by writing an overridden getNumberOfTeamMembers method that
 * prints the same statement as the superclass' getNumberOfTeamMembers method, except that it
 * replaces n with 11 (the number of players on a Soccer team).
 *
 * @author aysedemireldeniz
 */
public class MethodOverride {

    public MethodOverride() {
        Sports c1 = new Sports();
        Soccer c2 = new Soccer();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
    }

    public static void main(String[] args) {
        new MethodOverride();
    }

    class Sports {

        String getName() {
            return "Generic Sports";
        }

        void getNumberOfTeamMembers() {
            System.out.println("Each team has n players in " + getName());
        }
    }

    class Soccer extends Sports {

        @Override
        String getName() {
            return "Soccer Class";
        }

        // Write your overridden getNumberOfTeamMembers method here
        @Override
        void getNumberOfTeamMembers() {
            System.out.println("Each team has 11 players in " + getName());
        }
    }
}
