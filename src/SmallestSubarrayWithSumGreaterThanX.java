public class SmallestSubarrayWithSumGreaterThanX {
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 0, 19};
        int x = 51;

        System.out.println(smallestSubWithSum(x, arr));
    }

    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
        if (arr.length == 1) return 0;

        int left = 0;
        int right = 0;
        int windowSum;

        int minimumLength = Integer.MAX_VALUE;

        while (right < arr.length) {
            windowSum = arr[left] + arr[right++];

            while (windowSum > x) {
                int currentWindowLength = right - left;
                minimumLength = Math.min(minimumLength, currentWindowLength);

                windowSum -= arr[left++];
            }
        }

        return minimumLength == Integer.MAX_VALUE ? 0 : minimumLength;
    }
}
