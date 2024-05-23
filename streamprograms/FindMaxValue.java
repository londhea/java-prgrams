package com.techjivaa.fhirR4JsonConverter.streamprograms;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class FindMaxValue {

    public static void main(String[] args) {


        // Find Max number from Array
        List<Integer> integerList = Arrays.asList(23, 69, 54, 12, 76, 26, 17, 49, 95, 148);

        OptionalInt findElement = integerList
                .stream()
                .mapToInt(Integer::intValue)
                .max();

        System.out.println("Max Number : " + findElement.getAsInt());

    }
}


/*
O/P

        Max Number : 148
*/
