package com.techjivaa.fhirR4JsonConverter.javaprograms.arrayprograms;

import java.util.Arrays;

public class FindCommonElementsFromArray {
    public static void main(String[] args) {

        int arr1[] = {2, 5, 9, 11, 51, 6};
        int arr2[] = {10, 2, 27, 15, 18, 6};

        int[] arr3 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    arr3[i] = arr1[i];
                }
                for(int k=0; k<arr3.length-1; k++ ){
                    if(arr3[k] <= 0) {
                        arr3[k] = arr3[k+1];
                    }
                }
            }
        }


//        for(int i=0; i< arr1.length; i++) {
//            for(int j=0; j< arr2.length; j++) {
//
//            }
//        }

        System.out.println(Arrays.toString(arr3));

    }
}
