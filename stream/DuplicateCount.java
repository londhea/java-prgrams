package com.techjivaa.fhirR4JsonConverter.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCount {
    public static void main(String[] args) {
//        List<String > list = Arrays.asList("dipak","dipak","akshay");
//        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(collect);
//
//        String s = "dipakk";
//        Map<Character, Long> s1 = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(s1);

//        List<Integer> intList = Arrays.asList(20,60,30,50,40,40);

        int[] arr1 = {20,30,30,50,40,40};

        int targ = 80;
        Set<Integer> integerSet = new HashSet<>();

        Arrays.stream(arr1)
                .forEach(item -> {
                    int rem = targ - item;
                    if(integerSet.contains(item)) {
                        System.out.println(rem +", "+ item);
                    }
                    integerSet.add(item);
                });

//        checkValue(arr1, targ);

//        System.out.println(Arrays.toString(ints));


    }

//    public static void checkValue(int[] arr, int target) {
//        Set<Integer> integerSet = new HashSet<>();
//        for(int i=0; i< arr.length; i++) {
//            int rem = target - arr[i];
//            if(integerSet.contains(rem)) {
//                System.out.println(rem +", "+ arr[i]);
//            }
//            integerSet.add(arr[i]);
//        }
//    }
}
