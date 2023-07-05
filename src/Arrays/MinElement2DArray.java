package Arrays;

import java.util.Scanner;

public class MinElement2DArray {
    /**
     * Consider 2D array as a matrix with n rows and m columns, so the total elements of the 2D array will have n*m
     * elements just like matrix. This program returns the minimum element of the 2D array.
     * @param args
     */
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the rows of the 2D array");
        int rows = scanner.nextInt();
        System.out.println("Enter the columns of the 2D array");
        int columns = scanner.nextInt();
        Integer[][] integerArray = new Integer[rows][columns];
        System.out.println("Enter the " + rows * columns + " elements of the 2D array");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                integerArray[i][j] = scanner.nextInt();
            }
        }
        int minElementPositionRow = 0;
        int minElementPositionColumn = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int number = integerArray[i][j];
                if (number < integerArray[minElementPositionRow][minElementPositionColumn]) {
                    minElementPositionRow = i;
                    minElementPositionColumn = j;
                }
            }
        }

        System.out.println("Minimum element of the 2D array is " + integerArray[minElementPositionRow][minElementPositionColumn]);
    }
}
