package com.src.java;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReteranantThreads {




        ReentrantReadWriteLock reentrantLock = new ReentrantReadWriteLock();
        Lock writeLock = reentrantLock.writeLock();
        Lock readLock = reentrantLock.readLock();

        List<String> list = new ArrayList<>();

    public void add(String name) {
        System.out.println("Add : " + name );
        writeLock.lock();
        try{
            list.add(name);
        } catch(Exception e) {
            e.printStackTrace();;
        }
        writeLock.unlock();

    }

    public void remove (String name){
        System.out.println("remove : " + name );
        writeLock.lock();
        try{
            list.remove(name);
        } catch(Exception e) {
            e.printStackTrace();;
        }
        writeLock.unlock();

    }

public static void main(String[] args) {
System.out.println("Entered Main");
    ReteranantThreads rt = new ReteranantThreads();
    rt.add("demo");
    rt.add("demo1");
    rt.remove("demo1");

  //  Thread t = new Thread(rt);
System.out.println("Exist Main");
}


}
