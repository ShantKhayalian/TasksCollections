package ArraySection.ArrayTasks;

public class Task0116 {
    public static void main(String[] args) {
        int[] myArray = {10, 2, 25, 4, 2, 25, 30};
        int min = myArray[0];
        int index = 0;
        for (int i = 1; i < myArray.length; i++) {
            // index = min > myArray[i] ? i : 0;
            if (min > myArray[i]) {
                min = myArray[i];
                index = i;
            }
        }
        System.out.println(min + " " + index);
    }
}
