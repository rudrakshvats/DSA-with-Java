public class FirstRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 13, 15, 6};
        System.out.println(firstRepeated(arr));
    }

    public static int firstRepeated(int[] arr) {
        // code here
        int repeatCount = 1;
        int firstElementIndex = 0;
        while (repeatCount > 0) {
            for (int i = 1; i < arr.length; i++) {
                if (i != firstElementIndex && arr[i] == arr[firstElementIndex]) {
                    repeatCount -= 1;
                }
            }
            if (firstElementIndex + 1 == arr.length) {
                return -1;
            }
            firstElementIndex += 1;
        }

        return firstElementIndex;
    }
}
