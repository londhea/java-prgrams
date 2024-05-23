//package com.techjivaa.fhirR4JsonConverter.practicestreamprograms;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class SeperateOddEvenNumbers {
//
//    public static void main(String[] args) {
//
//        int arr[] = {2,54,3,76,56,44,31,27, 18,15};
//
//        Set<Integer> eventList = new HashSet<>();
//
//        List<Integer> collectEventList = Arrays.stream(arr)
//                .boxed()
//                .filter(item -> item % 2 == 0)
//                .collect(Collectors.toList());
//        System.out.println("EvenList : "+ collectEventList);
//
//        Arrays.stream(arr)
//                .boxed()
//                .sorted()
//                .peek(System.out::println)      // It store the element one by one and ready to print
//                .collect(Collectors.toList());
//
//        Optional<Integer> maxPayment = Arrays.stream(arr)
//                .boxed()
//                .max();
//
//        System.out.println("Max : "+ maxPayment);
//
//
////        System.out.println("SortedEventList : "+ collectSortedEventList);
//
//
//    }
//
//}
