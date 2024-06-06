package DSAAlgoPrep;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            int rev = n % 10;
            System.out.print(rev);
            n = n / 10;
        }
    }
}
