package com.techjivaa.fhirR4JsonConverter.streamprograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortInDescendingOrder {

    public static void main(String[] args) {
        List<Integer> integerList =  Arrays.asList(23,54,12,76,26,17,49,95, 26,54);

        List<Integer> collect = integerList.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

//        List<Integer> collect = integerList.stream()
//                .sorted((a,b) -> Integer.compare(b,a))     // Descending Order
//                .collect(Collectors.toList());
//
//        List<Integer> collect = integerList.stream()
//                .sorted()                                   // Ascending Order
//                .collect(Collectors.toList());

        System.out.println("Collect : "+ collect);
    }
}
