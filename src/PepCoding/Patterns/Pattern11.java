package PepCoding.Patterns;

public class Pattern11 {
    public static void main(String[] args) {
        int n = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n + "\t");
                n += 1;
            }
            System.out.print("\n");
        }
    }
}
