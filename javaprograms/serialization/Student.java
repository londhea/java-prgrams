package com.techjivaa.fhirR4JsonConverter.javaprograms.serialization;

import org.springframework.data.annotation.Transient;

import java.io.Serializable;

public class Student implements Serializable {
    int id;
    String name;
    transient String contact;

    public Student(int id, String name, String contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }
}  