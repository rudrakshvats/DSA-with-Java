package DSAAlgoPrep;

import java.util.Scanner;

public class Thirteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int spaces = number / 2;
        int prints = 1;
        int numberToPrint = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= prints; j++) {
                if (j <= number / 2) {
                    numberToPrint += 1;
                }
                else {
                    numberToPrint -= 1;
                }
                System.out.print(numberToPrint + "\t");
            }
            if (i <= number / 2) {
                spaces -= 1;
                prints += 2;
            }
            else {
                spaces += 1;
                prints -= 2;
            }
            System.out.println();
        }
    }
}
