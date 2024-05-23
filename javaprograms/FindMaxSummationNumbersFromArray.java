package com.techjivaa.fhirR4JsonConverter.javaprograms;

import java.util.Arrays;

public class FindMaxSummationNumbersFromArray {

    public static void main(String[] args) {

        int result = 0;
        int[] arry = {2, 5, 1, 7, 3, 15};
        int[] sum_result = new int[arry.length];

        for (int i = 0; i < arry.length; i++) {
            for (int j = i + 1; j < arry.length; j++) {
                int sum = arry[i] + arry[j];
                if (result > sum) ;
                result = sum_result[i];
                sum_result[i] = sum;

            }
        }
        System.out.println(sum_result[sum_result.length - 2] + " " + sum_result[sum_result.length - 3]);
        System.out.println(Arrays.toString(sum_result));
    }
}
