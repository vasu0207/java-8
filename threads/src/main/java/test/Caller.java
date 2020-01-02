package main.java.test;

import main.java.SampleThread;
import main.java.race_conditions.Counter;

public class Caller  extends Thread{

    public static synchronized void increaseCounter(){

       // for (int i =0; i < 40; i++) {
            Counter.count++;
            System.out.println("ClassLevel - Thread Name : " + Thread.currentThread().getName()+" { count : " + Counter.count +"}");
       // }
    }
    public synchronized void increaseCounterObjectLevel(){
       // for (int i =0; i < 40; i++) {
            Counter.count++;
            System.out.println("ObjectLevel - Thread Name : " + Thread.currentThread().getName()+" { count : " + Counter.count+"}");
       // }
    }
    @Override
    public void run(){
        increaseCounter();
        increaseCounterObjectLevel();
        increaseCounter();
        increaseCounterObjectLevel();
        increaseCounter();
        increaseCounterObjectLevel();
    }
    public static void main(String[] args) {
        System.out.println("Entered Main");
        Caller c1 = new Caller();
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c1);

        t1.start(); t2.start();

        System.out.println("Exist Main");
    }


}
