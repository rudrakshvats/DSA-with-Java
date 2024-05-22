package DSAAlgoPrep;

import java.util.Scanner;

public class Thirteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int spaces = number / 2;
        int prints = 1;
        int temp = 1;
        for (int i = 1; i <= 5; i++) {
            int numberToPrint = temp;
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= prints; j++) {
                System.out.print(numberToPrint + "\t");
                if (j <= prints / 2) {
                    numberToPrint += 1;
                }
                else {
                    numberToPrint -= 1;
                }
            }
            if (i <= number / 2) {
                spaces -= 1;
                prints += 2;
                temp += 1;
            }
            else {
                spaces += 1;
                prints -= 2;
                temp -= 1;
            }
            System.out.println();
        }
    }
}
