package com.techjivaa.fhirR4JsonConverter.streamprograms;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindSmallestLargestInteger {

    public static void main(String[] args) {

        int arr[] = {23,54,67,44,91,34,26,18,9,3};


        int smallest = arr[0];
        int secondSmallest = arr[0];
        int thirdSmallest = arr[0];

        for(int i=0; i<arr.length;i++) {
            if(arr[i] < smallest) {
                thirdSmallest = secondSmallest;
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < thirdSmallest && arr[i] != secondSmallest && arr[i] != smallest) {
                thirdSmallest = arr[i];
            }
        }

        System.out.println("Smallest : " + smallest);
        System.out.println("Second Smallest : " + secondSmallest);
        System.out.println("third Smallest : " + thirdSmallest);



        Integer intMin = Arrays.stream(arr)
                .boxed()
                .mapToInt(Integer::intValue)
                .sorted()
                .skip(1)
                .min().getAsInt();

        System.out.println("Min Value : "+ intMin);


//        int smallest = arr[0];
//
//        for(int i=0; i<arr.length; i++) {
//            if(smallest > arr[i]) {
//                smallest = arr[i];
//            }
//        }
//
//        System.out.println("Smallest Element : "+ smallest);
    }
}
