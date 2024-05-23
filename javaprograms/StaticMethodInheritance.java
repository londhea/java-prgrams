package com.techjivaa.fhirR4JsonConverter.javaprograms;

class Employee {
    private int id;
    private String name;

    public static void display(){
        System.out.println("In Employee class");
    }
}

class Student1 extends Employee{
    private int id;
    private String name;

    public static void display(){
        System.out.println("In Student class");
    }
}

public class StaticMethodInheritance {

    public static void main(String[] args) {

        Employee e = new Student1();
        e.display();  // We override static method, so, it will call the parent static method instead if child class method
        System.out.println("----------------");
        Employee e1 = new Employee();
        e1.display();
        System.out.println("----------------");
        Student1 s1 = new Student1();
        s1.display();
    }
}
