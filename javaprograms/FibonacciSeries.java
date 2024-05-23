package com.techjivaa.fhirR4JsonConverter.javaprograms;

import java.util.function.Function;
import java.util.stream.Collectors;

public class FibonacciSeries {

    public static void main(String[] args) {

        // Using Normal Method
        fibonacciSeries(10);

        // Using Recursion Method
        System.out.println("\nUsing Recursion Method : ");
        for (int i = 0; i <= 10; i++) {
            int value = fibonacciSeriesRecursion(i);
            System.out.print(value + ", ");
        }

//        String str = "Akshay Londhe";
//
//        str.toLowerCase().chars()
//                .mapToObj(c->(char) c)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(item -> item.getValue() >= 1)
//                .forEach(System.out::println);
    }


    // Using Recursion Method
    private static int fibonacciSeriesRecursion(int count) {
        if (count <= 1) {
            return count;
        }
        return fibonacciSeriesRecursion(count - 1) + fibonacciSeriesRecursion(count - 2);
    }

    // Using Normal Method
    private static void fibonacciSeries(int count) {
        int a = 0, b = 1, c = 1;

        System.out.println("Using Normal Method : ");
        for (int i = 0; i <= count; i++) {
            System.out.print(a + ", ");
            a = b;
            b = c;
            c = a + b;
        }

    }
}
