package DSAAlgoPrep;

import java.util.Scanner;

public class Twenty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < sizeOfArray; i++) {
            int element = scanner.nextInt();
            sum += element;
        }
        System.out.println(sum);
    }
}
