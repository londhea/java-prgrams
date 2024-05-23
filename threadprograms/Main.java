package com.techjivaa.fhirR4JsonConverter.threadprograms;

import java.util.HashSet;

class MyClass {
    private int id;

    public MyClass(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    // Override hashCode() and equals() methods

    @Override
    public int hashCode() {
        return id; // Using id as hash code
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MyClass other = (MyClass) obj;
        return id == other.id;
    }
}

public class Main {
    public static void main(String[] args) {
        HashSet<MyClass> set = new HashSet<>();

        // Adding new objects to HashSet
        set.add(new MyClass(1));
        set.add(new MyClass(2));
        set.add(new MyClass(3));
        set.add(new MyClass(1)); // Duplicate object with the same id, but not considered duplicate in HashSet

        // Displaying elements of HashSet
        System.out.println("HashSet elements:");
        for (MyClass obj : set) {
            System.out.println("ID: " + obj.getId());
        }
    }
}