package DSAAlgoPrep;

import java.util.Scanner;

public class TwentyOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        Integer max = 0;
        for (int i = 0; i < sizeOfArray; i++) {
            int element = scanner.nextInt();
            if (element > max) {
                max = element;
            }
        }
        System.out.println(max);
    }
}
