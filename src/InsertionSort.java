import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        Integer[] intArray = new Integer[]{20, 35, -15, 7, 55, 1 , -22};

        /*
        first we will traverse the intArray, we will go from left to right in our array. Here we will assign the
        firstUnsortedIndex to value 1 because we are considering our intArray to be two types of array, first
        an unsorted array which has its starting position 1 and a sorted array of just element starting at
        position 0
         */
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            /*
            our newElement will always be the one which is at the firstUnsortedIndex so that we can check if that
            element can be inserted for our sortedArray
             */
            int newElement = intArray[firstUnsortedIndex];
            /*
            taking a variable for traversal as this index will be used for the traversal and insertion of the
            newElement within our sortedArray if required
             */
            int i;
            /*
            within this traversal, we will again traverse our sortedArray from right to left to check and
            insert newElement to its correct position if required
             */
            /*
            in this check, we will assign i value to the firstUnsortedIndex because we want to traverse from the
            first position of the unsorted array, then we will check if this element is not at the front of the
            intArray i.e. not at position 0 and then we will also check that is the newElement less than or equal
            to the element at position i - 1, since we are going from right to left thus we are decrementing value
            of i
             */
            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--){
                intArray[i] = intArray[i - 1]; /* shifting the element from left to right if our newElement is
                less than element at i - 1
                */
                /*
                as soon as we we hit i = 0 we will break from this loop and then assign the newElement to the
                position of i
                 */
            }

            intArray[i] = newElement;
        }

        System.out.println(Arrays.toString(intArray));
    }
}
