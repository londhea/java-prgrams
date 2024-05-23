package com.techjivaa.fhirR4JsonConverter.javaprograms;

public class RemoveWhiteSpaceFromString {

    public static void main(String[] args) {

        String str = "I am Akshay Londhe";
//        str= str.toLowerCase();

        String result = removeWhitespace(str);
        System.out.println("After removing whitespace : "+ result);
    }

    private static String removeWhitespace(String str) {

        // One method
      /*  String replace = str.replace(" ", "");
        return replace;
     */

        // Second method
        StringBuilder sb = new StringBuilder();

        for(int i =0; i<str.length(); i++) {

            if(!Character.isWhitespace(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }
}
