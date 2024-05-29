package DSAAlgoPrep;

import java.util.Scanner;

public class TwentyTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        Integer[] array = new Integer[numberOfElements];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        Integer firstIndex = scanner.nextInt();
        Integer secondIndex = scanner.nextInt();
        swapElements(array, firstIndex, secondIndex);
    }

    private static void swapElements(Integer[] array, Integer firstIndex, Integer secondIndex) {
        int temp = array[firstIndex];
        int firstIndexValue = array[secondIndex];
        array[firstIndex] = firstIndexValue;
        array[secondIndex] = temp;
        for (Integer integer : array) {
            System.out.print(integer + " ");
        }
    }
}
