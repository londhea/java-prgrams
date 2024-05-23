package com.techjivaa.fhirR4JsonConverter.streamprograms;

public class CustomException extends RuntimeException {


    public CustomException() {
        super();
    }

    // Pass message as a parametwrized constructor
    public CustomException(String msg) {
        super(msg);
    }
}
