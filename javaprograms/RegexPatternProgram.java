package com.techjivaa.fhirR4JsonConverter.javaprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPatternProgram {

    public static void main(String[] args) {


        String regex = "[a-z0-9]*";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher("7568493795809485");

        System.out.println("Match : "+ m);

        // Remove Special Characters from String

        String str1 = "#$^hello7644!()";

        str1 = str1.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("After removed : "+ str1);


    }
}
