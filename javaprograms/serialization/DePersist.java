package com.techjivaa.fhirR4JsonConverter.javaprograms.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

class DePersist {
    public static void main(String args[]) {
        try {
            //Creating stream to read the object
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("F:\\J&K project\\FHIR\\fhirR4JsonConverter\\fhirR4JsonConverter\\src\\main\\resources\\serialization.txt"));
            Student s = (Student) in.readObject();
            //printing the data of the serialized object
            System.out.println(s.id + " " + s.name + " " + s.contact);
            //closing the stream
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

