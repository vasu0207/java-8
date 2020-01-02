package main.java.test;

import main.java.race_conditions.Counter;

public class Called {


    public void count(){

        System.out.println("Called.count" + Counter.count++);
    }

}
