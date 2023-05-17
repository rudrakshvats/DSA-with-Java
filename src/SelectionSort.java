import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] intArray = {5, 7, 1, -9, 6};

        int lastUnsortedIndex = intArray.length - 1;
        int traverseIndex;
        int largestIndex = 0;

        for (int i = 0; i <= intArray.length; i++){
            traverseIndex = i + 1;
            if (intArray[traverseIndex] > intArray[largestIndex]){
                largestIndex = traverseIndex;
            }
            if (traverseIndex == lastUnsortedIndex){
                swapElements(intArray, largestIndex, lastUnsortedIndex);
                lastUnsortedIndex -= 1; // decrementing because largest element has been swapped at the lastUnsortedIndex
                if (lastUnsortedIndex == 0){
                    break;
                }
                i = -1;
                largestIndex = 0; // again assign value 0 because we want to start from the starting index of the array
            }
        }

        System.out.println(Arrays.toString(intArray));
    }

    public static void swapElements(int[] intArray, int i, int j){
        if (i == j){
            return;
        }

        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }
}
