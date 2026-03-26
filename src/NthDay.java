import java.util.Scanner;

public class NthDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day of the week in int value from 0 to 6: ");
        int d = scanner.nextInt();
        System.out.print("Enter the days to be subtracted from d: ");
        int n = scanner.nextInt();
        System.out.print(getNthDay(d, n));
    }

    private static int getNthDay(int d, int n) {
        if (n <= d) {
            return d - n;
        }
        int daysToBeSubtractedFrom7 = n % 7;
        for (int i = 1; i < daysToBeSubtractedFrom7; i++) {
            if (d == 0) {
                d = 6;
            }
            d -= 1;
        }

        return d;
    }
}
