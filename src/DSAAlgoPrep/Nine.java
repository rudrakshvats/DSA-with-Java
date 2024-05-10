package DSAAlgoPrep;

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 0 || number == 1) {
            System.out.println("not prime");
        }
        else if (number < 0) {
            System.out.println("not prime");
        }
        else {
            if (number == 2 || number == 3) {
                System.out.println("prime");
            }
            else if (number % 2 != 0 && number % 3 != 0) {
                System.out.println("prime");
            }
            else {
                System.out.println("not prime");
            }
        }
    }
}
