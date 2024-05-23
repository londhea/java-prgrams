package com.techjivaa.fhirR4JsonConverter.javaprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NetSpiExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String input = "Testing is a boring job";
        String output = replaceConsecutiveXVowels(input);
        System.out.println(output);
    }

    public static String replaceConsecutiveXVowels(String input) {
        // Define the xvowels set
        Set<Character> xvowels = new HashSet<>(Arrays.asList('a','b', 'e', 'i', 'o', 'u', 't'));
        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < input.length()) {
            char currentChar = input.charAt(i);

            // Check if the current character is an xvowel
            if (xvowels.contains(Character.toLowerCase(currentChar))) {
                char firstXVowel = currentChar;
                // Look ahead to find the end of the sequence of xvowels
                int j = i + 1;
                while (j < input.length() && xvowels.contains(Character.toLowerCase(input.charAt(j))) && i > 1) {
                    j++;
                }

                // Append the uppercase version of the first xvowel in the sequence
                result.append(Character.toUpperCase(firstXVowel));
                i = j; // Move the index to the end of the sequence
            } else {
                // Append non-xvowel characters as they are
                result.append(currentChar);
                i++;
            }
        }

        return result.toString();
    }

}
