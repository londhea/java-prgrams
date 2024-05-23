package com.techjivaa.fhirR4JsonConverter.javaprograms;

import java.util.*;

public class IdentifyHashMapExample {

    public static void main(String[] args) {

        Map<String, String> strList = new IdentityHashMap();

        strList.put("Ravi", "Pune");
        strList.put("Akshay", "Mumbai");
        strList.put("Ram", "Kolkata");
        strList.put("Abhi", "Pune");
        strList.put("Akshay", "Delhi");

        System.out.println(strList);

        System.out.println("----------------");

    }
}
