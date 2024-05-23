package com.techjivaa.fhirR4JsonConverter.javaprograms.arrayprograms;

import java.util.HashSet;
import java.util.Set;

public class FindDistinctElementFromArray {

    public static void main(String[] args) {
        int arr[] = {1,2,2,3,0,4,2};

        // One Way
        System.out.println("Using simple Array");
        int i,j;
        for(i=0; i< arr.length; i++) {
            for(j=0; j< arr.length; j++) {
                if(arr[i] == arr[j]) {
                    break;
                }
            }
            if(i==j) {
                System.out.print(arr[i] + " ");
            }
        }

        // Second way
        System.out.println("\nUsing HashSet");
        int arr1[] = {1,2,2,3,0,4,2};
        Set<Integer> intset = new HashSet<>();

        for(int k=0; k< arr1.length; k++) {
            intset.add(arr[k]);
        }

        System.out.println(intset);

    }
}
