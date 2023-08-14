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
        //System.out.println("Sorted Array: " + Arrays.toString(sortTechnique1(intArray)));
        //System.out.println("Sorted Array: " + Arrays.toString(sortTechnique2(intArray)));
        //System.out.println("Sorted Array: " + Arrays.toString(sortTechnique3(intArray)));
        System.out.println("Sorted Array: " + Arrays.toString(swapTechnique4(intArray)));
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
     * In this sorting technique, we will first iterate the loop from left to right, in the first iteration we will
     * assume that the firstElement is the lowestNumber and the index 0 is the lowestNumberIndex, now within each
     * iteration we will again run a loop to identify if there is any other element lower than the lowestNumber and if
     * we found any then we will consider that as lowestElement and the index at which the element is found will be
     * considered as lowestNumberIndex, after this inner loop is executed then we will swap lowestNumber with element
     * in outer loop.
     * @param intArray
     * @return
     */

    private static Integer[] sortTechnique2(Integer[] intArray) {
        for (int i = 0; i < intArray.length - 1; i++) {
            int lowestNumber = intArray[i];
            int lowestNumberIndex = i;
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[j] < lowestNumber) {
                    lowestNumber = intArray[j];
                    lowestNumberIndex = j;
                }
            }
            swapElements(intArray, i, lowestNumberIndex);
        }

        return intArray;
    }

    /**
     * In this sorting technique, our array will be traversed from left to right. First we will divide our array into
     * two parts: sorted array and unsorted array. The sorted array will always be at index 0 so consider that at the
     * beginning our array is sorted at index 0 and the unsorted array index starts from 1. Traverse through the
     * unsorted index and check if the element at unsortedLowestIndex 1 is less than array at sortedHighestIndex 0.
     * If yes then we shift the element at sortedHighestIndex to unsortedLowestIndex and insert the element at
     * sortedHighestIndex and then move to the next element to the right.
     * @param intArray
     * @return
     */
    private static Integer[] sortTechnique3(Integer[] intArray) {
        /*
        this loop is for traversing our intArray from left to right, and it is starting from index 1 because we consider
        that the first element of our array is sorted before our first iteration.
         */
        for (int i = 1; i < intArray.length; i++) {
            int nextElement = intArray[i];
            /*
            consider a variable j which will always be considered the element to the left of the element in traversal
            because we will compare our nextElement with element at index j and then shift if j is greater than equal
            to 0 and value of element at j is greater than nextElement
             */
            int j = i - 1;

            /*
            run another loop which will be used to compare the elements to the left of the nextElement and shift if
            the nextElement is greater than element at j.
             */
            while (j >= 0 && intArray[j] > nextElement) {
                /*
                shift the element to the right
                 */
                intArray[j + 1] = intArray[j];
                /*
                after shifting, make sure to decrement j so that we can traverse to the back of the array till index 0
                 */
                j--;
            }
            /*
            index j will now be at position where our nextElement needs to be inserted.
             */
            intArray[j + 1] = nextElement;
        }

        return intArray;
    }

    private static Integer[] swapTechnique4(Integer[] intArray) {
        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];
                int j = i;
                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }

                intArray[j] = newElement;
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
