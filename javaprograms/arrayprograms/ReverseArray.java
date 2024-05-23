package com.techjivaa.fhirR4JsonConverter.javaprograms.arrayprograms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collector;

public class ReverseArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        arr.stream()
                .sorted(Comparator.reverseOrder()).forEach(System.out::println);

//        System.out.println("Reversed array: " + );

        int m = 3;
        ArrayList<Integer> reversedArr = reverseArray(arr, m);
        System.out.println("Reversed array: " + reversedArr);
    }

    public static ArrayList<Integer> reverseArray(ArrayList<Integer> arr, int m) {
        // Create a new ArrayList to store the reversed elements
        ArrayList<Integer> reversedList = new ArrayList<>(arr);

        // Convert the ArrayList to an int[] array
        int[] newArray = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            newArray[i] = arr.get(i);
        }

        // Reverse the subarray after position 'm'
        int start = m;
        int end = newArray.length - 1;
        while (start < end) {
            int temp = newArray[start];
            newArray[start] = newArray[end];
            newArray[end] = temp;
            start++;
            end--;
        }

        // Update the reversedList with the reversed elements
        for (int i = 0; i < newArray.length; i++) {
            reversedList.set(i, newArray[i]);
        }

        return reversedList;
    }
}
