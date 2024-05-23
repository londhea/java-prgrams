package com.techjivaa.fhirR4JsonConverter.javaprograms;

public class FactorialNumber {
    public static void main(String[] args) {

        int num = 6;
        int result = factorialOfNumber(num);
        System.out.println("Factorial of "+ num +" is "+ result);
    }

    private static int factorialOfNumber(int number) {
        if(number == 1){
            return number;
        } else {
            return (number * factorialOfNumber(number - 1));
        }
    }
}
