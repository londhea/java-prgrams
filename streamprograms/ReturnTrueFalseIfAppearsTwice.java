package com.techjivaa.fhirR4JsonConverter.streamprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReturnTrueFalseIfAppearsTwice {
    public static void main(String[] args) {

        int num[] = {69, 23, 54, 12, 76, 69, 23, 17, 49, 95};

         Map<Integer, Long> numberCount = Arrays.stream(num)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        List<Boolean> collect = numberCount.entrySet()
                .stream().map(entry -> {
                    if (entry.getValue() == 1) {
                        return true;
                    } else {
                        return false;
                    }
                }).collect(Collectors.toList());


        System.out.println("NumberCount : "+ numberCount);
        System.out.println("booleanStream : "+ collect);
    }
}
