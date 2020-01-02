package main.java.race_conditions;

public class RunnerClass {
    public static void main(String[] args) throws InterruptedException {
    System.out.println("Entered Main");
        UpdateCounter uc  = new UpdateCounter();

        Thread t1 = new Thread(uc);
        Thread t2 = new Thread(uc);
        t1.start();
        t2.start();
        t1.setName("t1");t2.setName("t2");



        UpdateCounter uc1  = new UpdateCounter();
        Thread t3= new Thread(uc1);
        Thread.sleep(3000);
        t3.start();
        t3.setName("t3");
        //t3.start();
    System.out.println("Exist Main");
    }
}
