package com.techjivaa.fhirR4JsonConverter.javaprograms;// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");

        List<Integer> inputList = Arrays.asList(11, 1000, 1004, 1275, 10005, 10177, 10240, 10641, 10903, 11495, 11628, 15629, 18630, 21631, 21680, 23745, 24827, 28828, 33955, 44087, 48755, 50073);

        int threshold = 500;


        for (int i = 0; i < inputList.size(); i++) {
            List<List<Integer>> finalSubArray = new ArrayList<>();
            // List<Integer> subArray = new ArrayList<>();
            List<Integer> subArray = new ArrayList<>();
            subArray.add(inputList.get(0));
            if (inputList.get(i) <= threshold) {
                subArray.add(inputList.get(i));
            } else {
                finalSubArray.add(new ArrayList<>(subArray));
                subArray.clear();
                subArray.add(inputList.get(i));
                threshold = threshold+ 500;
            }



            System.out.println("SubArray : "+ finalSubArray);
//            System.out.println(inputList.get(i));
        }
    }
}