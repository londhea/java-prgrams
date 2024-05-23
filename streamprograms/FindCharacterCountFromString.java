package com.techjivaa.fhirR4JsonConverter.streamprograms;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindCharacterCountFromString {

    public static void main(String[] args) {

        String str = "Programming language";

        Map<Character, Long> collect = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        collect.entrySet()
                .stream()
                .filter(item -> item.getValue() > 1)
                .forEach(item -> System.out.println(item.getKey() +" - "+ item.getValue()));
    }
}
