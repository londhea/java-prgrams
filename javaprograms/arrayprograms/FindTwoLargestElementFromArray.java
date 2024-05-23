package com.techjivaa.fhirR4JsonConverter.javaprograms.arrayprograms;

public class FindTwoLargestElementFromArray {
    public static void main(String[] args) {

        int arr[] = {55, 22, 31, 14, 6, 43, 2, 24, 63};

        int secondLargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && secondLargest != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Largest : " + largest);
        System.out.println("Second Largest : " + secondLargest);
    }
}
