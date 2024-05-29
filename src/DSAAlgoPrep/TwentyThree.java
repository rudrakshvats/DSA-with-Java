package DSAAlgoPrep;

import java.util.Scanner;

public class TwentyThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        Integer[] array = new Integer[numberOfElements];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        reverseArray(array);
    }

    private static void reverseArray(Integer[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
