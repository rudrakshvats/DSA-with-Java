package Patterns;

public class PepCodingPattern3 {
    public static void main (String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.print("\n");
        }
    }
}
