package com.techjivaa.fhirR4JsonConverter.javaprograms;

import java.util.Optional;

public class OptionalOrElseExample {

    public static void main(String[] args) {
        String name = null;

        String s = Optional.ofNullable(name).orElse(getOtherName());
        System.out.println("orElse method : "+ s);

//        String s1 = Optional.ofNullable(name).orElseGet(() -> getOtherName());
//        System.out.println("orElseGet method : "+ s1);

    }

    public static String getOtherName() {
        System.out.println("At Start of the method");
        String sname = "Anonymous";
        System.out.println("At End of the method");
        return sname;
    }
}
