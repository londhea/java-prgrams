package com.techjivaa.fhirR4JsonConverter.streamprograms;

import java.util.stream.Stream;

public class ConcatenatedStringUsingStream {

    public static void main(String[] args) {
        String str1 = "Programming";
        String str2 = "language";

        String concatenatedString = Stream.of(str1, str2)
                .reduce(" ", (acc, s) -> acc + " " + s );

        System.out.println("concatenatedString : "+ concatenatedString);

        Stream.of(str1, str2)
                .reduce("", (acc, c) -> acc + c);
    }
}
