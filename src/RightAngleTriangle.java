import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        triangle(n);
    }

    public static void triangle(int s) {
        // Write your code here
        for (int i = 1; i <= s; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == s) {
                    System.out.print("* ");
                } else {
                    if (j == 1 || j == i) {
                        System.out.print("* ");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
