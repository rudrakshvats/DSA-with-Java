package DSAAlgoPrep;

import java.util.Scanner;

public class TwentyFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        Integer[] array = new Integer[numberOfElements];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        Integer index = scanner.nextInt();
        rotateArray(array, index);
    }

    private static void rotateArray(Integer[] array, Integer index) {
        for (int i = index + 1; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i <= index; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
