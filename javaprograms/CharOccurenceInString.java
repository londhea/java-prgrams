package com.techjivaa.fhirR4JsonConverter.javaprograms;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class CharOccurenceInString {

    public static void main(String[] args) {

        String str = "abbcadcbdsffh";

        char[] strArray = str.toCharArray();

        Map<Character, Integer> charMap = new HashMap<>();
        int count = 1;

        for (int i = 0; i < strArray.length; i++) {
            if (charMap.containsKey(strArray[i])) {
                charMap.put(strArray[i], charMap.get(strArray[i]) + count);
            } else {
                charMap.put(strArray[i], count);
            }
        }

        for(Map.Entry key: charMap.entrySet()) {
            System.out.println(key.getKey() +" <> "+ key.getValue());
        }
        System.out.println("------------------");
        charMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::print);

        System.out.println("\n------------------");
        charMap.forEach((key, value) -> {
            System.out.println(key +"-"+ value);
        });
//        for (Map.Entry<Character, Integer> keyset : charMap.entrySet()) {
//            System.out.println(keyset.getKey() + " <> " + keyset.getValue());
//        }
    }


}