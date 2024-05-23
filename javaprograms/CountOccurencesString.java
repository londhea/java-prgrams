package com.techjivaa.fhirR4JsonConverter.javaprograms;

public class CountOccurencesString {

    public static void main(String[] args) {

        String str = "hello";
        String str1 = "hihellookhello";

        int count = findCountOccurences(str1, str);
        System.out.println("Count : "+ count);

    }

    public static int findCountOccurences(String s2, String s1) {

        int count = 0;
        int index = 0;
        while ((index = s2.indexOf(s1, index)) != -1) {
            count++;
            index += s1.length();
        }
        return count;
    }
}
