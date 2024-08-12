import java.util.Objects;

public class DuplicateNumber {
    public static void main(String[] args) {
        Integer[] nums = {3,1,3,4,2};
        System.out.println(findDuplicateNumber(nums));
    }

    private static Integer findDuplicateNumber(Integer[] nums) {
        int duplicateCount = 0;
        Integer duplicate = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (Objects.equals(duplicate, nums[i])) {
                duplicateCount += 1;
            }
            else {
                duplicate = nums[i];
            }
        }
        if (duplicateCount > 0) {
            return duplicate;
        }
        else {
            return 0;
        }
    }
}
