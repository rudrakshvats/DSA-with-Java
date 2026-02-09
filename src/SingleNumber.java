import java.util.*;

public class SingleNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = scanner.nextInt();
        List<Integer> numsList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numsList.add(scanner.nextInt());
        }
        int[] nums = numsList.stream().mapToInt(i -> i).toArray();

        if (nums.length == 1) {
            System.out.println(nums[0]);
        } else if (nums.length == 0) {
            System.out.println(0);
        } else {
            System.out.println(checkRepeat(nums));
            System.out.println(checkRepeatUsingSet(nums));
            System.out.println(checkRepeatUsingBitwiseXOROperation(nums));
        }
    }

    private static int checkRepeatUsingBitwiseXOROperation(int[] nums) {
        int singleNumber = 0; // for getting result we keep the value 0 for +ve value
        for (int num: nums) {
            singleNumber = singleNumber ^ num;
        }

        return singleNumber;
    }

    // TC: O(n^2), SC: O(n)
    private static int checkRepeat(int[] nums) {
        for (int i: nums) {
            int repeatCount = -1;
            for (int num : nums) {
                if (i == num) {
                    repeatCount += 1;
                }
                if (repeatCount > 0) {
                    break;
                }
            }
            if (repeatCount == 0) {
                return i;
            }
        }

        return 0;
    }

    // using Set Interface, TC: O(n), SC: O(n)
    private static int checkRepeatUsingSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }

        return set.stream().findFirst().get();
    }

    // using bitwise XOR operation, TC: O(n), SC: O(1)


}
