package com.techjivaa.fhirR4JsonConverter.javaprograms.arrayprograms;

import java.util.Arrays;

public class IntersectTwoArray {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] intersectArray = new int[Math.min(nums1.length, nums2.length)];
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                intersectArray[k++] = nums1[i];
                i++;
                j++;
            }
        }

        int[] result = new int[k];
        for (int m = 0; m < k; m++) {
            result[m] = intersectArray[m];
        }
        System.out.println(Arrays.toString(result));
    }
}
