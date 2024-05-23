package com.techjivaa.fhirR4JsonConverter.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmployee {

    public static void main(String[] args) {

        final List<Emp> list = Arrays.asList(
                new Emp(1, "Deepak", 30),
                new Emp(2, "Akshay", 22),
                new Emp(3, "Rahul", 27)
        );
        System.out.println(list);
        System.out.println("-----------");
        list.remove(new Emp(2, "Akshay", 22));
        System.out.println("-----------");
        System.out.println(list);

//        list.stream()
//                .sorted(Comparator.comparing(Emp::getEmpAge))
//                .forEach(System.out::println);
    }
}
