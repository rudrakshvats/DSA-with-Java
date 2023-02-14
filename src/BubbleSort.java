import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] intArray = {5, 10, -5, 9, 7 ,20};

        int unsortedHighestIndex = intArray.length - 1;
        int initialIndex = 0;

        for (int i = 0; i <= unsortedHighestIndex; i++){
            if (intArray[i] > intArray[i + 1]){
                swapElements(intArray, i, i + 1);
            }

            initialIndex += 1;

            if (unsortedHighestIndex == initialIndex){
                unsortedHighestIndex -= 1;
                i = -1;
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(intArray));
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
