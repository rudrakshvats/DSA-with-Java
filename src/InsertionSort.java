public class InsertionSort {
    public static void main(String[] args){
        Integer[] intArray = new Integer[]{20, 35, -15, 7, 55, 1 , -22};

        /*
        first we will traverse the intArray, we will go from left to right in our array
         */
        for (int i = intArray.length - 1; i > 0; i--) {
            int largest = 0;
            /*
            within this traversal, we will again traverse our intArray from left to right to check and
            update the largest element and then swap it if needed
             */
            for (int j = 1; j <= i; j++){
                if (intArray[j] > intArray[i]) {

                }
            }
        }
    }
}
