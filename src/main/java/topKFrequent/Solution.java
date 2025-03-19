package topKFrequent;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 1, 2, 2, 3};
        System.out.println(Arrays.toString(topKFrequent(array, 2)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int curr : nums) {
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }
        int max = nums.length + 1;
        ArrayList<Integer>[] arr = new ArrayList[max + 1];
        for (int i = 1; i <= max; i++) {
            arr[i] = new ArrayList<Integer>();
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            int number = entry.getKey();
            arr[count].add(number);
        }

        List<Integer> result = new ArrayList<Integer>();

        //add most frequent numbers to result
        for (int j = max; j >= 1; j--) {
            if (arr[j].size() > 0) {
                for (int a : arr[j]) {
                    result.add(a);
                    //if size==k, stop
                    if (result.size() == k) {
                        return result.stream().mapToInt(i -> i).toArray();
                    }
                }
            }
        }


        return result.stream().mapToInt(i -> i).toArray();
    }
}
