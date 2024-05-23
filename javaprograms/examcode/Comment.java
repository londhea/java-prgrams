package com.techjivaa.fhirR4JsonConverter.javaprograms.examcode;

class Test //implements Cloneable
{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Comment  {

    public static void main(String[] args) throws CloneNotSupportedException {
        Test test = new Test();
        Test test1 = (Test) test.clone();
        System.out.println(test.hashCode());
        System.out.println(test1.hashCode());
    }

}

