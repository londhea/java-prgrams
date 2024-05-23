package com.techjivaa.fhirR4JsonConverter.javaprograms.examcode;

public class EmployeeOne {

    private int empId;
    private String name;
    private int age;
    private String gender;
    private String salary;

    public EmployeeOne(){

    }

    public EmployeeOne(int empId, String name, int age, String gender, String salary) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
