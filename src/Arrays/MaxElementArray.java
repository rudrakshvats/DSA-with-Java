package Arrays;

import java.util.Scanner;

public class MaxElementArray {
    /**
     * Program to return the maximum element in an integer array
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array");
        int arraySize = scanner.nextInt();
        Integer[] integerArray = new Integer[arraySize];
        System.out.print("Enter the elements of the array");
        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = scanner.nextInt();
        }
        int maxElementPosition = 0;
        for (int i = 0; i < integerArray.length; i++) {
            Integer number = integerArray[i];
            if (number > integerArray[maxElementPosition]) {
                maxElementPosition = i;
            }
        }
        System.out.println("Maximum element of the array is: " + integerArray[maxElementPosition]);
    }
}
