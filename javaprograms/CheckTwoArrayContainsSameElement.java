package com.techjivaa.fhirR4JsonConverter.javaprograms;

public class CheckTwoArrayContainsSameElement {

    public static void main(String[] args) {

        int arr1[] = {3, 12, 6, 9, 23, 5, 34, 18, 27, 54};
        int arr2[] = {2, 6, 11, 18, 54, 29, 38};

        int len1 = arr1.length;
        int len2 = arr2.length;
        int arr3[] = new int[len1+len2];

        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if(arr1[i] == arr2[j]) {
                    arr3[i] = arr1[i];
                }
            }
        }
        for(int i: arr3) {
            if(i > 0) {
                System.out.print(i +", ");
            }

        }
//        System.out.println();
    }
}
