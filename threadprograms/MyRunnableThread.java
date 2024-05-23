package com.techjivaa.fhirR4JsonConverter.threadprograms;

import java.util.Date;

public class MyRunnableThread implements Runnable {

    @Override
    public void run() {
        for(int i=1; i<=5; i++) {
            System.out.println(new Date());
            System.out.println(Thread.currentThread().getName() +" :: Thread : "+ i);
            if(i==3) {
                try{
                    System.out.println(new Date());
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.getMessage();
                }
            }

        }
    }

    public static void main(String[] args) {
        MyRunnableThread myRunnableThread = new MyRunnableThread();

        // Runnable methods don' thave start method so, we need to pass object ot Thread constructor
        Thread t1 = new Thread(myRunnableThread);
        t1.start();
    }
}
