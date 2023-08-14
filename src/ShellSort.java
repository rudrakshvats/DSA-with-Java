import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        Integer[] intArray = {20, 35, -15, 7, 55, 1, -22};

        /*
        loop for initialising and using gap
         */
        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {
            /*
            loop for using gap value and insertion
             */
            for (int i = gap; i < intArray.length; i++) {
                /*
                put the element at gap element inside variable newElement
                 */
                int newElement = intArray[i];
                /*
                j will be used to traverse the array until gap value reaches 0
                 */
                int j = i;

                /*
                loop which will check gap value and compare it with element to be inserted
                 */
                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }

                /*
                insert new element to position j
                 */
                intArray[j] = newElement;
            }
        }

        System.out.println(Arrays.toString(intArray));
    }
}
