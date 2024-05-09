package DSAAlgoPrep;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();
        if (marks >= 35) {
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }
    }
}
