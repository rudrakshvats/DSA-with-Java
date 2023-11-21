public class TestClass {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7, 3};
        System.out.println("Second Smallest Integer in the array is : " + findSecondSmallestInteger(numbers));
    }

    private static Integer findSecondSmallestInteger(int[] numbers) {
        int smallestIndex = 0;
        int secondSmallestIndex = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[smallestIndex]) {
                smallestIndex = i;
            }
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            int temp;
            if (numbers[i] > numbers[smallestIndex]) {
                temp = i;
                if (numbers[temp] < numbers[temp + 1] && temp != numbers[smallestIndex]) {
                    temp = temp;
                }
                else {
                    temp = temp + 1;
                }
            }
        }

        return numbers[secondSmallestIndex];
    }
}
