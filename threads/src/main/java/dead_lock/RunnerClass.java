package main.java.dead_lock;

public class RunnerClass {
    public static void main(String[] args) throws Exception {
    System.out.println("Entered Main");
    Counter c = new Counter();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
        System.out.println("Waiting for threads to complete execution...");
        t1.join();
        t2.join();

    System.out.println("ExistMain");

    }
}

