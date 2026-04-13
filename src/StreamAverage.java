import java.util.Arrays;

public class StreamAverage {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.print(getAverageUsingStream(arr));
    }

    private static double getAverageUsingStream(int[] arr) {
        if (arr.length == 0) return 0;
        return Arrays.stream(arr).average().getAsDouble();
    }
}
