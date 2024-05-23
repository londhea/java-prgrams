package com.techjivaa.fhirR4JsonConverter.streamprograms;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CalculateSumOfEvenOddNumbers {

    public static void main(String[] args) {

        int arr[] = {23,54,67,44,91,34,26,18,9, 54,91};

        int evenSum = Arrays.stream(arr)
                .boxed()
                .mapToInt(Integer::intValue)
                .filter(item -> item % 2 == 0)
                .sum();
        System.out.println("Sum of Even : "+ evenSum);

        int oddSum = Arrays.stream(arr)
                .boxed()
                .mapToInt(Integer::intValue)
                .filter(item -> item % 2 != 0)
                .sum();
        System.out.println("Sum of Odd: "+ oddSum);

        Stream<Integer> concat = Stream.concat(Stream.of(evenSum), Stream.of(oddSum));
            concat.forEach(System.out::println);


    }
}
