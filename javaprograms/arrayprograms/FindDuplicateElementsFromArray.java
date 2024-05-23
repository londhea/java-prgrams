package com.techjivaa.fhirR4JsonConverter.javaprograms.arrayprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementsFromArray {

    public static void main(String[] args) {

        int a[] = {2, 6, 4, 8, 9,6,2};

        int count = removeDuplicates(a);
        System.out.println("Count : " + count);

//        Set<Integer> duplicateElement = new HashSet<>();
//        boolean duplicateExist = false;
//
//        for(int i=0; i<a.length; i++){
//            if(duplicateElement.contains(a[i])) {
//                duplicateExist = true;
//                System.out.println("Duplicate Element : "+ a[i]);
//            } else {
//                duplicateElement.add(a[i]);
//            }
//        }
//
//        if(!duplicateExist) {
//            System.out.println(-1);
//        }
    }


    public static int removeDuplicates(int[] nums) {

        int len = nums.length;

        System.out.println("length : " + len);

        int[] newArray = new int[len];
        int count = 0;

//        for (int i = 0; i < len - 1; i++) {
//            boolean isUnique = true;
//            for (int j = i + 1; j < len - 1; j++) {
//                if (nums[i] == nums[j]) {
//                    isUnique = false;
//                    break;
//                }
//            }
//            if(isUnique) {
//                count++;
//            }
//
//        }

        Set<Integer> integerSet = new HashSet<>();
        Set<Integer> duplicateSet = new HashSet<>();

        for (int i = 0; i < len; i++) {
            if(!integerSet.add(nums[i])) {
                duplicateSet.add(nums[i]);
            } else {
                integerSet.add(nums[i]);
            }
        }


        System.out.println(integerSet);
        System.out.println(duplicateSet);

        System.out.println(Arrays.toString(newArray));
        return count;

    }
}
