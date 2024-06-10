package DSAAlgoPrep;

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 0 || number == 1) {
            System.out.println("Not Prime");
        }
        else if (number < 0) {
            System.out.println("Not Prime");
        }
        else {
            boolean isPrime = false;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = true;
                }
            }
            if (isPrime) {
                System.out.println("Not Prime");
            }
            else {
                System.out.println("Prime");
            }
        }
    }
}
