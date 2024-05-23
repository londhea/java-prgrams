package com.techjivaa.fhirR4JsonConverter.streamprograms;

import com.google.gson.internal.ConstructorConstructor;

import java.lang.reflect.Constructor;
import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class NumberStreamPrograms {
    private int value = 10;
    private static int staticValue = 10;

    public static void main(String[] args) {
        int arr[] = {23, 54, 26, 87, 19, 57, 99, 45, 27, 23, 15};

        String result = Arrays.stream(arr)
                .mapToObj(String::valueOf) // Convert each int to a String
                .collect(Collectors.joining(", ")); // Join the strings with comma and space as delimiter

        System.out.println(result); // Print the result

//        Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
        List<Integer> evenIntegers = Arrays.stream(arr)
                .boxed()
                .filter(item -> item % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("\nEven Integers : " + evenIntegers);

//        Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        List<Integer> startWithOneIntegers = Arrays.stream(arr)
                .boxed()
                .filter(item -> String.valueOf(item).startsWith("1"))
                .collect(Collectors.toList());
        System.out.println("Starts with One Integers : " + startWithOneIntegers);

//        How to find duplicate elements in a given integers list in java using Stream functions?
        Set<Integer> duplicatesNumbers = new HashSet();
        Set<Integer> duplicatesSet = Arrays.stream(arr)
                .boxed()
                .filter(item -> !duplicatesNumbers.add(item))
                .collect(Collectors.toSet());

        System.out.print("Duplicates numbers from list : ");
        duplicatesSet.forEach(System.out::println);

//        Given the list of integers, find the first element of the list using Stream functions?

        Optional<Integer> firstElement = Arrays.stream(arr)
                .boxed()
                .findFirst();
        System.out.println("First element from Integer : " + firstElement.get());

//        Given a list of integers, find the total number of elements present in the list using Stream functions?
        long integerCount = Arrays.stream(arr)
                .count();
        System.out.println("Integers Count : " + integerCount);

//        Given a list of integers, find the maximum value element present in it using Stream functions?
        Optional<Integer> maxValue = Arrays.stream(arr)
                .boxed()
                .max(Comparator.comparing(Integer::intValue));

        System.out.println("Max Integer : " + maxValue.get());

//        Given a String, find the first non-repeated character in it using Stream functions?

        String str = "Java is a Programming Language";

        Optional<Character> firstCharacter = str.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
        System.out.println("First Non-repeated Character from String : " + firstCharacter.get());

//        Given a String, find the first repeated character in it using Stream functions?
        String str1 = "Java is a Programming Language";

        Optional<Character> repeatedCharacter = str1.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(item -> item.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst();
        System.out.println("First Repeated Character from String : " + repeatedCharacter.get());

//        Given a list of integers, sort all the values present in it using Stream functions?
        System.out.println("sort all the values  : ");
        Arrays.stream(arr)
                .boxed()
                .sorted()
                .forEach(System.out::print);

//        Given a list of integers, sort all the values present in it in descending order using Stream functions?
        System.out.println("sort all the values Descending Order : ");
        Arrays.stream(arr)
                .boxed()
                .sorted()
                .forEach(System.out::print);

//        Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
        int arr1[] = {34, 55, 69, 76, 28, 26, 65, 99, 57, 62};

        boolean hasDuplicate = Arrays.stream(arr1)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .anyMatch(item -> item.getValue() > 1);
        System.out.println("value at least twice : " + hasDuplicate);


        NumberStreamPrograms numberStreamPrograms = new NumberStreamPrograms();
        numberStreamPrograms.getDataOne();
//        getData();


    }


    public void getDataOne() {
        value = 26;
        staticValue = 23;
    }

//    public static void getData() {
//        value = 26;
//        staticValue = 23;
//        getDataTwo();
//    }
//
//    public static void getDataTwo() {
//        value = 26;
//        staticValue = 23;
//    }
}
