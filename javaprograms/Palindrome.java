package com.techjivaa.fhirR4JsonConverter.javaprograms;

public class Palindrome {

    public static void main(String[] args) {

        String str = "Madam";
        str = str.toLowerCase();

        StringBuilder sb = new StringBuilder();
//        char str1[] = str.toLowerCase().toCharArray();
//
//        for (int i = str.length() - 1; i >= 0; i--) {
//            sb.append(str1[i]);
//        }

//        char str1[] = str.toLowerCase().toCharArray();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        System.out.println("Reverse String is : "+ sb);

        if (sb.toString().equals(str.toLowerCase())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }



    }
}
