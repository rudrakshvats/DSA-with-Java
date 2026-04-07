import java.util.ArrayList;
import java.util.Arrays;

public class RootsOfQuadraticEquation {
    public static void main(String[] args) {
        System.out.print(Arrays.toString(findRootOfQuadraticEquations(1, -2, 1)));
    }

    /*
    A quadratic equation is of the form Ax^2 + Bx + C
    we can find roots by first calculating the determinant which is d = B^2 - 4AC
    if D > 0, we will get real roots
    if D = 0, we will get one real root
    if D < 0, we will get complex roots
     */
    private static double[] findRootOfQuadraticEquations(int A, int B, int C) {
        int determinant = (B * B) - (4 * A * C);
        ArrayList<Integer> arrayList = new ArrayList<>();
        double sqrtDeterminant = Math.sqrt(determinant);
        double[] roots = new double[2];
        if (determinant > 0) {
            double root1 = ((-1 * B) + sqrtDeterminant) / (2 * A);
            double root2 = ((-1 * B) - sqrtDeterminant) / (2 * A);
            roots[0] = Math.min(root1, root2);
            roots[1] = Math.max(root1, root2);
        } else if (determinant == 0) {
            double root = ((double) -B / (2 * A));
            roots[0] = root;
            roots[1] = root;
        } else {
            roots = new double[]{-1};
        }

        return roots;
    }
}
