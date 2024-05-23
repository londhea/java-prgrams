package com.techjivaa.fhirR4JsonConverter.streamprograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalDouble;

public class SortNumbersInDescendingOrder {

    public static void main(String[] args) {


        int[] arr= {34,4,38,65,74,26,18,94};

        Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(5)
                .skip(3)
                .forEach(System.out::println);

        OptionalDouble average = Arrays.stream(arr)
                .boxed()
                .mapToInt(Integer::intValue)
                .average();

        System.out.println("Average : "+ average);

    }
}
