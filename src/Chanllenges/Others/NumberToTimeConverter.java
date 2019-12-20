package Chanllenges.Others;

/**
 * Java program to convert given number of seconds to hours, minutes and second
 * <p>
 * In this java program, we are reading number of seconds from the user and converting the seconds into hours,
 * minutes and seconds and printing in HH:MM:SS format.
 * Submitted by Chandra Shekhar, on February 03, 2018
 * <p>
 * Given seconds and we have to convert it into hours, minutes and seconds using java program.
 * <p>
 * Example:
 * <p>
 * Input:
 * Input seconds: 6530
 * Output:
 * HH:MM:SS  - 1:48:50
 * <p>
 * Test: Convert HH:MM:SS to seconds again,
 * 1*60*60 + 48*60 + 50 = 3660 + 2880 + 50 = 6530
 */

import java.util.Scanner;

public class NumberToTimeConverter {

    public static void main(String[] args) {
        // create object of scanner class.
        Scanner in = new Scanner(System.in);

        // enter the seconds here.
        System.out.print("Enter seconds : ");

        int seconds = in.nextInt();

        int p1 = seconds % 60;
        int p2 = seconds / 60;
        int p3 = p2 % 60;

        p2 = p2 / 60;

        System.out.print("HH:MM:SS - " + p2 + ":" + p3 + ":" + p1);
        System.out.print("\n");
    }
}

