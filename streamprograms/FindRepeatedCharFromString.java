package com.techjivaa.fhirR4JsonConverter.streamprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindRepeatedCharFromString {
    public static void main(String[] args) {

        String str = "Hello World";

        Map<Character, Long> charCount = str
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println("Character : "+ charCount);

        Map<Character, Long> duplicatesMap = charCount.
                entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Duplicates Character : "+ duplicatesMap);

    }
}