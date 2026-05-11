package LeetCode;

import java.util.Arrays;

public class BoatsToSavePeople {
    public static void main(String[] args) {
        int[] people = {3, 5, 3, 4};
        int limit = 5;
        System.out.println(numRescueBoats(people, limit));
    }

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;

        int count = 0;

        while (left <= right) {
            int totalWeight = people[left] + people[right];

            if (totalWeight <= limit) {
                left += 1;
            }
            right -= 1;
            count += 1;
        }

        return count;
    }
}
