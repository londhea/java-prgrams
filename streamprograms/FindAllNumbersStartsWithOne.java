package com.techjivaa.fhirR4JsonConverter.streamprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllNumbersStartsWithOne {
    public static void main(String[] args) {

        List<Integer> integerList =  Arrays.asList(23,54,12,76,26,17,49,95);

        integerList
                .stream()
                .map(s -> "" + s)
                .filter(num -> num.startsWith("1"))
                .forEach(System.out::println);


        List<String> evenList = integerList
                .stream()
                .map(s -> s +"")
                .filter(num -> num.startsWith("1"))
                .collect(Collectors.toList());

        System.out.println("evenList : "+ evenList);

    }
}

/*

O/P

        12
        17
        evenList : [12, 17]
*/
