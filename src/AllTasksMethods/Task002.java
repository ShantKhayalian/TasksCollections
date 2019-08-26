package AllTasksMethods;

import java.util.Scanner;

public class Task002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter first number :");
        int firstNumber = scanner.nextInt();
        System.out.println("please enter second number :");
        int secondNumber = scanner.nextInt();
        System.out.println("please enter third number :");
        int thirdNumber = scanner.nextInt();

        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            System.out.println("The smallest number is the first number with value of " + firstNumber);
        } else if (secondNumber < thirdNumber) {
            System.out.println("The smallest number is the second number with value of " + secondNumber);
        } else {
            System.out.println("The smallest number is the third number with value of " + thirdNumber);
        }
    }
}
