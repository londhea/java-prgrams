package com.techjivaa.fhirR4JsonConverter.javaprograms;

public class Student {

    private int studId;
    private String studName;
    private String studLocation;

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getStudLocation() {
        return studLocation;
    }

    public void setStudLocation(String studLocation) {
        this.studLocation = studLocation;
    }

    public Student() {
    }

    public Student(int studId, String studName, String studLocation) {
        this.studId = studId;
        this.studName = studName;
        this.studLocation = studLocation;
    }
}
