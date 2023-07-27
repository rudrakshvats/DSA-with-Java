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
        System.out.println("Sorted Array: " + Arrays.toString(sortTechnique2(intArray)));
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

    /**
     * In this sort technqiue, we take three indices first unsortedHighestIndex,
     * second traverseIndex and third largestIndex. In every pass we will assume
     * that the element at index 0 is the highest element and then check if that
     * element is greater than the next index element, if yes then we will swap
     * both of them until we reach the front of the array. After reaching the front
     * of the array we will complete our first pass and then largest element is
     * at the front of the array. Then reassign the largestIndex to 0, and
     * decrement the unsortedHighestIndex value by 1
     * @param intArray
     * @return
     */

    private static Integer[] sortTechnique2(Integer[] intArray) {
        int unsortedHighestIndex = intArray.length - 1;
        int traverseIndex;
        int largestElementIndex = 0;

        for (int i = 0; i < unsortedHighestIndex; i++) {
            traverseIndex = i + 1;
            if (intArray[largestElementIndex] > intArray[traverseIndex]) {
                swapElements(intArray, largestElementIndex, traverseIndex);
                largestElementIndex = traverseIndex;
            }

            if (traverseIndex == unsortedHighestIndex) {
                largestElementIndex = 0;
                unsortedHighestIndex -= 1;
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
