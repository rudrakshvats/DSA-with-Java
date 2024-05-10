package DSAAlgoPrep;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();
        if (marks >= 35) {
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }
    }
}
