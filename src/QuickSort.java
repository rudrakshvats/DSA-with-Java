import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        Integer[] intArray = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Array before sorting: " + Arrays.toString(intArray));
        quickSort(intArray);
        System.out.println("Array after sorting " + Arrays.toString(intArray));
    }

    private static void quickSort(Integer[] intArray) {
        quickSort(intArray, 0, intArray.length - 1);
    }

    private static void quickSort(Integer[] intArray, Integer lowIndex, Integer highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }

        int pivot = intArray[highIndex];

        int leftPointer = lowIndex;
        int rightPointer = highIndex - 1;

        while (leftPointer < rightPointer) {
            while (leftPointer <= pivot && leftPointer < rightPointer) {
                leftPointer += 1;
            }
            while (leftPointer >= pivot && leftPointer < rightPointer) {
                rightPointer -= 1;
            }
            swap(intArray, leftPointer, rightPointer);
        }

        swap(intArray, leftPointer, highIndex);

        quickSort(intArray, lowIndex, leftPointer - 1);
        quickSort(intArray, lowIndex + 1, highIndex);
    }

    private static void swap(Integer[] intArray, Integer index1, Integer index2) {
        Integer temp = intArray[index1];
        intArray[index1] = intArray[index2];
        intArray[index2] = temp;
    }
}
