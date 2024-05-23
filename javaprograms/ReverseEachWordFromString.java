package com.techjivaa.fhirR4JsonConverter.javaprograms;

public class ReverseEachWordFromString {
    public static void main(String[] args) {
        /*
        String str = "My name is Akshay";

        String[] words = str.split(" ");

        for (String word : words) {
            if (word.length() > 0) {
                StringBuffer reversedWord = new StringBuffer();
                for (int i = word.length() - 1; i >= 0; i--) {
                    reversedWord.append(word.charAt(i));
                }
                System.out.print(reversedWord + " ");
            } else {
                System.out.println("Word : "+ word);
            }
        }
        */


        // One Solution

        String str = "My name is Akshay";

//        char[] chars = str.toCharArray();
//        StringBuffer sb = new StringBuffer();
//
//        for(char c : chars) {
//            if(c == ' ') {
//                System.out.println(c);
//            } else {
//                System.out.println(c);
//            }
//
//        }

        String[] words = str.split(" ");

        for (String word : words) {
            if (word.length() > 0) {
                StringBuffer reversedWord = new StringBuffer();
                for (int i = word.length() - 1; i >= 0; i--) {
                    reversedWord.append(word.charAt(i));
                }
                System.out.print(reversedWord + " ");
            } else {
                System.out.println("Word : "+ word);
            }
        }


        // Second Solution

        /*String str = "My name is Akshay";

        String[] words = str.split("\\s");

        StringBuilder revesedWord= new StringBuilder();

        // Reverse a String
//        StringBuilder revesedWord= new StringBuilder(str);
//        System.out.println("Reverse String : "+ revesedWord.reverse());

//        String reversedWord = "";

        for (String s : words) {
            StringBuilder sb = new StringBuilder(s);
            revesedWord.append(sb.reverse()+ " ");
        }

        System.out.println("Reversed Word : "+ revesedWord);*/

    }


}
