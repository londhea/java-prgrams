package com.techjivaa.fhirR4JsonConverter.javaprograms;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int arr[] = {3,12,6,9,23,5,34,18,27,54};
        Arrays.sort(arr);
        int key = 34;
        int last = arr.length - 1;

        for(int i: arr) {
            System.out.print(i +", ");
        }

        int location =  Arrays.binarySearch(arr, key);
        if(location >= 0) {
            System.out.println("\nElement found at location : "+ location);
        } else {
            System.out.println("\nElement not found : ");
        }


        binarySearch(arr, 0, last, key);

    }

    public static void binarySearch(int a[],int low, int high, int key) {

        int mid = (low + high) / 2;

        while(low <= high) {
            if(a[mid] < key) {
                low = mid + 1;
            } else if (a[mid] == key) {
                System.out.println("Element found at location : "+ mid);
                break;
            } else {
                high = mid-1;
            }
            mid = (low + high)/ 2;
        }

        if ( low > high ){
            System.out.println("Element is not found!");
        }
    }
}
