package com.techjivaa.fhirR4JsonConverter.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(22, 3,3, 11, 22);
        Set<Integer> set = new HashSet<>();
        list.stream().filter(i-> !set.add(i)).forEach(System.out::println);
    }

}
