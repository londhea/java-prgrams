//package com.techjivaa.fhirR4JsonConverter.javaprograms;
//
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//class Animal {
//
//    protected Object sound() throws FileNotFoundException {
//        System.out.println("In Animal class");
//        return new Animal();
//    }
//}
//
//class Cat extends Animal {
//
//    @Override
//    protected Object sound() throws FileNotFoundException {
//        System.out.println("In Animal class");
//        return new Animal();
//    }
//
//    String sound2(){
//        System.out.println("In Cat class");
//        return "hello";
//    }
//}
//
//public class MethodOverridingExample {
//
//    public static void main(String[] args) {
//
//        System.out.println("\nUsing Parent class object");
//        Animal a = new Animal();
//        a.sound();
//
//        System.out.println("\nUsing child class object");
//        Cat b = new Cat();
//        b.sound();
//
//        System.out.println("\nUsing Parent class object with reference of child class");
//        Animal c = new Cat();
//        c.sound();
//    }
//
//}
