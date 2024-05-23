package com.techjivaa.fhirR4JsonConverter.javaprograms.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;

class Persist {
    public static void main(String args[]) {
        try {
            //Creating the object
            Student s1 = new Student(211, "ravi", "7972707880");
            //Creating stream and writing the object
            FileOutputStream fout = new FileOutputStream("F:\\J&K project\\FHIR\\fhirR4JsonConverter\\fhirR4JsonConverter\\src\\main\\resources\\serialization.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("success");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
