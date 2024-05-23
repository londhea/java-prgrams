package com.techjivaa.fhirR4JsonConverter.javaprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FileInput {

    public static void main(String[] args) {


        Map<String, String> stringMap = new HashMap<>();

        stringMap.put("D", "Akshay");
        stringMap.put("C", "Deepak");
        stringMap.put("A", "Abhijeet");
        stringMap.put("B", "Baburao");
        stringMap.put("E", "Chaitanya");
        stringMap.put("F", "Rahul");

        Map<String, String> collect = stringMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        System.out.println(collect);


//        stringMap.forEach((key, value) ->
//                System.out.println("Key: " + key + ", Value: " + value)
//        );


    }
}
