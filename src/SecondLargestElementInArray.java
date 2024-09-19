/**

Given an array of integers.
Write a program that finds the second-largest element present in the array.

Input: arr[] = {12, 35, 1, 10, 34, 1}
Output: The second largest element is 34.
Explanation: The largest element of the array is 35 and the second largest element is 34
Input: arr[] = {10, 5, 10}
Output: The second largest element is 5.
Explanation: The largest element of the array is 10 and the second largest element is 5


 **/
import java.util.*;

public class SecondLargestElementInArray {
    public static void main(String[] args) {

        Integer[] intArray = {12, 35, 1, 10, 34, 1};
        Integer[] secondIntArray = {10, 5, 10};
        findSecondLargestElement(intArray);
        findSecondLargestElement(secondIntArray);

    }

    private static void findSecondLargestElement(Integer[] intArray) {
        Set<Integer> integerSet = new HashSet<>(Arrays.asList(intArray));
        int largestElement = Collections.max(integerSet);
        integerSet.remove(largestElement);

        System.out.println("The second largest element is " + Collections.max(integerSet));
    }
}
