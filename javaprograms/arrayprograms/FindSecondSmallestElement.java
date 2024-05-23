/*
package com.techjivaa.fhirR4JsonConverter.javaprograms.arrayprograms;

public class FindSecondSmallestElement {

    public static void main(String[] args) {

//        First Way
        int a[] = {2, 6, 4, 8, 9, 11, 3, 16, 22, 17, 5, 35, 11};

//        for(int i=0; i< a.length; i++) {
//            for(int j=i+1; j< a.length; j++) {
//                int temp =0;
//                if(a[i] > a[j]) {
//                    temp = a[i];
//                    a[i] = a[j];
//                    a[j] = a[i];
//                }
//            }
//        }
//
//        System.out.println("Smallest number - First : "+ a[0]);
//        System.out.println("Smallest number - Second : "+ a[1]);

//        Second way
        int[] array = {4, 7, 2, 9, 3, 11, 6}; // Example array

        int secondSmallest = findSecondSmallest(array);

        if (secondSmallest != Integer.MAX_VALUE) {
            System.out.println("Second smallest element: " + secondSmallest);
        } else {
            System.out.println("No second smallest element found");
        }
    }


    public static int findSecondSmallest(int[] array) {
        if (array.length < 2) {
            return Integer.MAX_VALUE; // No second smallest element found
        }

        int smallest = array[0];
        int secondSmallest = array[0];

        for (int num : array) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        return secondSmallest;
    }
}
*/
