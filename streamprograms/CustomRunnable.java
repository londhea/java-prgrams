package com.techjivaa.fhirR4JsonConverter.streamprograms;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

class CustomRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread : " + Thread.currentThread().getName() +" "+ i);
        }
    }

    public static void main(String[] args) {

        CustomRunnable customRunnable = new CustomRunnable();
        Thread t1 = new Thread(customRunnable);
//        t1.start();  // It will create a thread for you
        t1.run();   // Work as a normal method

        Thread t2 = new Thread(customRunnable);
//        t2.start();
        t2.run();

        Vector<String> strings = new Vector<>();
        Enumeration enumeration = strings.elements();
    }
}