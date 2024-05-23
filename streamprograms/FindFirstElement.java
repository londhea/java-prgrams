package com.techjivaa.fhirR4JsonConverter.streamprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class FindFirstElement {

    public static void main(String[] args) {


        // Find First Element from Array
        List<Integer> integerList = Arrays.asList(69, 23, 54, 12, 76, 26, 17, 49, 95);

        OptionalInt findElement = integerList.stream()
                .mapToInt(Integer::intValue).findFirst();

        System.out.println("First Element : "+ findElement.getAsInt());



    }
}

/*

O/P

        First Element : 69

*/
