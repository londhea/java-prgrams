package com.techjivaa.fhirR4JsonConverter.javaprograms.arrayprograms;

public class FindSumPairFromArrayElements {

    public static void main(String[] args) {

        int a[] = {1,3,4,2,8,6,7,5};
        int sum = 9;

        int start = 0;
        int end = a.length-1;


        for(int i=0; i<a.length;i++){
            if(a[start] + a[end] > sum) {
                end--;
            } else if(a[start] + a[end] < sum) {
                start++;
            } else if(a[start] + a[end] == sum) {
                System.out.println("pair("+ a[start] +","+ a[end]);
                start++;
                end--;
            }
        }


    }
}
