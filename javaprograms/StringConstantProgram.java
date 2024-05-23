package com.techjivaa.fhirR4JsonConverter.javaprograms;

public class StringConstantProgram {

    public static void main(String[] args) {

        String str = "Hello";
        String str1 = new String("Hello");
        String str2 = new String("Hello").intern();

        System.out.println(str);
        System.out.println(str1);
        System.out.println(str.equals(str1));
        System.out.println(str == str1);
        System.out.println(str == str2);

    }
}
