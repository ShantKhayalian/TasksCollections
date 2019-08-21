package ArraySection.ArrayTasks;

import java.util.Random;

/**
 * մեծագույն և փոքրագույն տարրերի գումարը
 * The max and the min of given array
 *
 * @author Shant
 * @apiNote This task is for learning purposes only
 */
public class Task0110 {
    private static final int ARRAY_NUMBER = 10;

    public static void main(String[] args) {
        Random random = new Random();
        int[] myArray = new int[ARRAY_NUMBER];

        //Adding random numbers to the array
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100) - 50;
            System.out.print(myArray[i] + " , ");
        }

        //Adding logical operations to the array
        int sum = 0;
        int max = myArray[0];
        int min = myArray[0];
        for (int i = 1; i < myArray.length - 1; i++) {
            if (max < myArray[i + 1]) {
                max = myArray[i + 1];
            } else if (min > myArray[i + 1]) {
                min = myArray[i + 1];
            }
        }
        sum = (max + min);
        System.out.println();
        System.out.println("The maximum number is : " + max);
        System.out.println("The maximum number is : " + min);
        System.out.println("The sum is : " + sum);
    }
}
