package DSAAlgoPrep;

import java.util.Scanner;

public class TwentyFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        Integer[] array = new Integer[numberOfElements];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        Integer firstIndex = scanner.nextInt();
        Integer secondIndex = scanner.nextInt();
        reversePartOfArray(array, firstIndex, secondIndex);
    }

    private static void reversePartOfArray(Integer[] array, Integer firstIndex, Integer secondIndex) {
        for (int i = 0; i < firstIndex; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = secondIndex; i >= firstIndex; i--) {
            System.out.print(array[i] + " ");
        }
        for (int i = secondIndex + 1; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
