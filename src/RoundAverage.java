import java.util.Scanner;

public class RoundAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int length = scanner.nextInt();
        int[] intArray = new int[length];
        for (int i = 0; i < length; i++) {
            intArray[i] = scanner.nextInt();
        }

        System.out.print(getRoundAverage(intArray));
    }

    private static String getRoundAverage(int[] intArray) {
        int sum = 0;
        for (int j : intArray) {
            sum += j;
        }
        double average = (double) sum / intArray.length;

        return String.format("%.2f", average);
    }
}
