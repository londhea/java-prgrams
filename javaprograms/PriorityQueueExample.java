package com.techjivaa.fhirR4JsonConverter.javaprograms;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<>();

        // Add elements to the priority queue
        pq.add("Banana");
        pq.add("Apple");
        pq.add("Orange");
        pq.add("Mango");
        pq.add("Custurd Apple");

        System.out.println("Highest Priority Element : "+ pq.peek()); // this return the highest priority element
        System.out.println("Removed Highest Priority Element : "+ pq.poll()); // this returns list by removing the highest priority element



        System.out.println(pq);
    }
}
