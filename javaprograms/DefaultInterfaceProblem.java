package com.techjivaa.fhirR4JsonConverter.javaprograms;

interface A {
    void print();

    default void hi() {
        System.out.println("A");
    }
}

interface B {
    void print();

    default void hi() {
        System.out.println("B");
    }
}


public class DefaultInterfaceProblem implements A, B {

    @Override
    public void print() {
        System.out.println("This is for A Interface");
    }

    public static void main(String[] args) {
        DefaultInterfaceProblem d = new DefaultInterfaceProblem();
        d.hi();

        A a = new DefaultInterfaceProblem();
        a.print();

        B b = new DefaultInterfaceProblem();
        b.print();
    }

    public void hi() {
        A.super.hi();
        B.super.hi();
    }


}
