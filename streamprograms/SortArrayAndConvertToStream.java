package com.techjivaa.fhirR4JsonConverter.streamprograms;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class SortArrayAndConvertToStream {

    public static void main(String[] args) {

        int num[] = {4, 2, 7, 1, 8, 3, 9};

        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                int temp = 0;
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(num));

//
//        Arrays.sort(num);
//
//        for(int i : num){
//            System.out.println(i);
//        }
//
//        List<Integer> collect = Arrays.stream(num).boxed().collect(Collectors.toList());
//
//        System.out.println(collect);


        String str = "Hello world";

        Map<Object, Object> collect = str.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//        List<Boolean> collect1 = collect;
//        Map<Character, Long> collectCharater = collect;

//        System.out.println("Character count : "+ collectCharater);
        System.out.println("\nCharacter count : " + collect);
    }
}
