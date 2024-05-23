package com.techjivaa.fhirR4JsonConverter.threadprograms;

public class MyThread extends Thread {

    @Override
    public void run() {
           for(int i=1; i<=5; i++) {
            System.out.println(Thread.currentThread().getName() +" :: Thread : "+ i);
        }
    }


    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();
        System.out.println(Thread.currentThread().getName());

        myThread.start(); // Call to the thread run() method internally
        myThread.run(); // Call as a normal run method
        try {
            myThread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        myThread2.start();
//        myThread2.start(); // When you call again start() methid It will gives java.lang.IllegalThreadStateException

        myThread3.start();
        myThread3.setPriority(1);



    }
}
