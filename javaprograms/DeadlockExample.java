package com.techjivaa.fhirR4JsonConverter.javaprograms;

public class DeadlockExample {
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println(Thread.currentThread().getName() + " acquired resource1");
                try {
                    Thread.sleep(100); // Introducing delay to increase the likelihood of deadlock
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " waiting for resource2");
                synchronized (resource2) {
                    System.out.println(Thread.currentThread().getName() + " acquired resource2");
                }
            }
        }, "Thread-1");

        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println(Thread.currentThread().getName() + " acquired resource2");
                try {
                    Thread.sleep(100); // Introducing delay to increase the likelihood of deadlock
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " waiting for resource1");
                synchronized (resource1) {
                    System.out.println(Thread.currentThread().getName() + " acquired resource1");
                }
            }
        }, "Thread-2");

        thread1.start();
        thread2.start();
    }
}
