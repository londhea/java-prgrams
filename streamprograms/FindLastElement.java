package com.techjivaa.fhirR4JsonConverter.streamprograms;

import java.util.Arrays;
import java.util.List;

public class FindLastElement {
    public static void main(String[] args) {


        // Find Last Element from Array
        List<Integer> integerList = Arrays.asList(23, 69, 54, 12, 76, 26, 17, 49, 95);

        Integer findElement = integerList
                .stream()
                .reduce((first,second) -> second)
                .orElse(null);

        System.out.println("Last Element : "+ findElement);

    }
}
