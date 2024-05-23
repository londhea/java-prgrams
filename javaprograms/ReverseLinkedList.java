package com.techjivaa.fhirR4JsonConverter.javaprograms;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseLinkedList {
    public static void main(String[] args) {

        List<String> strList = new LinkedList<>();
        strList.add("Ganesh");
        strList.add("Akshay");
        strList.add("Avinash");
        strList.add("Rahul");
        strList.add("Vivek");
        strList.add("Shyam");
        System.out.println("List : "+ strList);

        List<String> sortedList = new LinkedList<>();
        ((LinkedList<String>) strList).descendingIterator().forEachRemaining(sortedList::add);
        System.out.println("Sorted List : "+ sortedList);

        List<String> collectedList = strList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println("Collected List : "+ collectedList);


    }
}
