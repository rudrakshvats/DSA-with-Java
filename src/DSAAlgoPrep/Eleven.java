package DSAAlgoPrep;

import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int spaces = number / 2;
        int stars = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            if (i <= number / 2) {
                spaces -= 1;
                stars += 2;
            }
            else {
                spaces += 1;
                stars -= 2;
            }
            System.out.println();
        }
    }
}
