package com.techjivaa.fhirR4JsonConverter.javaprograms.arrayprograms;

import java.util.Arrays;

public class AddOneIntoArray {
    public static void main(String[] args) {

        int[] array = {4, 3, 2, 1};

        int[] results = addOne(array);

        System.out.println(Arrays.toString(results));

    }

    public static int[] addOne(int[] arr) {
        int len = arr.length;

        for (int i = len - 1; i >= 0; i--) {
            if(arr[i] < 9) {
                arr[i]++;
                return arr;
            }
            arr[i]=0;
        }

        int[] newNumber = new int[len + 1];
        newNumber[0] = 1; // The most significant digit is 1, rest are 0
        return newNumber;
    }
}
