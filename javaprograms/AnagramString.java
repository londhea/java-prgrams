package com.techjivaa.fhirR4JsonConverter.javaprograms;

public class AnagramString {

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        System.out.println(str1.substring(0,2) + str1.substring(2+1, str1.length()));

        boolean flag = isAnagram(str1, str2);

        System.out.println("Anaggram : " + flag);

//        char[] str1CharArray = str1.toCharArray();
//        char[] str2CharArray = str2.toCharArray();
//
//        for (int i = 0; i < str1CharArray.length; i++) {
//            for (int j = 0; j < str2CharArray.length; i++) {
//                if (str1CharArray[i] == str2CharArray[i]) {
//
//                }
//            }
//        }

    }

    //function checks if the strings are anagram or not
    public static boolean isAnagram(String str1, String str2) {
//comparing length
        if (str1.length() != str2.length()) {
//returns false if the strings are not equal in length
            return false;
        }
//converts string into character array
        char[] chars = str1.toCharArray();

//loop iterates over the array
        for (char c : chars) {
//finds the index
            int index = str2.indexOf(c);
            if (index != -1) {
//the substring() method returns a new string that is a substring of this string
                str2 = str2.substring(0, index) + str2.substring(index + 1, str2.length());
            } else {
                return false;
            }
        }
        return str2.isEmpty();
    }
}
