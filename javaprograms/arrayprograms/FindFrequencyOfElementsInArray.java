package com.techjivaa.fhirR4JsonConverter.javaprograms.arrayprograms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFrequencyOfElementsInArray {
    public static void main(String[] args) {

        int arr[] = {1,2,2,3,0,4,2, 23,3,11,1};
        int count = 1;
        Map<Integer, Integer> intMap = new HashMap<>();

        String str = "AkshayAkshay";
        Map<Character, Integer> stringMap = new HashMap<>();


//        for(int i=0; i<arr.length; i++) {
//            if(!intMap.containsKey(arr[i])) {
//                intMap.put(arr[i], count);
//            } else {
//                intMap.put(arr[i], intMap.get(arr[i]) + count);
//            }
//        }



        for(int i=0; i<str.length(); i++) {
            if(!stringMap.containsKey(str.charAt(i))) {
                stringMap.put(str.charAt(i), count);
            } else {
                stringMap.put(str.charAt(i), stringMap.get(str.charAt(i)) + count);
            }
        }

        System.out.println("Frequency : "+ intMap);
        System.out.println("Frequency : "+ stringMap);

        List<Map.Entry<Integer, Integer>> collect = intMap.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .collect(Collectors.toList());

        System.out.println("Frequency : "+ collect);
    }


}
