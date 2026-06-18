package LeetCode;

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        // we will use hashmap to track frequency of frequent elements
        Map<Integer, Integer> map = new HashMap<>();

        // using this loop we will map key (element of array) with values (frequency of element)
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // integer array for result
        int[] result = new int[k];

        // take map entries and map it to an arrayList using stream() and sorting in descending order for getting top k elements
        List<Map.Entry<Integer, Integer>> list = map.entrySet().stream().sorted((a, b) -> b.getValue() - a.getValue()).collect(Collectors.toList());

        // running loop from 0 to k to populate the integer array result
        for (int i = 0; i < k; i++) result[i] = list.get(i).getKey();

        return result;
    }

    public int[] topKFrequentWithPriorityQueue(int[] nums, int k) {
        // define a result array
        int[] result = new int[k];

        // use HashMap to track numbers with their frequency as key value pair
        Map<Integer, Integer> map = new HashMap<>();

        // populating all elements in map with their frequency as values
        for (int i: nums) map.put(i, map.getOrDefault(i, 0) + 1);

        // use Priority Queue with increasing value comparator logic
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        // run a loop on entry set of map and add entries to PriorityQueue, as soon as PriorityQueue size exceeds above k, we remove the highest priority element
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            pq.add(entry);
            if (pq.size() > k) pq.poll();
        }

        // now run a loop from 0 to k and populate priority elements accordingly
        for (int i = 0; i < k; i++) result[i] = pq.poll().getKey();

        return result;
    }

    // TC: O(nlogk)
    // SC: O(k)
}
