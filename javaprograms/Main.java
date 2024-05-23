package com.techjivaa.fhirR4JsonConverter.javaprograms;

//abstract class MyAbstractClass {
//    abstract void method();
//}
//
//class MyClass extends MyAbstractClass {
//    @Override
//    void method() {
//        System.out.println("Implemented method");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        MyAbstractClass obj = new MyClass(); // Object of subclass extending abstract class
//        obj.method(); // Calling method of the abstract class
//    }
//}

interface MyInterface {
    public void displayName();
}

class MyClass implements MyInterface {
    @Override
    public void displayName() {
        System.out.println("Implemented method");
    }
}

public class Main {
    public static void main(String[] args) {
        MyInterface obj = new MyClass(); // Object of subclass extending abstract class
        obj.displayName(); // Calling method of the abstract class
    }
}