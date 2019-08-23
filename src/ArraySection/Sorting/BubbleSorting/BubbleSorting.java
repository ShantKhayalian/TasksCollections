package ArraySection.Sorting.BubbleSorting;

import java.util.Random;

public class BubbleSorting {
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArray = new int[10];
        int temp = 0;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100) - 50;
            System.out.print(myArray[i] + " , ");
        }
        System.out.println();
        for (int i = 0; i <myArray.length; i++) {
            for (int j = 0; j < myArray.length - 1; j++) {
                if (myArray[i] < myArray[j]) {
                    temp = myArray[j];
                    myArray[j] = myArray[i];
                    myArray[i] = temp;
                }
            }
        }
        for (int i : myArray) {
            System.out.print(i + ", ");
        }
    }
}
