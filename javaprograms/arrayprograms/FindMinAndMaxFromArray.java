package com.techjivaa.fhirR4JsonConverter.javaprograms.arrayprograms;

import java.util.Arrays;

public class FindMinAndMaxFromArray {

    public static void main(String[] args) {


        int a[] = {2,6,4,8,9,11,3,6,22,17,5,2,11};

        for(int i=0; i<a.length; i++) {
            for(int j=i+1; j<a.length; j++) {
                int temp =0;
                if(a[i] > a[j]) {
                    temp = a[i];
                    a[i]=a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(a));

        System.out.println("Min : "+ a[0] +" <=> Max : "+ a[a.length -1]);


    }
}
