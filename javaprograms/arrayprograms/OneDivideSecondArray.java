package com.techjivaa.fhirR4JsonConverter.javaprograms.arrayprograms;

import java.util.Arrays;

public class OneDivideSecondArray {
    public static void main(String[] args) {
        int[] arr1= {12,15,7,13,5,9,24};
        int[] arr2= {6,10,3,12};
        int[] c = new int[arr1.length];

        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j<arr2.length; j++) {
                if(i == j) {
                    c[i]=arr1[i]/arr2[j];
                    break;
                }

            }
            try {
                if(i >= arr2.length) {
                    c[i]=arr1[i]/0;
                }
            } catch(ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(Arrays.toString(c));
    }
}
