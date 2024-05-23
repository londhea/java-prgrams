package com.techjivaa.fhirR4JsonConverter.streamprograms;

import java.util.Arrays;

public class FindSecondSmallestElement {

    public static void main(String[] args) {

        int arr[] = {23, 54, 67, 44, 91, 34, 26, 54, 18, 9, 3};

        Integer intMin = Arrays.stream(arr)
                .boxed()
                .mapToInt(Integer::intValue)
                .sorted()
                .skip(1)
                .min().getAsInt();

        System.out.println("Smallest Int : "+ intMin);


        int arr1[] = new int[arr.length];
        int count =0;

        for(int i=0; i< arr.length; i++) {
            boolean isUnique = true;
            for(int j=0; j < i; j++) {
                int temp =0;

                if(arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if(isUnique) {
                arr1[count++] = arr[i];
            }
        }

        System.out.println("Array : "+ Arrays.toString(arr));
        System.out.println("Unique Array : "+ Arrays.toString(arr1));
    }
}
