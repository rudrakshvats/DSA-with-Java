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
        }
    }

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

    // using Set Interface
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
}
