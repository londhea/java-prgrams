package com.techjivaa.fhirR4JsonConverter.javaprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapFailFast {

    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();

        // Add some elements to the HashMap
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);

        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }

        Iterator iterator= hashMap.keySet().iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }
    }
}
