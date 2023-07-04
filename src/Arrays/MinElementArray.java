package Arrays;

import java.util.Scanner;

public class MinElementArray {

    /**
     * Program to print the minimum element of an integer array
     * @param args
     */
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array");
        int arraySize = scanner.nextInt();
        Integer[] integerArray = new Integer[arraySize];
        System.out.print("Enter the elements of the array");
        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = scanner.nextInt();
        }
        int minimumElementPosition = 0;
        for (int i = 0; i < integerArray.length; i++) {
            int number = integerArray[i];
            if (number < integerArray[minimumElementPosition]) {
                minimumElementPosition = i;
            }
        }

        System.out.print("Minimum element of the array is " + integerArray[minimumElementPosition]);
    }
}
