package DSAAlgoPrep;

import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int printNumber = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(printNumber + "\t");
                printNumber += 1;
            }
            System.out.println();
        }
    }
}
