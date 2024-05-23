
package com.techjivaa.fhirR4JsonConverter.javaprograms;
import java.util.*;


class StudentInfo {
    private int rollNo;
    private String name;
    private String contact;
//    private String 123K;

    public StudentInfo() {
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}


public class EncapsulateClass {

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo();

        String str = "Hello";
        String str1 = new String("Hello").intern();

        System.out.println(str == str1);
        System.out.println(str.equals(str1));


    }

}
