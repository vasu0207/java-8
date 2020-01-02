package main.java.race_conditions;

import main.java.SampleThread;

public class UpdateCounter extends Thread {


    public void increaseCounter(){
        synchronized(SampleThread.class) {
            Counter.count++;
            System.out.println("Thread Name : " + Thread.currentThread().getName()+" { count : " + Counter.count+"}");
        }
    }
    @Override
    public void run(){
        increaseCounter();
        increaseCounter();
        increaseCounter();
    }
}
