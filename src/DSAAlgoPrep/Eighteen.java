package DSAAlgoPrep;

import java.util.Scanner;

public class Eighteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int num1 = 0;
        int num2 = 1;
        if (number == 0) {
            System.out.println(0);
        }
        if (number == 1) {
            System.out.println(1);
        }
        for (int i = 2; i <= number; i++) {
            int next = num1 + num2;
            num1 = num2;
            num2 = next;
            if (i == number) {
                System.out.println(next);
            }
        }
    }
}
