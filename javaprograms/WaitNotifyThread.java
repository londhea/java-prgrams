package com.techjivaa.fhirR4JsonConverter.javaprograms;

import java.util.stream.Collectors;

class MyThread extends Thread {

    int total = 0;
//    @Override
//    public void run() {
//
//        for (int i = 0; i < 10; i++) {
//            total = total + 100;
//        }
//    }
// Changed to this as below :
    @Override
    public void run() {

        synchronized (this) {
            System.out.println("Name 1 - in run() : "+ this.getName());
            System.out.println("Name 2 - in run() : "+ Thread.currentThread().getName());
            for (int i = 0; i < 10; i++) {
                total = total + 100;
            }
            // This will notify and release the lock
            this.notify();
        }

    }
}

public class WaitNotifyThread {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();

        // Here, two threads are available. One is main thread and user thread (myThread).
        // This line will execute by main thread but main thread can't calculate total earning
        // untill user thread calculate the total.
        // Here, Main thread should have to wait.

        synchronized (myThread) {
            try {
                System.out.println("Name 1 : "+ myThread.getName());
                System.out.println("Name 2 : "+ Thread.currentThread().getName());
                // sending myThread thread to waiting state
                myThread.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Total Earning is : " + myThread.total +" Rs.");
        }

//        String str = "Hello world";
//
//        str.toLowerCase().chars()
//                .mapToObj(c->(char) c)
//                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(item -> item.getValue() == 1)
//                .forEach(System.out::println);
    }
}
