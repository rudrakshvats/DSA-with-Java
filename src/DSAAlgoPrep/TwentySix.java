package DSAAlgoPrep;

import java.util.Scanner;

public class TwentySix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        Integer[] intArray = new Integer[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            intArray[i] = scanner.nextInt();
        }
        System.out.println(getElementsGreater(intArray));
    }

    private static Integer getElementsGreater(Integer[] intArray) {
        int elementCount = 0;
        int i = 0;
        while (i < intArray.length) {
            int element = intArray[i];
            for (Integer integer : intArray) {
                if (integer > element) {
                    elementCount += 1;
                    break;
                }
            }
            i += 1;
        }
        return elementCount;
    }
}
