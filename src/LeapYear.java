import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int num = scanner.nextInt();
        if (String.valueOf(num).length() != 4) {
            System.out.print("Enter a 4 digit year!");
        } else {
            // a leap year is a year which is divisible by 4, except for those years which are which are divisible by 400 but not 100
            // eg: 1600, 1200, 2000
            if ((num % 4 == 0 && num % 100 != 0) || num % 400 == 0) {
                System.out.print("True");
            } else {
                System.out.print("False");
            }
        }
    }
}
