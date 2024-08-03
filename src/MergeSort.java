import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        Integer[] array = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Array before sorting: " + Arrays.toString(array));
        mergeSort(array);
        System.out.print("Array after sorting: " + Arrays.toString(array));
    }

    private static void mergeSort(Integer[] array) {
        // since this will be our recursive function, so first we will provide the break condition for this method

        // what is our break condition? Break condition for merge sort will be the one where we cannot further split the array which means array will be empty or of size 1
        if (array.length < 2) {
            return;
        }

        // now we define the two arrays which we consider will be the two sub arrays of the parent array
        int midpoint = array.length / 2; // the point at which the array is going to split
        Integer[] leftArray = new Integer[midpoint];
        Integer[] rightArray = new Integer[array.length - midpoint];

        // next we will fill the leftArray and righArray with the elements from the parentArray
        for (int i = 0; i < midpoint; i++) {
            leftArray[i] = array[i];
        }
        for (int i = midpoint; i < array.length; i++) {
            rightArray[i - midpoint] = array[i];
        }

        // now the splitting part is done, but we don't know that we have fully split the array into one element array, so we will split the leftArray and rightArray also recursively for their sub arrays as well
        mergeSort(leftArray);
        mergeSort(rightArray);

        // now after splitting, we will merge the array but merging will be done on parent as well as child array, so we will pass them as parameters
        merge(array, leftArray, rightArray);
    }

    private static void merge(Integer[] array, Integer[] leftArray, Integer[] rightArray) {
        // now for merging we have to merge both leftArray elements and rightArray elements in such way that they merge in sorted order
        int leftArraySize = leftArray.length;
        int rightArraySize = rightArray.length;

        int i = 0, j = 0, k = 0; // i will be used for leftArray, j will be used for rightArray and k will be used for parent array

        // we will run the merge loop
        while (i < leftArraySize && j < rightArraySize) {
            // if left array element is small then it will be merged into parent array
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i += 1;
            }
            // if right array element is small then it will be merged into parent array
            else {
                array[k] = rightArray[j];
                j += 1;
            }
            k += 1;
        }

        // but for above case a situation will arise where either one element for leftArray or rightArray will be left which is the largest element so it will be merged into parent array
        while (i < leftArraySize) {
            array[k] = leftArray[i];
            i += 1;
            k += 1;
        }

        while (j < rightArraySize) {
            array[k] = rightArray[j];
            j += 1;
            k += 1;
        }
    }
}
