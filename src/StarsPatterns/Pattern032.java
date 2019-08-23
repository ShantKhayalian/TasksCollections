package StarsPatterns;

import java.util.Scanner;

public class Pattern032 {

    public static void main(String[] args) {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed to in the pattern ");

        int rows = scanner.nextInt();
        System.out.println("## Printing the pattern ##");

        // Print i number of stars
        for (int i = 1; i <= (rows * 2 - 1); i++) {
            for (int j = 1; j <= rows; j++) {
                if (j == i || j == rows - i + 1) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

