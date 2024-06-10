package DSAAlgoPrep;

import java.util.Scanner;

public class TwoSumBrute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        Integer[] intArray = new Integer[numberOfElements];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }
        Integer sumOfPair = scanner.nextInt();
        System.out.println(checkIfTwoSumPairExists(intArray, sumOfPair));
    }

    private static boolean checkIfTwoSumPairExists(Integer[] intArray, Integer sumOfPair) {
        int i = 0;
        while (i < intArray.length) {
            Integer element = intArray[i];
            for (int j = 0; j < intArray.length; j++) {
                if (i != j && (element + intArray[j] == sumOfPair)) {
                        return true;
                }
            }
            i += 1;
        }
        return false;
    }
}
