package DSAAlgoPrep;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter budget: ");
        int budget = scanner.nextInt();
        if (budget >= 10000) {
            System.out.println("goa");
        }
        else {
            System.out.println("murthal");
        }
    }
}
