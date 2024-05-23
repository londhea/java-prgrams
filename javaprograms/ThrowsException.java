package com.techjivaa.fhirR4JsonConverter.javaprograms;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Company {

    public void display() throws IOException {

        File file = new File("F:\\J&K project\\FHIR\\fhirR4JsonConverter\\fhirR4JsonConverter\\src\\main\\resources\\" + "demo.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter writer = new FileWriter(file);
        writer.write("Hello Guys,\nAkshay is here..");

        writer.close();
    }
}

public class ThrowsException extends Company {

    public static void main(String[] args) {
        ThrowsException throwsException = new ThrowsException();
        try {
            throwsException.display();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
