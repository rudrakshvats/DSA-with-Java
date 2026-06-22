package LeetCode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class DailyTemperatures {

    public static void main(String[] args) {
        int[] temperatures = {30,60,90};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        // take a result integer array of the same size as that of temperatures array
        int[] result = new int[temperatures.length];

        // for this problem we will use ArrayDeque/Stack
        Deque<Integer> deque = new ArrayDeque<>();

        // run a loop to traverse from i = 0 to i = temperatures.length - 1
        for (int i = 0; i < temperatures.length; i++) {
            // this loop will check if the deque contains any index for which the temperatures at i is warmer or more
            // if yes then we will take the deque's top as previousIndex for which will update the result array's same
            // index with difference of i and previousIndex and then finally popping deque's top
            // suppose for 30, 60, 90, for first iteration we will simply push 0 as first element in deque so
            // deque = [0]
            // next for second iteration, we will check if deque is not empty, so we will check is 60 > 30, yes it is
            // greater, so we will take out 0 index from deque using peek() and then update result[0] = 1 - 0 = 1
            // then we will do pop()
            // deque = [] --- result = [1]
            // for next loop, deque is empty so we will push i to deque
            // deque = [1]
            // next for third and final iteration, we will check if deque is not empty, so we will check 90 > 60, yes it
            // is greater, so we will take out 1 index from deque using peek() and then update result[1] = 2 - 1 = 1
            // then we will do pop()
            // deque = [] --- result = [1, 1]
            // for next loop, deque is empty so we will push i to deque
            // deque = [2]
            // now loop ends and the initial value for any element in an integer being 0 solves the point that if there
            // is no future day for which this is possible, keep answer[i] = 0
            while (!deque.isEmpty() && temperatures[i] > temperatures[deque.peek()]) {
                int previousIndex = deque.peek();
                result[previousIndex] = i - previousIndex;
                deque.pop();
            }

            // for first iteration deque will always be empty, so we will push the i = 0, then once the previous
            // while loop is complete then also we will push the index i to deque
            deque.push(i);
        }

        return result;
    }
}
