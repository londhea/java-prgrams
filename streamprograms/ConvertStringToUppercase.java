package com.techjivaa.fhirR4JsonConverter.streamprograms;

import java.util.stream.Stream;

public class ConvertStringToUppercase {

    public static void main(String[] args) {

        String str = "hello world";

        Stream.of(str)
                .map(item -> item.toUpperCase())
                .forEach(System.out::println);
    }
}
