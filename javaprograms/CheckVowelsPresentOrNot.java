package com.techjivaa.fhirR4JsonConverter.javaprograms;

public class CheckVowelsPresentOrNot {

    public static void main(String[] args) {

        String str = "I am Akshay Londhe";
        str = str.toLowerCase();
        int count =0;

        String strVowels = "aeiou";
        if (str.length() > 0) {

            for(int i=0; i<str.length(); i++) {

                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    count++;
                }
//                if(strVowels.contains(String.valueOf(str.charAt(i)))) {
//                    count++;
//                }
            }
        }

        System.out.println("Vowels present in string are : "+ count);
    }
}
