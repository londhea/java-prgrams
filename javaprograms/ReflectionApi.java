package com.techjivaa.fhirR4JsonConverter.javaprograms;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Student12{

    private long studId;
    private String studName;
    private long studAge;
    private String studContact;
    private String studLocation;

    public long getStudId() {
        return studId;
    }

    public void setStudId(long studId) {
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public long getStudAge() {
        return studAge;
    }

    public void setStudAge(long studAge) {
        this.studAge = studAge;
    }

    public String getStudContact() {
        return studContact;
    }

    public void setStudContact(String studContact) {
        this.studContact = studContact;
    }

    public String getStudLocation() {
        return studLocation;
    }

    public void setStudLocation(String studLocation) {
        this.studLocation = studLocation;
    }

    public String getStudentName() {
        return "Akshay";
    }

    @Override
    public String toString() {
        return "Student12{" +
                "studId=" + studId +
                ", studName='" + studName + '\'' +
                ", studAge=" + studAge +
                ", studContact='" + studContact + '\'' +
                ", studLocation='" + studLocation + '\'' +
                '}';
    }
}

public class ReflectionApi {
    public static void main(String[] args) {

        Class<?> student = null;
        try {
            student = Class.forName("Student12");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Student : " + student);

        Student12 s1 = new Student12();

        Class<? extends Student12> aClass = s1.getClass();

        for (Field field : aClass.getDeclaredFields()) {
            System.out.println("Field : " + field.getName());
        }

        for (Method method : aClass.getDeclaredMethods()) {
            System.out.println("Method : " + method.getName());
        }

        System.out.println("" + aClass.isArray());
        System.out.println("" + aClass.isInterface());
        System.out.println("" + aClass.isAnnotation());
        System.out.println("" + aClass.isEnum());
        System.out.println("" + aClass.isLocalClass());
    }

}
