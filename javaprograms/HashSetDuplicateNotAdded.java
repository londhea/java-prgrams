package com.techjivaa.fhirR4JsonConverter.javaprograms;

import java.util.HashSet;
import java.util.Set;

public class HashSetDuplicateNotAdded {

    public static void main(String[] args) {

        Set<Integer> duplicateSet = new HashSet<>();

        duplicateSet.add(10);
        duplicateSet.add(10);
        duplicateSet.add(10);

        System.out.println(duplicateSet);

        HashSetDuplicateNotAdded hello = new HashSetDuplicateNotAdded();
        System.out.println("Hashcode : "+ hello.hashCode());

    }
}
