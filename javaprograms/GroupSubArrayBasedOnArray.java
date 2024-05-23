package com.techjivaa.fhirR4JsonConverter.javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupSubArrayBasedOnArray {

    public static void main(String[] args) {

        int[] input = {11,1000,1004,1275,10005,10177,10240,10641,10903,11495,11628,15629,18630,21631,21680,23745,24827,28828,33955,44087,48755,50073};
        List<List<Integer>> output = groupConsecutiveNumbers(input);

        // Print the output
        for (List<Integer> group : output) {
            System.out.println(group);
        }
    }

    public static List<List<Integer>> groupConsecutiveNumbers(int[] input) {
        List<List<Integer>> output = new ArrayList<>();

        List<Integer> currentGroup = new ArrayList<>();
        currentGroup.add(input[0]);

        for (int i = 1; i < input.length; i++) {
            if (input[i] - input[i - 1] <= 500) {
                currentGroup.add(input[i]);
            } else {
                output.add(new ArrayList<>(currentGroup));
                currentGroup.clear();
                currentGroup.add(input[i]);
            }
        }
        output.add(currentGroup);
        return output;
    }
}
