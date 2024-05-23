package com.techjivaa.fhirR4JsonConverter.streamprograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListProcessingExample {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Apple", "Pineapple", "Banana", "Orange");

        Optional.ofNullable(stringList)
                .filter(list -> !list.isEmpty())
                .ifPresent(list -> list.forEach(System.out::println));

//        List<String> collect = stringList.stream()
//                .sorted((a,b) -> String.valueOf(a).compareTo(String.valueOf(b)))
//                .collect(Collectors.toList());
//        System.out.println("Collect : "+ collect);


        List<String> stringList1 = Arrays.asList("Apple", "Pineapple", "Banana", "Orange");
        List<String> stringList2 = Arrays.asList("Ram", "Shyam", "Vivek", "Arun");

        List<String> collect = Stream.concat(stringList1.stream(), stringList2.stream())
                .collect(Collectors.toList());

        System.out.println("Collect : "+ collect);
    }
}