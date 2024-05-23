package com.techjivaa.fhirR4JsonConverter.javaprograms.arrayprograms;

import java.util.Arrays;

public class ReversedArray {

    public static void main(String[] args) {
        int[] arr = {7,4,3,2,1,6};

        for(int i= arr.length-1; i>=0; i--) {
            System.out.print(arr[i] +", ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
