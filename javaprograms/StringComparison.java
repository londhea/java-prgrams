package com.techjivaa.fhirR4JsonConverter.javaprograms;

public class StringComparison {

    public static void main(String[] args) {

        String str1= "Hello";
        String str2= "Hello";
        String str3= new String("Hello");
        String str4= new String("Hello").intern();
        String str5= new String("hello");

        System.out.println(str1 == str2);       // true
        System.out.println(str1 == str3);       // false
        System.out.println(str1.equals(str2));  // true
        System.out.println(str1 == str4);       // true
        System.out.println(str1.equals(str5));  // false
        System.out.println(str3 == str5);       // false
        System.out.println(str3.equals(str5));  // false
        System.out.println(str3 == str4);       // false
        System.out.println(str3.equals(str4));  // true

    }
}
