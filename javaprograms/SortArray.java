package com.techjivaa.fhirR4JsonConverter.javaprograms;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {

        int arr[] = {2, 5, 23, 7, 5, 8, 6, 19, 1};

//        Using METHOD
//        Arrays.sort(arr);
//        for (int i : arr) {
//            System.out.print(i + ",");
//        }

//        Without METHOD
        for(int i =0; i<arr.length ;i++) {
            for(int j =i+1; j<arr.length ;j++) {
                int temp = 0;
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]= temp;
                }
            }
            System.out.print(arr[i] + ",");
        }



    }
}
