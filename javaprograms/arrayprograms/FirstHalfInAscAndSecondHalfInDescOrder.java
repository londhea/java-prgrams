package com.techjivaa.fhirR4JsonConverter.javaprograms.arrayprograms;

import java.util.Arrays;

public class FirstHalfInAscAndSecondHalfInDescOrder {

    public static void main(String[] args) {
        int arr[] = {55, 22, 31, 14, 17, 6, 43, 2, 24, 63};

        int len = arr.length;
        int mid = len / 2;

        for (int i = 0; i < mid; i++) {
            for (int j = i; j < mid; j++) {
                int temp = 0;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Ascending : " + Arrays.toString(arr));

        for (int i = mid; i < len; i++) {
            for (int j = i; j < len; j++) {
                int temp = 0;
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Descending : " + Arrays.toString(arr));


    }
}
