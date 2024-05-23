package com.techjivaa.fhirR4JsonConverter.streamprograms;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CalculateCubeAndFilterNumber {

    public static void main(String[] args) {

//        int num[] = {2,7,3,1,5};
//
//        List<Integer> collect = Arrays.stream(num)
//                .boxed()
//                .map(item -> item * item * item)
//                .filter(entry -> entry > 50)
//                .collect(Collectors.toList());
//
//        System.out.println("Calculate Cube and Filter value greater than 50");
//        System.out.println("Collect : "+ collect);

        String str = "Programming language";

//        Map<Character, Long> collect = str.toLowerCase().chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//        System.out.println("Character count : "+ collect);
//        collect.entrySet().stream()
//                .filter(item -> item.getValue() > 2)
//                .forEach(System.out::println);

        Set<Character> dupChars = new HashSet<>();

        str.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .filter(item -> dupChars.add(item))
                .forEach(System.out::println);


//        collect.entrySet().stream().filter(entry -> entry.getValue() > 2)
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//
//        collect.forEach((character, along) ->
//                System.out.print("\n"+ character + " : "+ along));

    }
}
