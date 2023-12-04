package PepCoding.Patterns;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        System.out.print("Enter a number to print the pattern: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i <= n; i++) {
            int iCj = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(iCj + "\t");
                /*
                Using the formula
                nCrp1 = nCr * (n - r) / r + 1;
                where nCr = n!/(r! * (n - r)!)
                abd nCrp1 = n!/((r + 1)! * (n - r - 1)!)
                Here, rp1 = r + 1
                 */
                iCj = iCj * (i - j) / (j + 1);
            }
            System.out.print("\n");
        }
    }
}
