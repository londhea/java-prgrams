package com.techjivaa.fhirR4JsonConverter.javaprograms;

public class PrimeNumber {

    public static void main(String[] args) {

        int num = 10;
        boolean flag = false;
//        System.out.println("Prime : " + checkPrime(16));
//        System.out.println("Prime : " + checkPrime(29));
//        System.out.println("Prime : " + checkPrime(151));
//        System.out.println("Prime : " + checkPrime(21));
        System.out.println("Prime : " + checkPrime(53));
    }

    private static boolean checkPrime(int number) {

        if (number == 0 || number == 1) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
