package com.techjivaa.fhirR4JsonConverter.streamprograms;

import java.util.ArrayList;
import java.util.List;

public class SortStringBasedOnCondition {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Akshay");
        stringList.add("Ravi");
        stringList.add("Rahul");
        stringList.add("Sunil");
        stringList.add("Bhairav");
        stringList.add("Prem");


        stringList.stream()
                .sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);
    }
}
