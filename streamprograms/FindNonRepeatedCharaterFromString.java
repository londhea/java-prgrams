package com.techjivaa.fhirR4JsonConverter.streamprograms;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindNonRepeatedCharaterFromString {

    public static void main(String[] args) {

        String str = "Programming language";

        Map<Character, Long> collect = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println("Collect : "+ collect);

        collect
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);


//        if(optionalCharacter != null){
//            System.out.println("Character : "+ optionalCharacter);
//        } else {
//            System.out.println("No repeated characters found");
//        }

    }
}
