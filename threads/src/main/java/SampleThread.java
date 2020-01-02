package main.java;

public class SampleThread extends  Thread {
    @Override
    public void run(){
        System.out.println("SampleThread.run-" + Thread.currentThread().getName());
    }
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Entered Main");
        SampleThread sampleThread = new SampleThread();
        System.out.println("SampleThread.main-" + Thread.currentThread());
        Thread t1 = new Thread(sampleThread);
        t1.setName("t1");
        t1.start();
        t1.run();// This runs just like anormal method in MAIN thread.
        Thread.sleep(500);
        //sampleThread.start();
        System.out.println("Exist Main");
    }

}
