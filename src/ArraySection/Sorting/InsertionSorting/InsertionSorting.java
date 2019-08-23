package ArraySection.Sorting.InsertionSorting;

import java.util.Arrays;

public class InsertionSorting {
    public static void main(String[] args) {
        int[] input = {6, 2, 3, 4, 5, 1};
        System.out.print(Arrays.toString(input) + " , ");
        insertionSortImperative(input);
        System.out.print(Arrays.toString(input) + " , ");
        System.out.println();
    }

    private static void insertionSortImperative(int[] input) {
        for (int i = 1; i < input.length; i++) {
            int key = input[i];
            int j = i - 1;
            while (j >= 0 && input[j] > key) {
                input[j + 1] = input[j];
                j = j - 1;
            }
            input[j + 1] = key;
        }
    }
}
