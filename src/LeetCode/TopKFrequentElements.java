package LeetCode;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        // we will use hashmap to track frequency of frequent elements
        Map<Integer, Integer> map = new HashMap<>();

        // using this loop we will map key (element of array) with values (frequency of element)
        for (int i: nums) {
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
}
