package Switch;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of week");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println(number  + " is for Monday");
                break;
            case 2:
                System.out.println(number  + " is for Tuesday");
                break;
            case 3:
                System.out.println(number  + " is for Wednesday");
                break;
            case 4:
                System.out.println(number  + " is for Thursday");
                break;
            case 5:
                System.out.println(number  + " is for Friday");
                break;
            case 6:
                System.out.println(number  + " is for Saturday");
                break;
            case 7:
                System.out.println(number  + " is for Sunday");
                break;
            default:
                System.err.println(number  + " is for No such week day");
                break;
        }
    }
}
