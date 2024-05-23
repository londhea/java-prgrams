package com.techjivaa.fhirR4JsonConverter.javaprograms.arrayprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If the complement is already in the map, return the indices
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // Otherwise, add the current number and its index to the map
            map.put(nums[i], i);
        }

        // If no solution is found, return an empty array
        throw new IllegalArgumentException("No two sum solution");
    }
}