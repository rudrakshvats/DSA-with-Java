package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        /**
         * Program to sort elements one dimensional integer array
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        Integer[] intArray = new Integer[scanner.nextInt()];
        System.out.print("Enter the integer elements of the array: ");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }
        System.out.println("Sorted Array: " + Arrays.toString(sortTechnique1(intArray)));
    }

    /**
     * In this method we will traverse the intArray from left to right and one by one
     * place the highest element to the right of the sorted array so that we have an
     * ascending sorted array
     * @param intArray
     * @return
     */
    private static Integer[] sortTechnique1(Integer[] intArray) {
        int highestUnsortedIndex = intArray.length - 1;
        int b = 0;
        /*
        here i will be used for traversing the array from left to right
        {1, 9, -6, 7, 8, 3}
         */
        for (int i = 0; i < highestUnsortedIndex; i++) {
            if (intArray[i] > intArray[i + 1]) {
                swapElements(intArray, i, i + 1);
            }
            b += 1;

            /*
            check if we have reached to the end of the array
             */
            if (b == highestUnsortedIndex) {
                highestUnsortedIndex -= 1;
                i = -1;
            }
        }

        return intArray;
    }

    private static void swapElements(Integer[] intArray, int i, int firstUnsortedIndex) {
        int temp = intArray[i];
        intArray[i] = intArray[firstUnsortedIndex];
        intArray[firstUnsortedIndex] = temp;
    }
}
