package com.techjivaa.fhirR4JsonConverter.streamprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConcetenateTwoStream {

    public static void main(String[] args) {

        int[] num1 = {2, 5, 7, 23, 6};
        int[] num2 = {9, 12, 8, 1, 29};

        IntStream concat = IntStream.concat(Arrays.stream(num1), Arrays.stream(num2));
        int[] ints = concat.toArray();

        Arrays.stream(ints).forEach(entry -> System.out.println(entry));
        System.out.println("concat array : " + ints);


        Stream<Integer> boxedNum1 = Arrays.stream(num1).boxed();
        Stream<Integer> boxedNum2 = Arrays.stream(num2).boxed();

        List<Integer> collect = Stream.concat(boxedNum1, boxedNum2).collect(Collectors.toList());

        System.out.println("Concat : " + collect);


    }
}
