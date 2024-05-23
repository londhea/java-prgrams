package com.techjivaa.fhirR4JsonConverter.javaprograms;

public class CountSubstringOccurenceInString {

    public static void main(String[] args) {

        String searchString = "hi";
        String word = "hi guys !..hi teams hi rfjklsflk hi hi";

        int occurenceCount = findOccurenceFromString(word, searchString);

        System.out.println("Occurence of : " + searchString + ": " + word + " is => " + occurenceCount);

    }

    public static int findOccurenceFromString(String s1, String s2) {
        int index = 0;
        int count = 0;

        while ((index = s1.indexOf(s2, index)) != -1) {
            count++;
            index+= s2.length();
        }
        return count;
    }
}
