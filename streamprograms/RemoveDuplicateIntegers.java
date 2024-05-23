package com.techjivaa.fhirR4JsonConverter.streamprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateIntegers {

    public static void main(String[] args) {

        int arr[] = {23,54,67,44,91,34,26,18,9, 54,91};

        Set<Integer> intSet = new HashSet<>();

        Arrays.stream(arr)
                .boxed()
                .filter(item -> !intSet.add(item))
                .sorted((a,b) -> b.compareTo(a))
                .forEach(System.out::println);

    }
}
