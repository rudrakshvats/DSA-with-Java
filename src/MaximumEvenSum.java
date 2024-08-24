import java.util.ArrayList;
import java.util.List;

public class MaximumEvenSum {
    public static void main(String[] args) {
        List<Integer> val = new ArrayList<>();
        val.add(6);
        val.add(3);
        val.add(4);
        val.add(-1);
        val.add(9);
        val.add(7);
        System.out.println(getMaximumEvenSum(val));
    }

    public static long getMaximumEvenSum(List<Integer> val) {
        // Write your code here
        long total = 0L;
        for (Integer value: val) {
            if (value > 0) {
                total += value;
            }
        }
        if (total % 2 != 0) {
            for (Integer value : val) {
                if (value < 0) {
                    total += value;
                    if (total % 2 == 0) {
                        break;
                    }
                    else {
                        continue;
                    }
                }
            }
        }

        return total;
    }
}
