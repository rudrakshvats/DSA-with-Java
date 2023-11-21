package Patterns;

public class PepCodingPattern4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*\t");
            }
            System.out.print("\n");
        }
    }
}
