package com.techjivaa.fhirR4JsonConverter.streamprograms;

import java.util.Arrays;
import java.util.List;

public class FindTotalNumbersPresent {

    public static void main(String[] args) {


        // Find Total numbers of Element present in Array
        List<Integer> integerList = Arrays.asList(23, 69, 54, 12, 76, 26, 17, 49, 95, 148);

        long findElement = integerList
                .stream()
                .count();

        System.out.println("Total Numbers : "+ findElement);

    }
}
