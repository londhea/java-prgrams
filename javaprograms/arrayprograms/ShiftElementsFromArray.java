package com.techjivaa.fhirR4JsonConverter.javaprograms.arrayprograms;

import java.util.Arrays;

public class ShiftElementsFromArray {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int value = 3;
        int key = value % arr.length;
        int newArray[] = new int[arr.length];

        System.out.println("New Array : " + Arrays.toString(newArray));
        for (int i = 0; i < key; i++) {
            newArray[i] = arr[arr.length - key + i];
        }
        System.out.println("New Array : " + Arrays.toString(newArray));
        for (int i = 0; i <= key; i++) {
            newArray[key + i] = arr[i];
        }

        System.out.println("New Array : " + Arrays.toString(newArray));
    }
}
