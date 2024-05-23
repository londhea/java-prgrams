package com.techjivaa.fhirR4JsonConverter.javaprograms.arrayprograms;

public class PrintEvenAndOddNumbers {
    public static void main(String[] args) {
        int arr[] = {2, 6, 4, 8, 9, 11, 3, 6, 22, 17, 5, 2, 11};

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }

        System.out.println("Sum of Even : "+ evenSum);
        System.out.println("Sum of Odd : "+ oddSum);
    }
}
