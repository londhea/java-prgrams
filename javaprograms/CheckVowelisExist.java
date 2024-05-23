package com.techjivaa.fhirR4JsonConverter.javaprograms;

public class CheckVowelisExist {
    public static void main(String[] args) {

        String str = "RMTPDS";
        str =str.toLowerCase();

        String vowels = "aeiou";
        boolean isVowelPresent = false;



        System.out.println(str.matches("[aeiou]*"));
        System.out.println(str.matches("[aeiou].*"));
        System.out.println(str.matches(".*[aeiou].*"));
    }

    public static boolean vowelIsExist(String str1) {
        String vowels = "aeiou";

        for(int i=0; i<str1.length(); i++) {
            char ch = str1.charAt(i);
            if(vowels.indexOf(ch) != -1) {
                return false;
            }
        }
        return true;
    }
}
