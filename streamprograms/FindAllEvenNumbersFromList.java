package com.techjivaa.fhirR4JsonConverter.streamprograms;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindAllEvenNumbersFromList {

    public static void main(String[] args) {

        List<Integer> integerList =  Arrays.asList(11,54,32,76,26,77,49,15,26);

//        integerList
//                .stream()
//                .filter(num -> num%2 == 0)
//                .forEach(System.out::println);
//
//        int sum = integerList.stream().mapToInt(Integer::intValue).sum();
//        System.out.println("Sum : "+ sum);

        OptionalDouble average = integerList
                .stream()
                .mapToInt(Integer::intValue).average();

        System.out.println(String.format("Average of integer : " + average.getAsDouble(), "%"));

        int sum = integerList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum : "+ sum);

//        List<String> collectList = integerList
//                .stream()
//                .map(num -> String.valueOf(num))
//                .filter(item -> item.contains("1"))
//                .collect(Collectors.toList());

//        System.out.println("Collect list : "+ collectList);


        /*
        List<Integer> evenList = integerList
                .stream()
                .filter(num -> num%2 == 0)
                .collect(Collectors.toList());

        System.out.println("evenList : "+ evenList);
        */

    }
}

/*

O/p :

54
32
76
26

evenList : [54, 32, 76, 26]

*/

