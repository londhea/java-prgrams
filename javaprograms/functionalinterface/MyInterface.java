package com.techjivaa.fhirR4JsonConverter.javaprograms.functionalinterface;

public interface MyInterface {
    static void show() {
        System.out.println("Inside static method");
    }

    default void showDefault() {
        System.out.println("Inside static method");
    }
}
