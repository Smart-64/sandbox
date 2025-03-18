package filter;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] array = new int[]{1,1,3,2,2,3};
        System.out.println(Arrays.toString(topKFrequent(array, 2)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] arrResult = new int[nums.length + 1];
        for (int curr : nums) {
            if (map.containsKey(curr)) {
                map.put(curr, map.get(curr) + 1);
            } else {
                map.put(curr, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int countFrequent = entry.getValue();
            arrResult[countFrequent] = entry.getKey();
        }
        for (int i = arrResult.length - 1; i > i - k; i--) {

        }

        return new int[k];
    }
}
