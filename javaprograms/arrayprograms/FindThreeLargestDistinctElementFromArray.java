package com.techjivaa.fhirR4JsonConverter.javaprograms.arrayprograms;

import java.util.Arrays;

public class FindThreeLargestDistinctElementFromArray {

    public static void main(String[] args) {

        int arr[] = {1, 2, 6, 3, 6, 4, 9};
        int count = 0;
        int i, j;


        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(i = 0; i < arr.length; i++) {
            if(arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if(arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        System.out.println("smallest : "+ smallest);
        System.out.println("smallest : "+ secondSmallest);


        // Sort the array in descending order;
        for (i = 0; i < arr.length; i++) {
            for (j = i; j < arr.length; j++) {
                int temp = 0;
                if (arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Try : " + Arrays.toString(arr));

        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }
            if (i == j && count < 3) {
                System.out.print(arr[i] + " ");
                count++;
            }
        }

        // System.out.println("Try : "+ Arrays.toString(newArr));;
    }
}
