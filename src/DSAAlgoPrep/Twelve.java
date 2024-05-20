package DSAAlgoPrep;

import java.util.Scanner;

public class Twelve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int stars = (number / 2) + 1;
        int spaces = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            if (i <= number / 2) {
                stars -= 1;
                spaces += 2;
            }
            else {
                stars += 1;
                spaces -= 2;
            }
            System.out.println();
        }
    }
}
